import java.util.Scanner;

//Вывести заданное количество случайных чисел
// с переходом и без перехода на новую строку
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter the first number int the range:");
        Scanner inputValue = new Scanner(System.in);
        int a = inputValue.nextInt();
        System.out.println("Enter the second number int the range:");
        int b = inputValue.nextInt();
            for (int i = 0; i < 10; i++) {
                int random_number1 = a + (int) (Math.random() * b);
                System.out.print(" " + random_number1);
            }
    }
}
