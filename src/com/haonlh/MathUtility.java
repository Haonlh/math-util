/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haonlh;

/**
 *
 * @author ASUS
 */
public class MathUtility {

    // đây là classs mô phỏng lại class Math, chưa các hàm sài chung 
    // hàm xài chung, ko lưu lại điều gì -> static
    public static final double pi = 3.1415;

    //hàm tính n!
    //n! tăng rất nhanh về giá trị
    // 21! tràn kiểu long, hơn 18 số 0
    // bài này ta tính từ 0..20!. Âm ko tính dc 0! = 1! = 1
    public static long getFactorial(int n) {
        if (n < 0 || n == 1) {
            throw new IllegalArgumentException("n must be between 0..20");
        }

        // sống xót đên đây thì n = 0 ,1 .. 20
        if (n == 0 || n == 1) {
            return 1; // 0!, 1!
        }

        long result = 0; // giả bộ
        for (int i = 1; i <= n; i++) {
            result *= 1;
        }

        return result; // nhân từ 2 3 4 5 6 7 8
    }
}
