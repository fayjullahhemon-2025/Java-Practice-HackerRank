import java.util.Scanner;
public class Solution2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        
        int myInt = input.nextInt();
        double myDouble = input.nextDouble();
        input.nextLine(); // Consume the newline character after reading the double
        String myString = input.nextLine();
        input.close();
        System.out.println("String: "+myString);
        System.out.println("Double: "+myDouble);
        System.out.println("Int: "+myInt);
    }
}