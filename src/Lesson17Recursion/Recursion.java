package Lesson17Recursion;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Recursion {

    public void printNumbers(int n) {
        if (n == 0) return;
        printNumbers(n - 1);
        System.out.println(n);
    }

    public boolean isPalindrome(String text) {
        if (text.length() <= 1) return true;

        if (text.charAt(0) != text.charAt(text.length() - 1)) return false;

        return (isPalindrome(text.substring(1, text.length() - 1)));
    }

    public int fibonacci(int n) {
        if (n <= 1) return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public boolean binarySearch(List<Integer> list, int target) {
        if (list.isEmpty()) {
            return false;
        }
        if (list.size() == 1) {
            return list.getFirst() == target;
        }
        Collections.sort(list);
        int left = 0;
        int right = list.size() - 1;
        int middle = (left + right) / 2;
        if (target == list.get(middle)) {
            return true;
        }

        if (target > list.get(middle)) {
            return binarySearch(list.subList(middle + 1, list.size()), target);
        }

        if (target < list.get(middle)) {
            return binarySearch(list.subList(0, middle - 1), target);
        }
        return false;
    }

    public void reverseText(String text) {
        if (text.isEmpty()) return;

        System.out.println(text.charAt(text.length() - 1));
        reverseText(text.substring(0, text.length() - 1));
    }
}
