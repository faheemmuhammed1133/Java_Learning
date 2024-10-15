public class SumAverage {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=10;i++)
        {
            sum+=i;
        }
        System.out.println("Sum: "+sum);
        double average=sum/10.0;
        System.out.println("Average: " +average);
    }
}