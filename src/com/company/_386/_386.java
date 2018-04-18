package com.company._386;

import java.util.*;

/**
 * 字典序排数
 *
 * 给定一个整数 n, 返回从 1 到 n 的字典顺序。
 * <p>
 * 例如，
 * <p>
 * 给定 n = 13，返回 [1,10,11,12,13,2,3,4,5,6,7,8,9] 。
 * <p>
 * 请尽可能的优化算法的时间复杂度和空间复杂度。 输入的数据 n 小于等于 5,000,000。
 * <p>
 * Created by An on 2018/4/18.
 */
public class _386 {
    public static void main(String[] args) {
        lexicalOrder(4999999);
    }

    public static List<Integer> lexicalOrder(int n) {
        Set<String> set = new TreeSet<>();
        for (int i = 1; i <= n; i++) {
            set.add(Integer.toString(i));
        }
        List<Integer> ret = new ArrayList<>();
        for (String s : set) {
            ret.add(Integer.parseInt(s));
        }
        return ret;
    }
}
