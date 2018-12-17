package com.company.leetcode.before;

public class _812 {
    public static void main(String[] args) {
        System.out.println(largestTriangleArea(new int[][]{{2,5},{7,7},{10,8},{10,10},{1,1}}));
    }

    public static double largestTriangleArea(int[][] points) {
        int length = points.length;
        int minX = points[0][0], minY = points[0][1], x0, y0, maxY = 0;
        for (int i = 0; i < length; i++) {
            if (points[i][0] <= minX) {
                minX = points[i][0];
                minY = points[i][1];
            }
        }
        x0 = minX;
        y0 = minY;
        for (int i = 0; i < length; i++) {
            if (Math.abs(points[i][1] - minY) > maxY) {
                maxY = Math.abs(points[i][1] - minY);
                x0 = points[i][0];
                y0 = points[i][1];
            }
        }
        double result = 0;
        for (int i = 0; i < length; i++) {
            double now = 0.5 * Math.abs((x0 - minX) * (points[i][1] - minY) - (points[i][0] - minX) * (y0 - minY));
            if (now > result) {
                result = now;
            }
        }

        System.out.println(0.5 * Math.abs((2 - 1) * (10 - 1) - (10 - 1) * (5 - 1)));
        return result;
    }
}
