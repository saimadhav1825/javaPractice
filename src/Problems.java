import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class Problems {
    public static void main(String[] args) {
        findElementIndexInArray();
    }

    //Java program to search an element in a sorted and rotated array :
    public static void findElementIndexInArray() {
        int[] arr = {2,3,4,5,6,7,8,9};
        int number = 5;
        int start = 0;
        int end = arr.length - 1;
        int elementIndex = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == number) {
                elementIndex = arr[mid];
            }
            if (arr[mid] <= arr[end]) {
                if (arr[mid] < number && arr[end] >= number) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > number && arr[start] <= number) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        System.out.println(elementIndex + "");
    }

    public static void missingNumber() {
        int[] arr = {7, 5, 6, 1, 4, 2};
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        int restSum = 0;
        for (int j : arr) {
            restSum += j;
        }
        System.out.println(sum - restSum);
    }
    //Find all Permutations of a String in java
    //Java Program to Find Smallest and Largest Element in an Array

    public static void smallestLargestNumber() {
        int[] arr = {5, 4, 7, 8, 3, 2, -1, 90, 18, 25, 301};
        int smallest = arr[0];
        int largest = arr[0];
        for (int index = 1; index < arr.length; index++) {
            if (arr[index] > largest) {
                largest = arr[index];
            } else if (arr[index] < smallest) {
                smallest = arr[index];
            }
        }
        System.out.println("Smallest Number:         " + smallest + "     Largest Number:" + largest);
    }

    //How to find length of string in java without using length() method
    public static void findLengthOfString() {
        int count = 0;
        String word = "Applaunch";
        char[] c = word.toCharArray();
        for (Character character : c) {
            count++;
        }
        System.out.println(count);
    }

    //Find all substrings of String in java?
    //For example: If input is “abb”  then output should be “a”, “b”,”b”, “ab”, “bb”, “abb”
    public static void substringsOfString() {
        String word = "abb";
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                System.out.println(word.substring(i, j));
            }
        }
    }

    //Find first non repeated character in a String
    //If input string is “analogy”,  then program should return ‘n’
    //If input string is “easiest”, then program should return ‘a’

    public static Character firstNonRepeatedCharacterInaString(String str) {
        Map<Character, Integer> countCharacters = new LinkedHashMap<>();
        for (int i = 0; i < str.length() - 1; i++) {
            Character c = str.charAt(i);
            if (!countCharacters.containsKey(c)) {
                countCharacters.put(c, 1);
            } else {
                countCharacters.put(c, countCharacters.get(c) + 1);
            }
        }
        // As LinkedHashMap maintains insertion order, first character with
        // count 1 should return first non repeated character
        for (Map.Entry<Character, Integer> e : countCharacters.entrySet()) {
            if (e.getValue() == 1)
                return e.getKey();
        }
        return null;
    }

    //Java Program to find duplicate Characters in a String

    public static void printDuplicateCharactersInaString(String word) {
        HashSet<Character> hashSet = new HashSet<>();
        for (int index = 0; index < word.length(); index++) {
            char c = word.charAt(index);
            if (!hashSet.add(c)) {
                System.out.println(c);
            }
        }
    }

    //How to check if one String is rotation of another String in java
    public static boolean isRotation(String str, String rotation) {
        String str2 = str + str;
        return str2.contains(rotation);
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
            for (int j = i; j < arr.length - 1; j++)
                if (arr[i] > arr[j + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        }
        System.out.println(Arrays.toString(arr));
    }

    // How can you find the factorial of an integer in Java?

    public static void factorial() {
        int fact = 1;
        int num = 5;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    public static boolean isIntegerPalindrome(int input) {
        int num = input;
        int sum = 0;
        int rem;
        while (num > 0) {
            rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }
        return input == sum;
    }

    //PrintOneToHundredWithoutNumber
    public static void PrintOneToHundredWithoutNumber() {
        int one = 'a' / 'a';
        int ten = "**********".length();
        for (int i = one; i <= (ten * ten); i++) {
            System.out.println(i);
        }
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

    //How to check if two Strings are Anagrams in Java
    public static boolean isAnagramUsingStringMethods(String word, String anagram) {
        if (word.length() != anagram.length())
            return false;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = anagram.indexOf(c);
            // If index of any character is -1, then two strings are not anagrams
            // If index of character is not equal to -1, then remove the chacter from the
            // String
            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1);
            } else
                return false;
        }
        return anagram.isEmpty();
    }


    //How to check if String has all unique characters in java

    public static boolean hasAllUniqueChars(String word) {
        HashSet<Character> alphaSet = new HashSet<>();
        for (int index = 0; index < word.length(); index++) {
            char c = word.charAt(index);
            // If Hashset's add method return false,that means it is already present in HashSet
            if (!alphaSet.add(c))
                return false;
        }
        return true;
    }
}




