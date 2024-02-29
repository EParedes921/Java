import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error debe ingresar un número entero");
            main(args);
            System.exit(0);
        }
        System.out.println("numeroDecimal = " + numeroDecimal);

        String numeroBinario = Integer.toBinaryString(numeroDecimal);
        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + numeroBinario;
        System.out.println(resultadoBinario);

        String numeroOctal = Integer.toOctalString(numeroDecimal);
        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + numeroOctal;
        System.out.println(resultadoOctal);

        String numeroHex = Integer.toHexString(numeroDecimal);
        String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + numeroHex;
        System.out.println(resultadoHex);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
