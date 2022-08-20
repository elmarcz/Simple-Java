// With the or operator only one of the conditions has to be true for the action to be carried out.

package java.Logical_Operators;

public class or {
    
    public void myOr(String[] args){
        int num1 = 12;
        int num2 = 12;

        if (num1 == 12 || num2 == 12) {
            System.out.println("One number is 12");
        }
    }
}