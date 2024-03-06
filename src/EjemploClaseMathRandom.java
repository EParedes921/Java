import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        // Clase Math.random()
        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};
        double random = Math.random();
        System.out.println("random = " + random);
        random *= colores.length;
        System.out.println("random = " + random);
        random = Math.floor(random);
        System.out.println("random = " + random);
        System.out.println("colores = " + colores[(int)random]);

        // Clase Random
        Random randomObj = new Random();
//        int randomInt = randomObj.nextInt(7); // random entre 0 y 7 pero 7 no se incluye
        int randomInt = 15 + randomObj.nextInt(25-15+1); // random desde 15 hasta 25 incluye 25
        System.out.println("randomInt = " + randomInt);
        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);
    }
}
