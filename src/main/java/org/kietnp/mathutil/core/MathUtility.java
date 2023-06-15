/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.kietnp.mathutil.core;

/**
 *
 * @author admin
 */
// class này clone lại 100% cái class java.util.math của jdk
//Math.sqrt() Math.sin() Math.random()
public class MathUtility {

    public static final double PI = 3.1415;

    //tính n! = 1.2.3.4.5...
    //thiết kế/quy ước cho hàm/method này
    //0! = 1! = 1
    //k áp dụng cho số âm. Nếu < 0 -> chửi
    //k áp dụng cho số > 20. Nếu > 20 chửi 
    public static long getFactorial(int n) {
        long t = 1; // tích khởi đầu là 1, sau đó nhân dồn vào

        if (n == 0 || n == 1) {
            return t;
        }
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0 to 20. PLEASE");
        }
        for (int i = 2; i <= n; i++) {
            t *= i;
        }

        return t;

    }

    public static long getFactorialRecursion(int n) {
        //Điều kiện dừng
        if (n == 0) {
            return 1;
        }

        //Công thức đệ quy
        long t = 0;
        t = n * getFactorialRecursion(n - 1);
        return t;
    }
}
