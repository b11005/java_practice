public class prog4_4{
    static final int N = 10;

    public static void main(String[] args){
	int[] array = {540, -238,190, 22, -645, 832, 777, -542, 0, 395};
	int max, i;

	max = array[0];
	for(i = 0; i < N; i++){
	    if(max < array[i])
		max = array[i];
	}

	System.out.printf("max = %d\n", max);
    }
}