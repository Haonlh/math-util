/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haonlh.mathutil.main;

import com.haonlh.mathutil.MathUtility;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println(" 1st upload from Local to GitHub!"); 
//        System.out.println(" Welocme to GitHub");
        // TEST trâu bò - dùng mắt xem đúng sai
        
        long expected = 120; // hope trả về 120 nếu input = 5
        long actual;         // nếu input = 5
        int input = 5;       // input = 5
        actual = MathUtility.getFactorial(input); // xem ra mấy ??
        System.out.println("5!: Expected: " + expected +
                                "; Actual: " + actual);
        // một tình huống test
        
        //Case 2 0! ??
        expected = 1;
        input = 0;
        actual = MathUtility.getFactorial(input); // xem ra mấy ??
        System.out.println("5!: Expected: " + expected +
                                "; Actual: " + actual);
        
        //Case 3 2! ??
        expected = 2;
        input = 2;
        actual = MathUtility.getFactorial(input); // xem ra mấy ??
        System.out.println("5!: Expected: " + expected +
                                "; Actual: " + actual);
        
        // Case 4 -1! ??
        // expected = ???; ko ss dc vì nó ko f là vallua mà nó chỉ xuất hiện thôi
        input = -1;
        actual = MathUtility.getFactorial(input); // xem ra mấy ??
//        System.out.println("5!: Expected: " + expected +
//                                "; Actual: " + actual);  => ko in dc ngại lệ, chỉ dc nó có xuất hiện hay ko ??

        // chúng ta phải nhìn để keet luận, nhìn nhiều case
        // chơi trò thông minh hơn - Test Automation dùng thư viện
        
        
        
    }
    
}
