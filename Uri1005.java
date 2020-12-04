import java.util.Scanner;

public class Uri1005{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double A, B, MEDIA;

        // entrada - ler as entrada de A e B
        A = teclado.nextDouble();
        B = teclado.nextDouble();

        // calculo da MEDIA
        MEDIA = ((A*3.5 + B*7.5)/11);

        // saida : exibir o valor de SOMA
        System.out.printf("MEDIA = %.5f%n", MEDIA);


    }
}