import java.util.Scanner;

public class Uri1020 {
    public static void main (String args []){
        Scanner teclado = new Scanner (System.in);
        int INPUT, AR, A, M, D ;

        // entradas
        INPUT = teclado.nextInt();

        // calculo 
        A = INPUT/365;
        AR = INPUT%365;
        M = AR/30;
        D = AR%30;

        // saida : exibir o valores
        System.out.println( A + " ano(s)");
        System.out.println( M + " mes(es)");
        System.out.println( D + " dia(s)");

           } 
}