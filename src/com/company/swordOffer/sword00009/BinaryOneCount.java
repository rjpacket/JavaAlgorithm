package com.company.swordOffer.sword00009;

/**
 * 获取一个数二进制表示中1的个数
 *
 * 将n与1相与，如果不等于0，说明最后一个位置上是1，count++；
 * 然后1<<1位，再与n相与，如果不等于0，说明倒数第二个位置上也是1，count++；
 * 循环。
 *
 *      1111 1111 1111 1111
 *   &  0000 0000 0000 0001
 *   ----------------------
 *      0000 0000 0000 0001
 *
 *      1111 1111 1111 1110
 *   &  0000 0000 0000 0001
 *   ----------------------
 *      0000 0000 0000 0000
 */
public class BinaryOneCount {

    public int getBinaryOneCount(int n){
        int count = 0;
        int flag = 1;
        while (flag != 0){
            if((n & flag) != 0){
                count++;
            }
            flag <<= 1;
        }
        return count;
    }

    public int getBinaryBestCount(int n){
        int count = 0;
        while (n != 0){
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        BinaryOneCount binaryOneCount = new BinaryOneCount();
        System.out.println(binaryOneCount.getBinaryOneCount(9));
        System.out.println(binaryOneCount.getBinaryBestCount(9));
    }
}
