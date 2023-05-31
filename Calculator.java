import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        double num1;
        double num2;
        double otvet;
        char reshenie;
        Scanner calk = new Scanner(System.in);
        System.out.print("Введите 2 числа: ");
        num1 = calk.nextDouble();
        num2 = calk.nextDouble();
        System.out.print("ВВедите  +, -, *, /: ");
        reshenie = calk.next().charAt(0);
        switch(reshenie) {
            case '+': otvet = num1 + num2;
                break;
            case '-': otvet = num1 - num2;
                break;
            case '*': otvet = num1 * num2;
                break;
            case '/': otvet = num1 / num2;
                break;
            default:  System.out.printf("Ошибка");
                return;
        }
        System.out.print("Результат:");
        System.out.printf(num1 + " " + reshenie+ " " + num2 + " = " + otvet);
    }
}