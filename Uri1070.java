import java.util.Scanner;
public class Uri1070{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    int valor;
    valor = teclado.nextInt();
    for (int cont=1; cont<=6; cont++){
        if ( valor%2 != 0 ){
            System.out.println(valor);
            valor = valor +2;}
            else { valor ++;
            cont --;}
 }
}
}


