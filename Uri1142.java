import java.util.Scanner;
public class Uri1142{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    int N,Num;
    Num=1;
    N = teclado.nextInt();
    for (int cont=1; cont<=N; cont++){
        System.out.println(Num +" " + (Num + 1) + " " + (Num + 2) + " PUM" );
        Num = Num+4;}

    }
}

