import java.util.Scanner;

public class learning {
    public static void main(String[] args) {
      // code starts
        // System.out.println("Hello, World!");

        // string
        String name = "Om Tejaswi";
        System.out.println(name);

        // int ,float, bool
        int a = 45;
        float b = 22.22f;
        boolean isAdult = true;

        System.out.println(a + b);
        System.out.println(isAdult);
        System.out.println(a);

        /*
         * Data types in java: Two data types in java: 1. Primitive -> byte (1 bytes),
         * short (2 bytes), int (4 bytes), long (8 bytes), float (4 bytes) double (8
         * bytes), boolean (1 bit), char (2 bytes)
         * 
         * 2. Non-primitive or refrence -> string (size of object)
         */

        // Taking user input in java
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age = scan.nextInt();

        // If else conditions
        if (age >= 18) {
            System.out.println("You're adult!");
        } else if (age <= 18 && age >= 13) {
            System.out.println("You're Teenager");
        } else {
            System.out.println("You're a kid!");
        }

        // switch statement
        switch (age) {
            case 13:
                System.out.println("You're Teenager");
                break;
            case 18:
                System.out.println("You're teenager");
            case 56:
                System.out.println("Oh!....You are old");
            case 5:
                System.out.println("What!...You are kid?");
            default:
                System.out.println("Sorry, the age you have entered did not match in our database.");
                break;
        }

        // quick quiz:
        System.out.println("Enter a number between 1 to 7");
        int day_index = scan.nextInt();
        switch (day_index) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Sorry, please enter a valid number between 1 - 7");
                break;
        }

        // loops
        // while loop
        int i = 0;
        while (i < 100) {
            System.out.println(i);
            i++;
        }

        // for loop
        for (int j = 0; j < 100; j++) {
            System.out.println(j);
        }

        // array
        int [] marks = {1,2,3,4,5};
        System.out.println(marks[1]);

        // for each loop
        for (int h : marks) {
            System.out.println(h);
        }

        // two dimensinol array
        int [][] matrix = {{1,2,3},{4,3,2}};
        System.out.println(matrix[1][2]);
    }
}
