import java.util.Scanner;

//Отобразить в окне консоли аргументы командной строки в обратном порядке.
public class Task2 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        for (int i = 0; i<1; i++) {
            StringBuffer reverseArgument = new StringBuffer(inputValue.nextLine());
            reverseArgument.reverse();
            System.out.println(reverseArgument.toString());
        }

    }
}
