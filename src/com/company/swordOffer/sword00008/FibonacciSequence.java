package com.company.swordOffer.sword00008;

import java.util.HashMap;
import java.util.Map;

/**
 * 斐波那契数列
 *
 * 1. fib递归实现。缺点，存在大量的重复计算
 * 2. fibByMap递归优化，记录每一次的计算结果，减少大量的重复计算
 * 3. fib尾递归优化，减少重复计算
 *
 * 什么是尾递归，简单就是return方法本身。
 */
public class FibonacciSequence {

    public int fib(int n){
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public int fibByMap(Map<Integer, Integer> map, int n){
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return 1;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }else{
            int result = fibByMap(map, n - 1) + fibByMap(map, n - 2);
            map.put(n, result);
            return result;
        }
    }

    public int fib(int a, int b, int n){
        if(n >= 2){
            return fib(a + b, a, --n);
        }
        return a;
    }

    public static void main(String[] args) {
        FibonacciSequence fibonacciSequence = new FibonacciSequence();
//        System.out.println(fibonacciSequence.fib(45));
        System.out.println(fibonacciSequence.fib(1, 1, 45));
//        System.out.println(fibonacciSequence.fibByMap(new HashMap<>(), 45));
    }
}
