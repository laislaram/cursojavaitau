import java.util.Scanner;

public class Uri1006{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double A, B, C, MEDIA;

        // entrada - ler as entrada de A e B
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        // calculo da MEDIA
        MEDIA = ((A*2 + B*3 + C*5)/10);

        // saida : exibir o valor de SOMA
        System.out.printf("MEDIA = %.1f%n", MEDIA);


    }
}