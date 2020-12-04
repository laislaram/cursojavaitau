import java.util.Scanner;
public class Uri1114{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    int senha;
    for (int cont=0; cont<=1;){
        senha = teclado.nextInt();
    if (senha == 2002){
            System.out.println("Acesso Permitido");
            cont=2;}
    else {
            System.out.println("Senha Invalida");
            cont--;}
    }}}
