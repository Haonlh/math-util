/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haonlh.mathutil;

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
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0..20");
        }
        
        // sửa code, sửa hàm giai thừa cho gọn, dùng đệ quy
        
        if(n == 0 || n == 1){
            return 1; // 0! = 1! = 1 tính luôn cho nhanh
        }
        return n * getFactorial(n - 1);  // gọi lại chính mình với quy mô khác(nhỏ hơn)
        // n! = n * (n -1)!
        // đệ quy, vòng lại chính mình với quy mô khác
        // recursion. Làm khéo nếu ko có đi mãi mãi
        // STACKOVERFLOW.COM
        

//        // sống xót đên đây thì n = 0 ,1 .. 20
//        if (n == 0 || n == 1) {
//            return 1; // 0!, 1!
//        }
//
//        long result = 1; // giả bộ
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//        }
//
//        return result; // nhân từ 2 3 4 5 6 7 8
    }
}
