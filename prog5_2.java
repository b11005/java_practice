import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class prog5_2{
    static final int N = 10;
    static final int MAX = 9999;
    static final int MIN = -9999;

    static int m;
    static int[] array = {20, 29, 30, 44, 51, 66, 72, 78, 80, 87, 0};
    public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
	int low, high;

	System.out.printf("Input number, please\n");
	m = Integer.valueOf(stdReader.readLine()).intValue();

	high = higher();
	low = lower();

	System.out.printf("%d < ", m);
	if(high == MAX)
	    System.out.printf("no entry \n");
	else
	    System.out.printf("%d \n", high);

	System.out.printf("%d > ", m);
	if(low == MIN)
	    System.out.printf("No entry \n");
	else
	    System.out.printf("%d \n", low);
    }

    private static int higher(){
	int i;

	array[N] = MAX;
	i = 0;
	while (array[i] <= m)
	    i++;

	return array[i];
    }

	private static int lower(){
	    int i = 0;
	    array[N] = MIN;
	    while(array[i] >= m)
		i++;

	    return array[i];
	}

}