package Ster1046_ux.week4.S1;

public class S1 {
    public int solution(int[] numbers) {
        int biggest = 0;
        int bigger = 0;

        for(int num : numbers) {
            if(num > biggest) {
                bigger = biggest;
                biggest = num;
            }
            else if(num > bigger) {
                bigger = num;
            }
        }
        return bigger * biggest;

    }
}

// 완전탐색으로 풀이
//public class S1 {
//    public int solution(int[] numbers) {
//        int max = 0;
//        for(int i = 0; i < numbers.length; i++) {
//            for(int j = i+1; j < numbers.length; j++)
//                if (numbers[i] * numbers[j] > max) {
//                    max = numbers[i] * numbers[j];
//                }
//        }
//        return max;
//    }
//}
