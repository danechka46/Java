import java.util.Scanner;

/**
 * @author darzhanov
 * @see Calculator
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Введите число 2: ");
        double n2 = sc.nextDouble();
        System.out.print("Введите знак(+,-,/,*): ");
        String znak = sc.next();
        Calculator calc = new Calculator();
        switch (znak) {
            case "+":
                System.out.printf("Ответ: %.4f", calc.add(n1, n2));
                break;
            case "-":
                System.out.printf("Ответ: %.4f ", calc.minus(n1, n2));
                break;
            case "/":
                if (n2 == 0)
                    System.out.println("Erorr...");
                else
                    System.out.printf("Ответ: %.4f ", calc.devide(n1, n2));
                break;
            case "*":
                System.out.printf("Ответ: %.4f ", calc.multiply(n1, n2));
                break;
            default:
                System.out.println("Неправильный знак");
        }
    }
}
