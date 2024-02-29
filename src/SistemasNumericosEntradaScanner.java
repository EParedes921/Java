import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
//        String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;
        try {
            numeroDecimal = scanner.nextInt();//Integer.parseInt(numeroStr);
        } catch (Exception e){
            System.out.println("Error debe ingresar un número entero!");
            main(args);
            System.exit(0);
        }
        System.out.println("numeroDecimal = " + numeroDecimal);

        String numeroBinario = Integer.toBinaryString(numeroDecimal);
        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + numeroBinario;

        String numeroOctal = Integer.toOctalString(numeroDecimal);
        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + numeroOctal;

        String numeroHex = Integer.toHexString(numeroDecimal);
        String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + numeroHex;

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;

        System.out.println(mensaje);
    }
}
