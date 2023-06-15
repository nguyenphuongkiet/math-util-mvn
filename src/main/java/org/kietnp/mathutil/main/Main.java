/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.kietnp.mathutil.main;

import org.kietnp.mathutil.core.MathUtility;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Test hàm getF() với các testcase đã chuẩn bị
        //Testcase #1, check getF() with n = 0. Chi tiết testcase xem ở dưới
        int n = 0;
        long expected = 1;
        long actual;
        //sau đó
        actual = MathUtility.getFactorial(n);
        System.out.println(n + "! | expected: " + expected +
                                  " | actual: " + actual );
        
        //Testcase #2, check getF() with n = 1
        System.out.println("1! | expected: 1" +
                                  " | actual: " + MathUtility.getFactorial(1) );
        
        //Testcase #3, check getF() with n = 2
        System.out.println("2! | expected: 2" +
                                  " | actual: " + MathUtility.getFactorial(2) );
        
        //Testcase #4, check getF() with n = 4
        System.out.println("4! | expected: 24" +
                                  " | actual: " + MathUtility.getFactorial(4) );
        
        //Testcase #5, check getF() with n = 5
        System.out.println("5! | expected: 120" +
                                  " | actual: " + MathUtility.getFactorial(5) );
        
        //Testcase #6, check getF() with n = -1
        //Kì vọng trả về exception
        System.out.println("-1! | expected: Exception" +
                                  " | actual: ");
        System.out.print(MathUtility.getFactorial(-1) );
    }
    
    // TESTCASE và TEST DRIVEN DEVELOPMENT - TDD
    // việc viết code và test code được tiến hành song song, đan xen luôn
    // 1 hàm được viết ra thì ngay trong quá trình viết đã chuẩn bị luôn
    // bộ testcase, nhiều test case để test hàm đúng hay sai luôn
    // ta liên tục sửa code/thêm code và chạy test case, run testcase
    // giống QC: là làm testcase, run testcase 
    // khác QC: phải viết cả code cho app
    // testcase là 1 bộ data đưa vào hàm/app để test hàm/appp đúng sai
    // chứa input, expected value, và cách thực thi testcase luôn
    // đưa data, nhấn cái gì, xem cái gì, kết luận cái gì
    
    // Hàm getF() có bộ data sẽ là : 0! = 1, 1! = 1, 2! = 2, 3! = 6
    // 4! = 20, 5! = 120,; âm giai thừa, 21 giai thừa -> CHỬI
    // nhiều bộ data, mỗi bộ ứng với 1 tình huống xài app/hàm, gọi testcase
    
    // CÁC TESTCASE ĐƯỢC VIẾT THEO QUY TẮC CƠ BẢN SAU/FORMAT NHƯ SAU
    
    //TESTCASE #1: check getF() with n = 0
    //Step/Procedure - cách để test hàm
    //Step 1: given n = 0
    //Step 2: call getF(with n = 0)
    //Expected result - kì vọng gì, hy vọng gì khu thực thi cái step ở trên
    // Expected value = 1
    
    
    //TESTCASE #2 : tương tự, thay số vào thôi
    
}
