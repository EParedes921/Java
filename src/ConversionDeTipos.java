public class ConversionDeTipos {
    public static void main(String[] args) {
        // Conversion de String a primitivo
        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "TruE";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        // Conversion de primitivo a String
        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        // Forma 1
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        // Forma 2
        otroNumeroStr = String.valueOf(otroNumeroInt+10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);

        // Conversion de int a short
        int i = 22768;
        short s = (short) i;
        // Si es necesario castear cuando es menor short < int
        System.out.println("s = " + s);
        long l = i;             // No es necesario castear cuando es mayor long > int
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        char b = (char) i;
        System.out.println("b = " + b);

        double d = i;           // No es necesario castear cuando es mayor double > int
        System.out.println("d = " + d);
        float f = (float)d;     // Si es necesario castear cuando es menor float < double
        System.out.println("f = " + f);


    }
}
