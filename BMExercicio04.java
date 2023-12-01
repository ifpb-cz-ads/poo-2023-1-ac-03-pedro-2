public class BMExercicio04 {
    public static void main(String[] args) {
        long long1 = 100;
        int int1 = 200;
        int int2 = int1 + (int) long1;
        //O resultado não pode ser obtido dessa soma por que os valores são de tipos diferentes.
        System.out.println(int2);
    }
}