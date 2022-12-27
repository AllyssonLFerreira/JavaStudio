import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        Scanner entrance = new Scanner(System.in);

        System.out.print("Informe um número:");
        double num1 = entrance.nextDouble();

        System.out.print("Informe um número:");
        double num2 = entrance.nextDouble();

        System.out.print("Informe a operação:");
        String op = entrance.next();


        //Lógica do calculo
        double result = "+".equals(op) ? num1 + num2 : 0;
        result = "-".equals(op) ? num1 - num2 : result;
        result = "*".equals(op) ? num1 * num2 : result;
        result = "/".equals(op) ? num1 / num2 : result;
        result = "%".equals(op) ? num1 % num2 : result;

        System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, result);
        entrance.close();
    }
}
