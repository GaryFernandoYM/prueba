import java.util.Scanner;
public class Tarea_2 {
    public static void main(String[] args) { 
        Scanner entrada = new Scanner (System.in);
        float salariohora,horastrabajadas,sueldo;
        
        System.out.println("El sueldo del trabajador por hora es: ");
        salariohora = entrada.nextInt();
        System.out.println("Las horas trabadas en la semana es: ");
        horastrabajadas = entrada.nextInt();
        // fin
        sueldo= salariohora*horastrabajadas;
        System.out.println("El trabajador recibira: "+sueldo);
        entrada.close();


    
    }
    
}
