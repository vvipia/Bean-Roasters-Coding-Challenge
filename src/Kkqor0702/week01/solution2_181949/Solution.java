package Kkqor0702.week01.solution2_181949;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] charArray = a.toCharArray();
        String print = "";
        for (char c : charArray) {
            if (Character.isLowerCase(c)) {
                print += Character.toUpperCase(c);
            } else {
                print += Character.toLowerCase(c);
            }
        }
        System.out.println(print);
    }
}