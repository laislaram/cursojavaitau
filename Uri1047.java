import java.util.Scanner;
public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        int Hi, Hf, Mi, Mf,MiT, MfT, D, Hd, Md;

        Hi = teclado.nextInt();
        Mi = teclado.nextInt();
        Hf = teclado.nextInt();
        Mf = teclado.nextInt();
    
    D = (Hf*60 + Mf) - (Hi*60 + Mi);

    if (D <= 0){
        D = D + 24*60;
    }
    Hd = D/60;
    Md = D%60;

    System.out.println("O JOGO DUROU "+Hd+" HORA(S) E "+Md+" MINUTO(S)");

    }
}