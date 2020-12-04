import java.util.Scanner;
public class Uri1134{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    int C,C1=0,C2=0,C3=0;
    
    do { 

        C = teclado.nextInt();

        if  ( C==1) {
            C1++;}
            else if ( C==2) {
            C2++;}
            else if ( C==3) {
            C3++;}
    }
    while ( C != 4 ) ;
    System.out.println("MUITO OBRIGADO");
    System.out.println("Alcool: " + C1);
    System.out.println("Gasolina: " + C2);
    System.out.println("Diesel: " + C3);
    }}
