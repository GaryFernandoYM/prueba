import java.util.Scanner;

public class PrimerScanner {
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       float numero;
       System.out.println("dijite el numero ");
       numero = entrada.nextFloat();
       System.out.println("El numero es "+numero); 
       entrada.close();
        
        
    }
    
}
