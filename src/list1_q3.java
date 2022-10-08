import java.util.Scanner;

public class list1_q3
{
    public static void main(String[] args) 
    {
        int num1, num2, soma;
        Scanner teclado = new Scanner(System.in);
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();

        soma = (num1+num2);
        System.out.print(soma);
        teclado.close();
    } 
    
}