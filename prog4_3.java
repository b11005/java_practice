public class prog4_3{
    static final int ENDDATA = -1;

    public static void main(String[] args){
	int[] array = {54, 20, 88, 30, 71, 29, 44, 9, ENDDATA};
	int count = 0;
	int sum = 0;
	double avg;
	int i = 0;

	while (array[i] != ENDDATA){
	    count++;
	    sum += array[i];
	    i++;
	}
	if (count == 0)
	    avg = 0.0;
	else
	    avg = (double)sum / count;
	System.out.printf("Data Average = %f\n", avg);
    }
}