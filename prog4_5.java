public class prog4_5{
    static final int N = 10;
    public static void main(String[] args){
	int[] array = {540, -238, 190, 22, -645, 832, 777, -542, 0, 395};
	int min, i;
	min = 9999;
	for (i = 0; i < N; i++){
	    if (min > array[i])
		min = array[i];
	}
	System.out.printf("min = %d\n", min);
    }
}