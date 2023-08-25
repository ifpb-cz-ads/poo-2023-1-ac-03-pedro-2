public class BMExercicio03 {
    public static void main(String[] args) {
        double taxa = 0.0825;
        double CodItem1 = 2.95;
        double CodItem2 = 3.50;
        double custo = CodItem1 + CodItem2;
        double taxaCalculada = custo * taxa;
        double taxa1 = taxaCalculada + CodItem1;
        double taxa2 = taxaCalculada + CodItem2;
        double NovoCusto = taxa1 + taxa2;
        boolean Precoalto = (NovoCusto > 10);
        System.out.println("O item 1 possui o valor: " + CodItem1 + "O item 2 possui o valor: " + CodItem2);
        System.out.println(custo);
        System.out.println(taxaCalculada);
        System.out.println(NovoCusto);
        System.out.println(Precoalto);
    }
}