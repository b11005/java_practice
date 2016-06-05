public class prog4_6{
    static final int N = 8;
    static int[] array = {70, 85, 100, 70, 65, 90, 70, 80};
    static int[] rank = new int[N];

    public static void main(String[] args){
	int i, j;
	for (i = 0; i < N; i++)
	    rank[i] = 1;

	for(i = 0; i < N; i++){
	    for (j = 0; j <N; j++){
		if (array[i] < array[j])
		    rank[i]++;
	    }
	}
	DispRank();
    }

    private static void DispRank(){
	int i;
	//System.out.printf("DATA: ");
	for (i = 0; i < N; i++)
	    System.out.printf("Rank %3d : %3d\n", rank[i], array[i]);
	//System.out.printf("\nRank : ");
	//for (i = 0; i < N; i++)
	//System.out.printf("%3d ", rank[i]);
    }
}
		