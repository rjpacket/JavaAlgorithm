package com.company.swordOffer.sword00040;

/**
 * 最后一个剩下的数字，约瑟夫环问题
 */
public class LastRemainNumber {

    public int remain(int n, int m){
        if(n < 1 || m < 1){
            return -1;
        }
        int[] queue = new int[n];
        for (int i = 1; i <= n; i++) {
            queue[i - 1] = i;
        }
        int queueSize = n;
        int index = 0;
        while (queueSize != 1){
            for (int i = 0; i < m; i++, index++) {
                if(index >= n){
                    index = 0;
                }else{
                    while (index < n && queue[index] == 0){
                        index++;
                        if(index >= n){
                            index = 0;
                        }
                    }
                }
            }
            queue[index - 1] = 0;
            queueSize--;
        }
        for (int i = 0; i < n; i++) {
            if(queue[i] != 0){
                return queue[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LastRemainNumber lastRemainNumber = new LastRemainNumber();
        int remain = lastRemainNumber.remain(6, 5);
        System.out.println(remain);
    }
}
