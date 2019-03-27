package com.company.swordOffer.sword00010;

/**
 * 数值的整数次方
 *
 * 没什么好说的，正常操作
 *
 */
public class Power {

    public double power(double base, int exponent) throws Exception {
        if(equal(base, 0) && exponent < 0){
            throw new Exception("0的负指数没有意义");
        }
        if(exponent == 0) return 1.0;
        if(exponent < 0){
            return 1.0 / powerChild(base, -exponent);
        }else{
            return powerChild(base, exponent);
        }
    }

    private double powerChild(double base, int exponent) {
        double result = 1.0;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public boolean equal(double left, double right){
        if(Math.abs(left - right) < 0.00000001){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        try{
            Power power = new Power();
            System.out.println(power.power(2, -5));
            System.out.println(power.power(0, 0));
        }catch (Exception e){

        }
    }
}
