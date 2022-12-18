

//Find Palindrome words from sentence
//ex:my name is nitin i can speak malayalam
//out :nitin,i,malayalam
public class Palindrome {

    public static void main(String[] args) {
        String in = "my name is nitin i can speak malayalam";
        String[] inList = in.split(" ");
        for (String i : inList) {
            if (isPalindrome(i)) {
                System.out.println(i);
            }
        }
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
}


