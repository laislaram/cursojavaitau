import java.util.Scanner;

public class Uri1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int COD1, NUM1, COD2, NUM2;
        double V1, V2, VALOR;

        // entrada - ler as entradas
        COD1 = teclado.nextInt();
        NUM1 = teclado.nextInt();
        V1 = teclado.nextDouble();
        
        COD2 = teclado.nextInt();
        NUM2 = teclado.nextInt();
        V2 = teclado.nextDouble();

        // calculo da DIFERENCA
        VALOR= (NUM1*V1 + NUM2*V2);

        // saida : exibir o valor 
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", VALOR); 
   


    }
}
