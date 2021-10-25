import java.util.Scanner;
public class OperadoresAritmeticos{
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero1, numero2,suma,resta,division,multiplicacion;
        System.out.println("Digite dos numeros: ");
        numero1 = entrada.nextInt();
        numero2 = entrada.nextInt();
        // xd
        suma = numero1+numero2;
        resta = numero1-numero2;
        division = numero1/numero2;
        multiplicacion  = numero1*numero2;
        System.out.println("la suma es: " +suma);
        System.out.println("la resta es: "+resta);
        System.out.println("la division es: "+division);
        System.out.println("la multiplicacion es: "+multiplicacion);
        entrada.close();
    }
    
 }