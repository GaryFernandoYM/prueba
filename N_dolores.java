import java.util.Scanner;
public class N_dolores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float Guillermo,Luis,Juan,Total;
        System.out.println("\ningrese la cantidad de dinero de Guillermo: ");
        Guillermo = entrada.nextFloat();
        
        
      Luis = Guillermo/2;
      Juan = (Guillermo+Luis) /2;
       Total=Guillermo+Luis+Juan;
       System.out.println("\nla cantidad de dinero que tienen es: "+Total);
        



    }
    
}
