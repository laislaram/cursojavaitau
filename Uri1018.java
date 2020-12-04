import java.util.Scanner;

public class Uri1018 {

    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        int INPUT,N100,N50,N20,N10,N5,N2,N1,RESTO;

        // ENTRADAS
        INPUT = teclado.nextInt();

        // CALCULO
        N100 = INPUT/100;
        RESTO = INPUT%100;
        N50 = RESTO/50;
        RESTO = RESTO%50;
        N20 = RESTO/20;
        RESTO = RESTO%20;
        N10 = RESTO/10;
        RESTO = RESTO%10;
        N5 = RESTO/5;
        RESTO = RESTO%5;
        N2 = RESTO/2;
        RESTO = RESTO%2;
        N1 = RESTO;

        // SAIDA
        System.out.println(INPUT);        
        System.out.println(N100 +" nota(s) de R$ 100,00");
        System.out.println(N50 +" nota(s) de R$ 50,00");
        System.out.println(N20 +" nota(s) de R$ 20,00");
        System.out.println(N10 +" nota(s) de R$ 10,00");
        System.out.println(N5 +" nota(s) de R$ 5,00");
        System.out.println(N2 +" nota(s) de R$ 2,00");
        System.out.println(N1 +" nota(s) de R$ 1,00");

    }
}