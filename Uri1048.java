import java.util.Scanner;
public class Uri1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        float S,NSalario,Reajuste=0,Ganho;

        S = teclado.nextFloat();
        
        if ((S > 0) && (S <= 400)){Reajuste = 0.15f;}
        else if ((S > 400) && (S <= 800)){Reajuste = 0.12f;}
        else if ((S > 800) && (S <= 1200)){Reajuste = 0.1f;}
        else if ((S > 1200) && (S <= 2000)){Reajuste = 0.07f;}
        else if (S > 2000){Reajuste = 0.04f;}

        NSalario = S + S*Reajuste;
        Ganho = NSalario - S;
        Reajuste = Reajuste*100;

        System.out.printf("Novo salario: %.2f%n",NSalario);
        System.out.printf("Reajuste ganho: %.2f%n",Ganho);
        System.out.printf("Em percentual: %d %%%n",(int)Reajuste);
        }
}
