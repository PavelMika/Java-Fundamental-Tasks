import java.util.Scanner;

//Приветствовать любого пользователя при вводе его имени через
//командную строку.
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Write your name:");
        Scanner inputValue = new Scanner(System.in);
        String userName;
        userName = inputValue.nextLine();
        System.out.println("Hello"+" "+userName);

    }
}
