import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prog5_1{
    public static void main(String[] args) throws IOException{
	BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
	char[] buf = new char[256];
	int len, i;
	String line = stdReader.readLine();
	for (i = 0; i < line.length(); i++){
	    buf[i] = line.charAt(i);
	}
	buf[i] = '\0';

	len = 0;
	while (buf[len] != '\0')
	    len++;
	System.out.printf("Length = %d\n", len);
    }
}
