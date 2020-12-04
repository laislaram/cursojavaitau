import java.util.Scanner;

public class Uri1003{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int A, B, SOMA;

        // entrada - ler as entrada de A e B
        A = teclado.nextInt();
        B = teclado.nextInt();

        // somar ambos os valores e armazenar em SOMA
        SOMA = A + B;

        // saida : exibir o valor de SOMA
        System.out.println("SOMA = " + SOMA);


    }
}

