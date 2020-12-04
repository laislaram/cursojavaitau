import java.util.Scanner;
public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float valor, soma=0, media=0;
        int Qtpos=0;

        for (int cont=1;cont<=6; cont++){
            valor = teclado.nextFloat();

            if (valor >0){
                Qtpos ++;
                soma = soma + valor;
            }}
        media = soma/Qtpos;
        System.out.println(Qtpos +" valores positivos");
        System.out.printf("%.1f%n",media);
        }
    }