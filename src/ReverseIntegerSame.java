

//Inout in=1551;
//output out=1551
public class ReverseIntegerSame {
    public static void main(String[] args) {
        System.out.println(isIntegerPalindrome(1551));
    }

    public static boolean isIntegerPalindrome(int input) {
        int num = input;
        int sum = 0;
        int rem ;
        while (num > 0) {
            rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }
        return input == sum;
    }
}
