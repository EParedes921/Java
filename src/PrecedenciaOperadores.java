public class PrecedenciaOperadores {
    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 20;

        double promedio =  (i + j + (double)k) / 3;
        System.out.println("promedio = " + promedio);

        promedio = (i + j + k) / 3d * 10; // 42 / 3 * 10
        System.out.println("promedio = " + promedio);

        promedio =  ++i + j-- + ++k / 3d * 10; // (15 + 8) + 70
        System.out.println("promedio = " + promedio);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
