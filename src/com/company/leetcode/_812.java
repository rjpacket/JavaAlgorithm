package com.company.leetcode;

public class _812 {
    public static void main(String[] args) {
        System.out.println(largestTriangleArea(new int[][]{{10,7},{0,4},{5,7}}));
    }

    public static double largestTriangleArea(int[][] points) {
        int length = points.length;
        int minX = points[0][0], minY = points[0][1], x0, y0, maxX = 0, x1, y1, maxY = 0;
        for (int i = 0; i < length; i++) {
           if(points[i][0] <= minX && points[i][1] <= minY){
                minX = points[i][0];
                minY = points[i][1];
           }
        }
        System.out.println(minX + "|" + minY);
        x0 = x1 = minX;
        y0 = y1 = minY;
        for (int i = 0; i < length; i++) {
            if(Math.abs(points[i][0] - minX) > maxX){
                maxX = Math.abs(points[i][0] - minX);
                x0 = points[i][0];
                y0 = points[i][1];
            }
        }
        System.out.println(x0 + "|" + y0);
        System.out.println(x1 + "|" + y1);
        return 0.5 * Math.abs((x0 - minX) * (y1 - minY) - (x1 - minX) * (y0 - minY));
    }
}
