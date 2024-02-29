public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);

        for (char a:arreglo){
            System.out.println(a);
        }
        for (char a:arreglo){
            System.out.print(a);
        }

        System.out.println("\ntrabalenguas = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;
        for (String a:arreglo2){
            System.out.println(a);
        }

        String archivo = "alguna.imagen.js";
        String[] archivoArr = archivo.split("\\."); // .split("[.]");
        l = archivoArr.length;
        System.out.println("l = " + l);
        System.out.println("archivoArr[0] = " + archivoArr[0]);
        System.out.println("archivoArr[1] = " + archivoArr[1]);
        System.out.println("archivoArr[2] = " + archivoArr[2]);

        for (String a:archivoArr){
            System.out.println(a);
        }
        System.out.println("extension = " + archivoArr[l-1]);
    }
}
