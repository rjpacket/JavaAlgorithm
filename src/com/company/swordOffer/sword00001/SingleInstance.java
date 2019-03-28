package com.company.swordOffer.sword00001;

/**
 * 为什么需要双重null判断呢？
 * <p>
 * 考虑到多线程的情况，两个线程同时进入getInstance()方法
 * <p>
 * 两个线程都会通过第一层instance == null判断，但是由于同步代码块，只有一个线程能进入synchronized，另一个线程在外面等候；
 * 第一个线程new了一个对象，释放锁，这时候第二个线程进入synchronized，如果没有第二层instance == null判断，第二个线程也会new出一个对象，不符合单例的特征；
 * <p>
 * 第一层instance == null去掉，好像也能避免创建两个对象，但是由于同步代码块需要频繁切换锁，非常的消耗性能，所以加一个判断就可以避免了。
 */
public class SingleInstance {

    public String name = "SingleInstance";

    private SingleInstance() {
    }

    public static volatile SingleInstance instance = null;

    public static SingleInstance getInstance() {
        if (instance == null) {
            synchronized (SingleInstance.class) {
                if (instance == null) {
                    instance = new SingleInstance();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        SingleInstance instance = SingleInstance.getInstance();
        System.out.println(instance.name);
    }
}
