import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of task: (1 - calculator, 2 - string array)");
        int onetwo = sc.nextInt();
        if(onetwo == 1){
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
        }else if (onetwo == 2){
            MaxAr maxAr = new MaxAr();
            System.out.println("Введите длину массива");
            int lenghtAr = sc.nextInt();
            System.out.println("Самое длинное слово в массиве - "+ maxAr.finderMax(lenghtAr));
        }
        else {
            System.out.println("INCORRECT NUMBER OF TASK!!!");
        }
    }
}