import java.util.Scanner;
public class Uri1043{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);
        float A,B,C,Area,Perimetro;

        A= teclado.nextFloat();
        B= teclado.nextFloat();
        C= teclado.nextFloat();

        Perimetro = A + B + C;
        Area = (A + B)*(C / 2);

        if ((A + B > C) && ( A + C > B) && ( B + C > A)) {
            System.out.printf("Perimetro = %.1f%n", Perimetro);}
            else { 
            System.out.printf("Area = %.1f%n", Area);}
            }

        }
