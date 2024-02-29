public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(c);
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++){
            //c = c.concat(a).concat(b).concat("\n");   // 500 => 3ms, 1000 => 7ms, 10000 => 175ms, 100000 => 7159ms
            //c += a + b + "\n";                        // 500 => 33ms, 1000 => 39ms, 10000 => 99ms, 100000 => 3213ms
            sb.append(a).append(b).append("\n");        // 500 => 0ms, 1000 => 0ms, 10000 => 4ms, 100000 => 19ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
