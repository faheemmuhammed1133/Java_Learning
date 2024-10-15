public class ArrayEx {
   public static void main(String[] args) {
      double nums[]={1,2,3,4,5,6,7,8,9,10};
      double result=0;
      int i;
      for(i=0;i<nums.length;i++){
         result+=nums[i];
      }
      System.out.println("Sum  total  is = "+result);
   }
   
}
