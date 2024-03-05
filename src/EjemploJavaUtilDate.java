import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        Date fecha = new Date();
        System.out.println("fecha = " + fecha);

//        SimpleDateFormat df = new SimpleDateFormat("dd MMMM, yyyy");
//        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
//        SimpleDateFormat df = new SimpleDateFormat("dd/MMM/yyyy");
//        SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String fechaStr = df.format(fecha);

        long j = 0;
        for (int i = 0; i < 100000000; i++) {
            j += i;
        }
        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("Tiempo transcurrido en el for = " + tiempoFinal);
        System.out.println("fechaStr = " + fechaStr);
    }
}
