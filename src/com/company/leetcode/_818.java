package com.company.leetcode;

/**
 * 你的赛车起始停留在位置 0，速度为 +1，正行驶在一个无限长的数轴上。（车也可以向负数方向行驶。）
 * <p>
 * 你的车会根据一系列由 A（加速）和 R（倒车）组成的指令进行自动驾驶 。
 * <p>
 * 当车得到指令 "A" 时, 将会做出以下操作： position += speed, speed *= 2。
 * <p>
 * 当车得到指令 "R" 时, 将会做出以下操作：如果当前速度是正数，则将车速调整为 speed = -1 ；否则将车速调整为 speed = 1。  (当前所处位置不变。)
 * <p>
 * 例如，当得到一系列指令 "AAR" 后, 你的车将会走过位置 0->1->3->3，并且速度变化为 1->2->4->-1。
 * <p>
 * 现在给定一个目标位置，请给出能够到达目标位置的最短指令列表的长度。
 * <p>
 * 示例 1:
 * 输入:
 * target = 3
 * 输出: 2
 * 解释:
 * 最短指令列表为 "AA"
 * 位置变化为 0->1->3
 * 示例 2:
 * 输入:
 * target = 6
 * 输出: 5
 * 解释:
 * 最短指令列表为 "AAARA"
 * 位置变化为 0->1->3->7->7->6
 * 说明:
 * <p>
 * 1 <= target（目标位置） <= 10000。
 * Created by An on 2018/4/23.
 */
public class _818 {
    public static void main(String[] args) {
        System.out.println(racecar(12));
    }

    public static int racecar(int target) {
        int position = 0;
        int speed = 1;
        int count = 0;
        while (position != target) {
            int distance = target - position;
            if (distance <= speed - distance) {
                count++;
                speed = -1;
            }
            int num = 0;
            int index = 0;
            while (num < Math.abs(distance)) {
                num += Math.pow(speed, index);
                index++;
                if (num == distance) {
                    count++;
                    speed = speed > 0 ? -1 : 1;
                    break;
                }
                if (num > distance) {
                    break;
                }
            }
            count++;
            position += speed;
            speed *= 2;
        }
        return count;
    }
}