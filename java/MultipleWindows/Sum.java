package MultipleWindows;

import java.util.Scanner;

public class Sum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Type the first number: ");
        int v1 = input.nextInt();

        System.out.println("Type the second number: ");
        int v2 = input.nextInt();

        Functions values = new Functions(v1, v2);
        
        values.Print();
    }
}
