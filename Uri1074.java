import java.util.Scanner;
public class Uri1074{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    int qtd,valor;
    qtd = teclado.nextInt();
    for (int cont=1; cont<=qtd; cont++){
        valor = teclado.nextInt();
        if ( (valor > 0) && (valor%2 == 0) ){
            System.out.println("EVEN POSITIVE");}
        else if ( (valor < 0) && (valor%2 == 0) ){
            System.out.println("EVEN NEGATIVE");}
        else if ( (valor > 0) && (valor%2 != 0) ){
            System.out.println("ODD POSITIVE");} 
        else if ( (valor < 0) && (valor%2 != 0) ){
            System.out.println("ODD NEGATIVE");} 
        else if ( valor == 0 ){
            System.out.println("NULL");} 
    }}}
