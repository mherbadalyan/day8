import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Print your age and the program will show is you eligible to vote. ");
        printEligibleToVote(scanner.nextByte());

        System.out.println("Enter number and program will show number is even or add");
        printIsEven(scanner.nextInt());

        printRandomNum();

        System.out.println("Enter number and program will print is it multiple of 5");
        printIsMultipleOf5(scanner.nextInt());

        System.out.println("Enter 3 numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        printGreatistNumber(num1, num2, num3);

        System.out.println("Enter number");
        printNumInfo(scanner.nextDouble());

        System.out.println("Enter number from 1 to 7");
        printWeekDay(scanner.nextInt());

        System.out.println("Enter number of ice cream balls that you want");
        printCanBuyIceCream(scanner.nextInt());

        System.out.println("Print year and you know is it leap year.");
        printIsLeapYear(scanner.nextInt());

        printRandomNumWithConditions();

        System.out.println("Enter 2 number");
        printLegalForRequirements(scanner.nextInt(),scanner.nextInt());

        System.out.println("Enter 2 number");
        printAllOddOrEvenNumbers(scanner.nextInt(), scanner.nextInt());

        System.out.println("There is two points 'a' and 'b' in coordinate plene.");
        System.out.println("Input x coordinate for a");
        int ax = scanner.nextInt();
        System.out.println("Input y coordinate for a");
        int ay = scanner.nextInt();
        System.out.println("Input x coordinate for b");
        int bx = scanner.nextInt();
        System.out.println("Input y coordinate for b");
        int by = scanner.nextInt();
        printIsPointsInSamePlane(ax,ay,bx,by);

        System.out.println("Enter 3 numbers different 0 and program determine if" +
                " there is a non-degenerate triangle with such sides. ");
        printIsValidTriangle(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());

        System.out.println("We have ax2 + bx + c = 0");
        System.out.println("Input a");
        double a = scanner.nextInt();
        System.out.println("Input b");
        double b = scanner.nextInt();
        System.out.println("Input c");
        double c = scanner.nextInt();
        printDiscriminantDicisions(a, b, c);

        System.out.println("Enter 3 numbers");
        printNumberOfEqualNumbers(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());

        System.out.println("Enter 3 numbers and program will sort and print it.");
        printSortedNumbers(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

    }

    /**
     * Printing all decisions for ax2 + bx + c = 0
     *
     * @param a
     * @param b
     * @param c
     */
    private static void printDiscriminantDicisions(double a, double b, double c) {
        double D = b * b - 4 * a * c;
        if (D == 0) {
            System.out.println(-b / 2 * a);
        } else if (D > 0) {
            System.out.println("x1 = " + (-b + Math.sqrt(D)) / 2 * a + "  x2 = " + (-b - Math.sqrt(D)) / 2 * a);
        } else {
            System.out.println("No decisions");
        }
    }

    /**
     * checking if the points in the same plane
     *
     * @param ax
     * @param ay
     * @param bx
     * @param by
     */
    private static void printIsPointsInSamePlane(int ax, int ay, int bx, int by) {
        if ((ax > 0 && ay > 0 && bx > 0 && by > 0) || (ax < 0 && ay < 0 && bx < 0 && by < 0) ||
                (ax < 0 && ay > 0 && bx < 0 && by > 0) || (ax > 0 && ay < 0 && bx > 0 && by < 0)) {
            System.out.println("In the same quarter");
        } else System.out.println("Not in the same quarter");
    }

    /**
     * Printing values in non-decreasing order
     *
     * @param num1
     * @param num2
     * @param num3
     */
    private static void printSortedNumbers(int num1, int num2, int num3) {
        int min = num1;
        if (min > num2) {
            if (num2 > num3) min = num3;
            else min = num2;
        } else if (min > num3) min = num3;

        int max = num1;
        if (max < num2) {
            if (num2 < num3) max = num3;
            else max = num2;
        } else if (max < num3) max = num3;

        System.out.println(min + " " + (num1 + num2 + num3 - max - min) + " " + max);
    }

    /**
     * print count of numbers that equals to each other.
     *
     * @param num1
     * @param num2
     * @param num3
     */
    private static void printNumberOfEqualNumbers(int num1, int num2, int num3) {
        if (num1 == num2 && num2 == num3) System.out.println("count of numbers that equals to each other is 3");
        else if (num1 == num2 | num2 == num3 | num1 == num3)
            System.out.println("count of numbers that equals to each other is 2");
        else System.out.println("count of numbers that equals to each other is 0");
    }

    /**
     * Determine if there is a non-degenerate triangle with such sides.
     *
     * @param num1
     * @param num2
     * @param num3
     */
    private static void printIsValidTriangle(int num1, int num2, int num3) {
        if (num1 + num2 > num3 && num2 + num3 > num1 && num1 + num3 > num2) {
            System.out.println("Can be triangle with such sides");
        } else System.out.println("Can't be triangle with such sides");
    }

    /**
     * Print if parametres corresponds for following requirements.
     * -	if one of them is multiple of 7, and both positive, and a greater than b, print all odd values between them
     * -	else print all even values between them
     *
     * @param a
     * @param b
     */
    private static void printAllOddOrEvenNumbers(int a, int b) {

        if ((a % 7 == 0 || b % 7 == 0) && a > 0 && b > 0 && a > b) {
            System.out.println("There is odd numbers between " + b + " to " + a);
            for (int i = b; i <= a; i++) {
                if (i % 2 != 0) System.out.print(i + " ");
            }
        } else {
            if (a > b) {
                System.out.println("There is even numbers between " + b + " to " + a);
                for (int i = b; i <= a; i++) {
                    if (i % 2 == 0) System.out.print(i + " ");
                }
            } else {
                System.out.println("There is even numbers between " + a + " to " + b);
                for (int i = a; i <= b; i++) {
                    if (i % 2 == 0) System.out.print(i + " ");
                }
            }
        }
    }

    /**
     * Print if parametres corresponds for following requirements.
     * -	a > 10 and b is not equal to 10
     * -	both a and b is positive
     * -	both a and b is negative
     * -	a > 10 b < 1 both of them are odd
     * -	a is a multiple of 5 OR b is a multiple of 5
     * -	a is not a multiple of 5 but b is a multiple of 5
     *
     * @param a
     * @param b
     */
    private static void printLegalForRequirements(int a, int b) {
        String strA;
        String strB;
        System.out.println("a = " + a + " b = " + b + "\n");

        System.out.println("Requirement 1 - a > 10 and b is not equal to 10");
        if (a > 10) strA = "legal";
        else strA = "illegal";

        if (b != 10) strB = "legal";
        else strB = "illegal";

        if (strA.equals(strB)) System.out.println("Both are " + strA);
        else System.out.println("a is " + strA + " b is " + strB);

        System.out.println("\nRequirement 2 - both a and b is positive");
        if (a > 0) strA = "legal";
        else strA = "illegal";

        if (b > 0) strB = "legal";
        else strB = "illegal";

        if (strA.equals(strB)) System.out.println("Both are " + strA);
        else System.out.println("a is " + strA + " b is " + strB);

        System.out.println("\nRequirement 3 - both a and b is negative");
        if (a > 0) strA = "legal";
        else strA = "illegal";

        if (b > 0) strB = "legal";
        else strB = "illegal";

        if (strA.equals(strB)) System.out.println("Both are " + strA);
        else System.out.println("a is " + strA + " b is " + strB);

        System.out.println("\nRequirement 4 - a > 10 b < 1 both of them are odd");
        if (a > 10 && a % 2 != 0) strA = "legal";
        else strA = "illegal";

        if (b < 0 && b % 2 != 0) strB = "legal";
        else strB = "illegal";

        if (strA.equals(strB)) System.out.println("Both are " + strA);
        else System.out.println("a is " + strA + " b is " + strB);

        System.out.println("\nRequirement 5 - a is a multiple of 5 OR b is a multiple of 5");
        if (a % 5 == 0 || b % 5 == 0) System.out.println("Both are valid");
        else System.out.println("Both are invalid");

        System.out.println("\nRequirement 6 - a is not a multiple of 5 but b is a multiple of 5");
        if (a % 5 != 0) strA = "legal";
        else strA = "illegal";

        if (b % 5 == 0) strB = "legal";
        else strB = "illegal";

        if (strA.equals(strB)) System.out.println("Both are " + strA);
        else System.out.println("a is " + strA + " b is " + strB);


    }

    /**
     * Generate random integer value, print true if random value corresponds these conditions
     * -input number is greater than -1000  and less than 1000
     * -input number is multiple of 3 or input number is multiple of  5
     */
    private static void printRandomNumWithConditions() {
        boolean result = false;
        int randomNum = new Random().nextInt();
        if (randomNum > -1000 && randomNum < 1000 && (randomNum % 3 == 0 || randomNum % 5 == 0)) result = true;

        System.out.println(randomNum + " " + result);
    }

    /**
     * Print is inputNum year is leap or not
     *
     * @param inputNum
     */
    private static void printIsLeapYear(int inputNum) {
        boolean result = false;
        if (inputNum % 4 == 0) {
            if (inputNum % 100 == 0) {
                if (inputNum % 400 == 0) result = true;
            } else result = true;
        }
        if (result) System.out.println("Year is leap");
        else System.out.println("Year isn't leap");
    }

    /**
     * Print can you buy ice cream with inputNumber balls, if in the cafe they sell an ice-cream with 3 balls and 5 balls
     *
     * @param inputNum
     */
    private static void printCanBuyIceCream(int inputNum) {
        if (inputNum != 1 && inputNum != 2 && inputNum != 4 && inputNum != 7) System.out.println("You can buy " +
                "ice cream with " + inputNum + " balls");
        else System.out.println("You can't buy ice cream with " + inputNum + " balls");
    }

    /**
     * print weekday if input number is between 1 to 7
     *
     * @param inputNum
     */
    private static void printWeekDay(int inputNum) {
        if (inputNum == 1) {
            System.out.println("Monday");
        } else if (inputNum == 2) {
            System.out.println("Tuesday");
        } else if (inputNum == 3) {
            System.out.println("Wednesday");
        } else if (inputNum == 4) {
            System.out.println("Thursday");
        } else if (inputNum == 5) {
            System.out.println("Friday");
        } else if (inputNum == 6) {
            System.out.println("Saturday");
        } else if (inputNum == 7) {
            System.out.println("Sunday");
        } else System.out.println("Wrong number");
    }

    /**
     * print info about input number
     *
     * @param inputNum
     */
    private static void printNumInfo(double inputNum) {
        if (inputNum == 0) System.out.println("Number is zero");
        else if (Math.abs(inputNum) < 1 && Math.abs(inputNum) > 0) System.out.println("Number is small");
        else if (inputNum > 1_000_000) System.out.println("Number is large");
        else if (inputNum > 0) System.out.println("Number is positive");
        else System.out.println(("Number is negative"));
    }

    /**
     * print gratist number from parametres
     *
     * @param num1
     * @param num2
     * @param num3
     */
    private static void printGreatistNumber(int num1, int num2, int num3) {
        int max;
        if (num1 >= num2) {
            if (num1 >= num3) max = num1;
            else max = num3;
        } else if (num2 >= num3) max = num2;
        else max = num3;

        System.out.println(max);
    }

    /**
     * print is your number multiple of 5
     *
     * @param inputNum
     */
    private static void printIsMultipleOf5(int inputNum) {
        if (inputNum % 5 == 0) System.out.println(inputNum + " is multiple of a 5");
        else System.out.println(inputNum + " is not multiple of a 5");

    }

    /**
     * Generate and print random integer number between 2 to 7
     */
    private static void printRandomNum() {
        int randomNum = (int) (Math.random() * 10);
        if (randomNum < 2) randomNum += 2;
        else if (randomNum > 7) randomNum -= 2;
        System.out.println(randomNum);
    }

    /**
     * program print number is even or add
     *
     * @param inputNum
     */
    private static void printIsEven(int inputNum) {
        if (inputNum % 2 == 0) {
            System.out.println("number is even");
        } else System.out.println("number is odd");
    }

    /**
     * Print person is eligible to vote.
     *
     * @param userAge
     */
    private static void printEligibleToVote(byte userAge) {
        if (userAge >= 18) {
            System.out.println("You eligible to vote");
        } else System.out.println("you are not eligible to vote ");
    }
}
