public class MergeSortArr {
    public  static  void main(String[] arg){
        int[]a = {7};
        int[] b = {};
        int[] merged = merge(a,b);
        for (Integer i: merged) {
            System.out.print(i);
        }
    }
     public static int[] merge(int[] a, int[] b){
        if (a == null && b != null)return  b;
        if (b == null && a != null)return  a;
         int []res = new int[a.length+b.length] ;
         int aIndex = 0;
         int bIndex = 0;
         for (int i = 0; i <res.length;i++){
             int cur = 0;
             if (aIndex == a.length ||( bIndex!=b.length && b[bIndex] <= a[aIndex])){
                 cur = b[bIndex];
                 bIndex++;
             }

             else  if (bIndex == b.length || a[aIndex] <= b[bIndex]){
                 cur = a[aIndex];
                 aIndex++;
             }
             res[i] = cur;
         }
          return res;
     }

}
