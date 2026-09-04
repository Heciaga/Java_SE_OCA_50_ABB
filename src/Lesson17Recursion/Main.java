package Lesson17Recursion;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Recursion recursionMethods = new Recursion();
        //1. 1-dən N-ə qədər ədədləri çap etmək
        recursionMethods.printNumbers(5);
        //2. Palindrome check etmək
        System.out.println(recursionMethods.isPalindrome("salam"));
        //3. Fibonacci ardıcıllığını icra etmək
        System.out.println(recursionMethods.fibonacci(7));
        //4. Binary search
        List<Integer> numbers = new ArrayList<>(List.of(1, 9, 4, 5, 6, 3, 10));
        System.out.println(recursionMethods.binarySearch(numbers, 19));
        //5. Sətirin bütün simvollarını tərsinə çevirmək
        recursionMethods.reverseText("Salam");
    }
}
