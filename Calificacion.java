import java.util.Scanner;
public class Calificacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // datos necesarios
        float participacion,primerExamen,segundoExamen,ExamenFinal,Calificacion;
        System.out.println("ingrese la calificacion de la participacion: ");
        participacion = sc.nextFloat(); 
        System.out.println("ingrese la calificacion del primer examen: ");
        primerExamen = sc.nextFloat();  
        System.out.println("ingrese la calificacion del segundo examen: ");
        segundoExamen = sc.nextFloat();  
        System.out.println("ingrese la calificacion del examen final: ");
        ExamenFinal = sc.nextFloat(); 
        /* sacamos los calculos */
        participacion*=0.10f;
        primerExamen*=0.25f;
        segundoExamen*=0.25f;
        ExamenFinal*=0.40f;
        //sumanos las notas
        Calificacion=participacion+primerExamen+segundoExamen+ExamenFinal;
        //imprimimos en pantalla la nota final
        System.out.println("la nota obtenida es:  "+Calificacion);




    }
    
}
