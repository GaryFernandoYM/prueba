import java.util.Scanner;
public class SumaDeCalificanes {
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        float nota1,nota2,nota3,suma;
        System.out.println("dijite las tres notas: ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();
        suma = nota1+nota2+nota3;
        System.out.println("la suma de las notas es: "+suma);
        entrada.close();
    }
    
}
