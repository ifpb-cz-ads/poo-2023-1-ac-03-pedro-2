import java.util.Scanner;
public class AtividadePratica04 {
    public static void main(String[] args) {
        System.out.println("Insira o valor em metros cúbicos, logo em seguida o valor em dinheiro:");
        Scanner sc = new Scanner(System.in);
        float N = 2;
        float valor = 1;
        for (float i = 0; i < N;  i++){
            float x = sc.nextFloat();
            valor = valor * x;
        }
        System.out.println("valor em dinheiro: " + valor);
        sc.close();
    }
}