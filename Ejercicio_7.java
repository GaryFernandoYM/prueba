import java.util.Scanner;
public class Ejercicio_7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horastotales,semanas,dias,horas;
        System.out.println("ingrese las horas a calcular: ");
        horastotales = entrada.nextInt();

        semanas = horastotales / 168;
        dias = horastotales%168/24;
        horas=horastotales%24;
        System.out.println("el total de semanas es: "+semanas);
        System.out.println("el total de dias es: "+dias);
        System.out.println("el total de horas es: "+horas);
    
    }
    
}
