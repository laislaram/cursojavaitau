import java.util.Scanner;

public class Uri1019 {
    public static void main (String args []){
        Scanner teclado = new Scanner (System.in);
        int INPUT, RESTO, H, M, S;

        // entradas
        INPUT = teclado.nextInt();

        // calculo
        H=INPUT/(60*60);
        RESTO=INPUT%(60*60);
        M=RESTO/60;
        S=RESTO%60;

        //saida
        System.out.println(H+":"+M+":"+S);

    }
}

