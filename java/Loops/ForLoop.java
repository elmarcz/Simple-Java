/* 
    The for loop is a programming control structure 
    in which the maximum number of iterations can be specified in advance.
*/
package java.Loops;

public class ForLoop {

    static boolean isTurnOnLight = true;

    public static void main(String[] args) {
        turnOnOffLight();
        for(int i = 0; i <= 10; i++) {
            printSOS();
        }
    }

    public static void printSOS(){
        System.out.println("... --- ...");
    }

    public static boolean turnOnOffLight(){
        isTurnOnLight = (isTurnOnLight) ? true: false;
        return isTurnOnLight;
    }
}
