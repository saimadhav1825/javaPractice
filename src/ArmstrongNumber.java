
//Check give number is armstrong number or not
public class ArmstrongNumber {

    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(153));
    }
    public static boolean isArmstrongNumber(int input) {
        int num = input;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            sum = sum + rem * rem * rem;
        }
        return input == sum;
    }
}
