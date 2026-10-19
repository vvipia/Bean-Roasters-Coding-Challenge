package Kkqor0702.week02.solution5;

class Solution {
    public int solution(int a, int b, int c, int d) {
        if (a == b && b == c && c == d) {
            return a * 1111;
        } else if (a == b && b == c) {
            return (a * 10 + d) * (a * 10 + d);
        } else if (a == b && a == d) {
            return (a * 10 + c) * (a * 10 + c);
        } else if (a == c && a == d) {
            return (a * 10 + b) * (a * 10 + b);
        } else if (b == c && b == d) {
            return (b * 10 + a) * (b * 10 + a);
        } else if (a == b && c == d) {
            return (a + c) * Math.abs(a - c);
        } else if (a == c && b == d) {
            return (a + b) * Math.abs(a - b);
        } else if (a == d && b == c) {
            return (a + b) * Math.abs(a - b);
        } else if (a == b) {
            return c * d;
        } else if (a == c) {
            return b * d;
        } else if (a == d) {
            return b * c;
        } else if (b == c) {
            return a * d;
        } else if (b == d) {
            return a * c;
        } else if (c == d) {
            return a * b;
        } else {
            return Math.min(Math.min(a, b), Math.min(c, d));
        }
    }
}