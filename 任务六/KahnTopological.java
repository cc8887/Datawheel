package Datawheel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KahnTopological
{
	private List<Integer> result;   // �����洢�����
	private Queue<Integer> setOfZeroIndegree;  // �����洢���Ϊ0�Ķ���
	private int[] indegrees;  // ��¼ÿ�����㵱ǰ�����
	private int edges;
	private Digraph di;
	
	public KahnTopological(Digraph di)
	{
		this.di = di;
		this.edges = di.getE();
		this.indegrees = new int[di.getV()];
		this.result = new ArrayList<Integer>();
		this.setOfZeroIndegree = new LinkedList<Integer>();
		
		// �����Ϊ0�ļ��Ͻ��г�ʼ��
		Iterable<Integer>[] adjs = di.getAdj();
		for(int i = 0; i < adjs.length; i++)
		{
			// ��ÿһ���� v -> w 
			for(int w : adjs[i])
			{
				indegrees[w]++;
			}
		}
		
		for(int i = 0; i < indegrees.length; i++)
		{
			if(0 == indegrees[i])
			{
				setOfZeroIndegree.enqueue(i);
			}
		}
		process();
	}
	
	private void process()
	{
		while(!setOfZeroIndegree.isEmpty())
		{
			int v = setOfZeroIndegree.dequeue();
			
			// ����ǰ������ӵ��������
			result.add(v);
			
			// ������v���������б�
			for(int w : di.adj(v))
			{
				// ���ñߴ�ͼ���Ƴ���ͨ�����ٱߵ���������ʾ
				edges--;
				if(0 == --indegrees[w])   // ������Ϊ0����ô�������Ϊ0�ļ���
				{
					setOfZeroIndegree.enqueue(w);
				}
			}
		}
		// �����ʱͼ�л����ڱߣ���ô˵��ͼ�к��л�·
		if(0 != edges)
		{
			throw new IllegalArgumentException("Has Cycle !");
		}
	}
	
	public Iterable<Integer> getResult()
	{
		return result;
	}
}
