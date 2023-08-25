import java.util.Scanner;
public class AtividadePratica02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int soma = (a1 + a2 + a3) / 3;
        System.out.println(soma);
        sc.close();
    }
}