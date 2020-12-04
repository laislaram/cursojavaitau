import java.util.Scanner;
public class Uri1073{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    int valor,qd=0;
    valor = teclado.nextInt();

    for (int cont=1; cont<=valor; cont++){
        if ( cont %2== 0){
        qd = cont * cont;
        System.out.println(cont +"^2 = "+ qd);
        cont++;
            }
 }
}
}