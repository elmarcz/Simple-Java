// The while loop repeats a block of code as long as a condition remains true.
package java.Loops;

public class WhileLoop {

    static boolean isTurnOnLight = true;

    public static void main(String[] args) {
        turnOnOffLight();

        while (isTurnOnLight) {
            printSOS();
        }
    }

    public static void printSOS(){
        int i = 1;
        while (isTurnOnLight && i <= 10){
            System.out.println("... --- ...");
        }
    }

    public static boolean turnOnOffLight(){
        isTurnOnLight = (isTurnOnLight) ? true: false;
        return isTurnOnLight;
    }
}