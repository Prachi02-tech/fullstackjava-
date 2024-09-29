import java.util.Scanner;

public class AsciiValues {
	public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        
        char character = sc.next().charAt(0); 
        int asciivalue = (int) character;
        
        System.out.println("The ASCII value of given character is :" + character + asciivalue);
    }
}

