import java.util.Scanner;

//Ввести целые числа как аргументы командной строки,
//подсчитать их сумму (произведение) и вывести результат на консоль.
public class Task4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter first number:");
        double a = num.nextDouble();
        System.out.println("Enter second number:");
        double b = num.nextDouble();
        double sum = a + b;
        double mul = a * b;
        System.out.println("Sum of nambers:"+" "+sum);
        System.out.println("Multiplication of nambers:"+" "+mul);


    }
}
