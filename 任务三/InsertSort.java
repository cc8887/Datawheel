package Datawheel;

public class InsertSort {
	public static void main(String[] args) {
		int[] a = {1,2,9,4,6,2,4};
		stdDraw.setPenRadius(0.005);
		stdDraw.setPenColor(stdDraw.BLUE);
		stdDraw.setPenColor(stdDraw.MAGENTA);
		Sort(a);
/*		for (int i = 0; i < a.length; i++) {

		} */
		
	//	stdDraw paint = new stdDraw();

		//stdDraw.line(0.2, 0.2, 0.8, 0.2);
	//	stdDraw.rectangle(0.4, 0.5, 0.01, 0.4);
		
		//stdDraw.show();
	}//
	public static void Sort(int[] a) {
/*		stdDraw.setPenRadius(0.005);
		stdDraw.setPenColor(stdDraw.BLUE);
		stdDraw.setPenColor(stdDraw.MAGENTA);*/
		int tamp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i; j++) {
				tamp = a[j] > a[tamp] ? j : tamp;
			}
			int tampNum = a[a.length-1-i];
			a[a.length-1-i] = a[tamp];
			a[tamp] = tampNum;
			tamp = 0;
			stdDraw.clear();
			for (int j = 0; j < a.length; j++) {
				stdDraw.line(0.2+0.02*j, 0.2, 0.2+0.02*j, 0.2+0.01*a[j]);
			}
			stdDraw.show(500);
		}
		
		
	}
}
