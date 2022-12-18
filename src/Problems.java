import java.util.Arrays;

public class Problems {
    public static void main(String[] args) {
      /*  reverseString();
        swapTwoNumbers();
        vowelInString();
        isPrimeNumber();
        printFibonacciNumbers(10);
        listContainODD();
        isStringPalindrome();
        removeSpaceInString();
        leadingTrailingSpace();
        sortArray();*/
        factorial();
    }

    //How do you reverse a string in Java?
    public static void reverseString() {
        String input = "InterviewPrepare";
        StringBuilder outPut = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            outPut.append(input.charAt(i));
        }
        System.out.println(outPut);
    }

    // How do you swap two numbers without using a third variable in Java?
    public static void swapTwoNumbers() {
        int a = 10;
        int b = 20;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a is " + a + "    b  is " + b);
    }

    //Write a Java program to check if a vowel is present in a string.
    public static void vowelInString() {
        String input = "Prepare";
        System.out.println(input.toLowerCase().matches(".*[aeiou].*"));

    }

    //Write a Java program to check if the given number is a prime number.
    public static void isPrimeNumber() {
        System.out.println(isPrime(19));
    }

    public static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Write a Java program to print a Fibonacci sequence using recursion.
    public static void printFibonacciNumbers(int num) {
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 1; i <= num; i++) {
            System.out.print(a + ", ");
            a = b;
            b = c;
            c = a + b;
        }
    }
    //How do you check if a list of integers contains only odd numbers in Java?

    public static void listContainODD() {
        System.out.println("listContainODD`12q");
        int[] list = {4, 5, 8, 9, 3};
        for (int in : list) {
            if (in % 2 != 0) {
                System.out.println(in);
            }
        }
    }

    //How do you check whether a string is a palindrome in Java?
    public static void isStringPalindrome() {
        String input = "MadaM";
        System.out.println(isPalindrome(input));

    }

    public static boolean isPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    //How do you remove spaces from a string in Java?
    public static void removeSpaceInString() {
        String s = "Prepare For Interview";
        String out = s.replace(" ", "");
        System.out.println(out);
    }

    //How do you remove leading and trailing spaces from a string in Java?
    public static void leadingTrailingSpace() {
        String s = " Prepare For Interview ";
        System.out.println(s.trim());
    }

    //How do you sort an array in Java?

    public static void sortArray() {
        int[] arr = {10, 7, -1, 4, 6, 80};
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i; j < arr.length-1; j++)
                if (arr[i] > arr[j + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        }
        System.out.println(Arrays.toString(arr));
    }

    // How can you find the factorial of an integer in Java?

    public static void factorial(){
        int fact=1;
        int num=5;
        for (int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}




