public class prog4_2{
    static final int ENDDATA = -1;

    public static void main(String[] args){
	int[] array = {54, 20, 88, 30, 71, ENDDATA};
	int count = 0;
	int i = 0;

	while (array[i] != ENDDATA){
	    count++;
	    i++;
	}
	System.out.printf("Data Number = %d\n", count);
    }
}