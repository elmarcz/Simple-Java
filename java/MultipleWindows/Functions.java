package MultipleWindows;

public class Functions {
    private int V1, V2, Resultado;

    public Functions(int v1, int v2){
        this.V1 = v1;
        this.V2 = v2;
    }

    public void Operation(){
        Resultado = V1 + V2;
    }

    public void Print(){
        Operation();
        System.out.println("The result is: " + Resultado);
    }
}
