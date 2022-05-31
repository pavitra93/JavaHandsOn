import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Primitive Types
        byte age = 40;
        long viewsCount = 3_123_456_5566L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = true;
        System.out.print(isEligible);

        // Reference Types
        Date now = new Date();
        System.out.println(now);

        Point point1 = new Point(1,2);
        Point point2 = point1;
        point2.x = 3;
        System.out.println(point1);

        // Strings
        String message = "Hello World" + "!!";
        System.out.println(message.length());
        System.out.println(message.replace("World","Arpit"));
        System.out.println(message);
        // Escape Sequences in Strings
        String message2 = "Pavitra\"s Idea";
        String message3 = "c:\\Windows\\myfiles\\";
        String message4 = "c:\\\nWindows\\myfiles\\";
        String message5 = "c:\\\tWindows\\myfiles\\";
        System.out.println(message5);

        // Arrays
        // Always of fixed length. Cannot be increased of decreased
        // Must give array length
        // For eg. allows only 3 items. couldn't add 4 or more.
        int[] numbers = new int[3];
        numbers[0] = 5;
        numbers[2] = 12;
        // OR
        int[] numbers2 = {1,4,2,5,6};
        System.out.println(Arrays.toString(numbers2));

        // Multi Dimensional Arrays
        int[][] numbers3 = new int[2][3];
        numbers3[0][0] = 1;
        // OR
        int[][] numbers4 = {{1,2,4}, {2,4,5}};
        System.out.println(Arrays.deepToString(numbers4));

        // Constants
        final float PI = 3.14F;

        // Arithmetic Expressions
        int a = 5;
        int b = ++a;
        // int c = a + b;
        // int c = a - b;
        // int c = a * b;
        // int d = a / b;
        System.out.println(b);

        // Order of Operations
        // () -> */ -> +-
        int sum = 10 + 3 * 2;
        System.out.println(sum);

        // Casting
        /* Implicit Casting
         * byte > short > int > long > float > double
         * No data lost
         */
        short x = 1;
        int y = x + 2; // 1 + 2 (somewhere in memory), adds and assigns to y
        System.out.println(y);
        /* Explicit Casting
         * Have to manually type cast
         * No data lost
         */
        double xy = 1.1;
        int yz = (int) xy + 2;
        System.out.println(yz);

        /* What about strings? */
        String weight = "50";
        int waterWeight = Integer.parseInt(weight) + 10;
        System.out.println(waterWeight);
        weight = "50.2";
        double waterWeight2 = Double.parseDouble(weight) + 10;
        System.out.println(waterWeight2);

        // Math Class
        int result = (int) Math.ceil(1.1F);
        System.out.println(result);

        int random = (int) Math.round(Math.random() * 100);
        System.out.println(random);

        // Formatting number for currencies
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String usd = currency.format(123456.7899);
        System.out.println(usd);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String inPrecent = percent.format(0.67);
        System.out.println(inPrecent);

        // Method Chaining
        String inPercent2 = NumberFormat.getPercentInstance().format(0.87);
        System.out.println(inPercent2);

        // Read input from user
        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        System.out.println(input);

        System.out.print("Name: ");
        String name = sc.nextLine().trim();
        System.out.println("Your name is " + name);

    }
}
