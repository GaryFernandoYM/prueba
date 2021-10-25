import java.util.Scanner;
public class tarea_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float salarioDelpersonal=1000,ventaxauto,sueldo;
        double bonificacion=0.05;
         System.out.println("\nla cantidad de autos vendidos es: ");
         ventaxauto= sc.nextInt();
         
         ventaxauto=150;
        sueldo =(float) (salarioDelpersonal+ventaxauto+bonificacion);
        System.out.println("\nel sueldo del trabajador es: "+sueldo);
        sc.close();

    }
    
}
