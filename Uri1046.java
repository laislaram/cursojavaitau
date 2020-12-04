import java.util.Scanner;
public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        int Hi, Hf,D;

        Hi = teclado.nextInt();
        Hf = teclado.nextInt();
    D = Hf - Hi;

    if (D <= 0){
        D = D + 24;
    }

    System.out.println("O JOGO DUROU "+D+" HORA(S)");

    }
}