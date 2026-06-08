import java.util.Scanner;
public class Solution1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        
        int myInt = Integer.parseInt(input.nextLine());
        double myDouble =Double.parseDouble(input.nextLine());
        String myString = input.nextLine();
        input.close();
        System.out.println("String: "+myString);
        System.out.println("Double: "+myDouble);
        System.out.println("Int: "+myInt);
    }
}