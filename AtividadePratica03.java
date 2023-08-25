import java.util.Scanner;
public class AtividadePratica03 {
    public static void main(String[] args) {
        System.out.println("Insira a base e a altura para o calculo da área:");
        Scanner sc = new Scanner(System.in);
        float N = 2;
        float resultado = 1;
        for (float i = 0; i < N;  i++){
            float x = sc.nextFloat();
            resultado = resultado * x;
        }
        System.out.println("Área: " + resultado);
        sc.close();
    }
}