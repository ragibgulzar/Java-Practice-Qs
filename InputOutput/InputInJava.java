import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Input String Using BufferReader

public class InputInJava{
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the String: ");

        String s = br.readLine();

        System.out.println("You Entered the string: "+ s);
    }
}