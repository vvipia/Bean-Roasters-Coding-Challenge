package Ster1046_ux.week4.S3;

public class S3 {
    public int solution(int[][] sizes) {
        int answer = 0;

        int width;
        int height;

        int maxWidth = 0;
        int maxHeight = 0;

        for(int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] >= sizes[i][1]) {
                width = sizes[i][0];
                height = sizes[i][1];
            } else {
                width = sizes[i][1];
                height = sizes[i][0];
            }
            if(width > maxWidth) {
                maxWidth = width;
            }
            if(height > maxHeight) {
                maxHeight = height;
            }
        }

        answer = maxHeight * maxWidth;
        return answer;
    }
}

//// 완전탐색 풀이 - 너무 숫자가 커져서 비효율적
//public class S3 {
//    public int solution(int[][] sizes) {
//        return search(sizes, 0, 0, 0);
//    }
//
//    private int search(int[][] sizes, int index, int maxWidth, int maxHeight) {
//
//        // 모든 명함의 방향을 정했다면 넓이 반환
//        if (index == sizes.length) {
//            return maxWidth * maxHeight;
//        }
//
//        int width = sizes[index][0];
//        int height = sizes[index][1];
//
//        // 1. 현재 명함을 그대로 놓기
//        int original = search(
//                sizes,
//                index + 1,
//                Math.max(maxWidth, width),
//                Math.max(maxHeight, height)
//        );
//
//        // 2. 현재 명함을 90도 회전해서 놓기
//        int rotated = search(
//                sizes,
//                index + 1,
//                Math.max(maxWidth, height),
//                Math.max(maxHeight, width)
//        );
//
//        // 두 경우 중 더 작은 넓이 선택
//        return Math.min(original, rotated);
//    }