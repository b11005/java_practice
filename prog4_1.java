public class prog4_1{
    static final int N = 10;
    public static void main(String [] args){
	int[] array = {54, 20, 88, 30, 71, 29, 44, 9, 100, 31};
	int sum = 0;
	//int n = 10;
	int i;

	for (i = 0; i < N; i++)
	    sum += array[i];
	System.out.printf("Total = %d\n", sum);
    }
}