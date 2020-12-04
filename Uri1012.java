import java.util.Scanner;

public class Uri1012{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double A, B, C, TRI, CIRCULO, TRA, QUA, RET;

        // entrada - ler as entradas
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        // calculo 
        TRI = A*C/2;
        CIRCULO = 3.14159*C*C;
        TRA = (A+B)*C/2;
        QUA = (B*B);
        RET = (A*B);

        // saida : exibir o valores
        System.out.printf("TRIANGULO: %.3f%n", TRI);
        System.out.printf("CIRCULO: %.3f%n", CIRCULO);
        System.out.printf("TRAPEZIO: %.3f%n", TRA);
        System.out.printf("QUADRADO: %.3f%n", QUA);
        System.out.printf("RETANGULO: %.3f%n", RET);


    }

}