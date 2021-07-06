import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        float num1, num2;
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter  first number:");
            num1 = scan.nextFloat();

            System.out.println("Enter second number:");
            num2 = scan.nextFloat();

            // System.out.println(num1);
            // System.out.println(num2);

            String prompt = "Enter \"+\" for addition, \"-\" for substraction, \"*\" for multiplication, \"/\" for division:";
            System.out.println(prompt);
            
            scan.nextLine();
            String op = scan.nextLine();

            switch (op) {
                case "+":
                    System.out.println(num1+num2);
                    break;
                case "-":
                    System.out.println(num1-num2);
                    break;
                case "*":
                    System.out.println(num1*num2);
                    break;
                case "/":
                    System.out.println(num1/num2);
                    break;
            
                default:
                    System.out.println("Invalid imput");
                    break;
            }


        } catch (Exception e) {
            System.out.println("Please enter a valid value (number).");
        } finally {
            scan.close();
        }
    }
}
