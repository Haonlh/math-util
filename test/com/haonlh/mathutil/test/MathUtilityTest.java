/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haonlh.mathutil.test;

import com.haonlh.mathutil.MathUtility;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class MathUtilityTest {

    @Test // biens hàm này thành main() , shift-F6 để chạy
    // gọi hàm getF() như thường lệm hay hơn là tự động so sánh giùm
    // expected và actual coi có khớp nhau ko ? có thấy màu xanh
    // ko khớp thấy màu đỏ. Ta chỉ nhìn màu đỏ mà ko cần mất công
    // so sánh nữa !!!!!!!!!
    public void testFactorialRightArgumentRunsWell() {
        long expected = 120; // 5! có = 120 ?
        int n = 5;
        long actual = MathUtility.getFactorial(n);
        // So sánh
        assertEquals(expected, actual);

        //TEST các tình huống còn lại
        assertEquals(720, MathUtility.getFactorial(6));// 6! = 720 ?
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(1, MathUtility.getFactorial(1));

        // 0! là 1 tính huống cần phải test
        // 1! là 1 tính huống khác cần phải test
        // 6! là 1 tính huống khác cần phải test
        // Tính huống; test case, nghế tester là nghề nghĩ ra các test case, sau đó thử nghiệm
        //assertEquals(0, MathUtility.getFactorial(0));
        // kỳ vọng sai, tính đúng -> màu đỏ, không khớp nhau
        // kỳ vọng đúng, tính sai -> màu đỏ
        // hy vọng 5! = 120 -> tính ra mấy
    }

    // test xem phần ngoại lệ - exception
    // Exception là tình huống xảy ra trong app, code khi thực thi, app chạy
    // nó ko phải là 1 value dể có thể so sánh
    // Lỗi sql trùng key, sai khóa ngoại,  null trên cột yêu cầu khác null
    // đều là lỗi liên quan sql nhưng ko thể nói thằng nào bằng thắng nào?
    // ĐỐi với exception, chỉ có thể đo nó = câu hỏi: Mày có xuất hiện ko?
    // ko dùng assertEqual() so-sánh-coi-nos-bằng-nhau-hay-ko
    // troing thiết kế của hàm getFactorial() thì nếu đưa vào n < 0 hoặc n > 2
    // thì hàm ném ra, se new cột ngoại lệ
    // nếu có ngoại lệ xảy ra khi n đưa vào < 0 > 21 
    // có nghĩa rằng hàm chạy đúng, thấy ngoại lệ a lại ăn mừng, thì chạy như thiết kế
    // -> đừng có ngaaoji lệ tà cần nó xuất hiện -> màu xanh
    // sẽ có test case: tình huống test: xem ngoại lệ có xuất hiện ko, có -> xanh
    //                                                                ko -> đỏ
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        MathUtility.getFactorial(30); // Phải xuất hiện Exception
        MathUtility.getFactorial(-10); // Phải xuất hiện Exception
        MathUtility.getFactorial(21); // Phải xuất hiện Exception
        MathUtility.getFactorial(40); // Phải xuất hiện Exception

    }
    // nếu xh Exeption như kỳ vọng, thì phải xanh
    // vì màu xanh here hàm ý rằng hàm chạy như thiết kế,
    // ném ngoaijn lệ khi n cà chớn !!
    // ta cần kỹ thuật bắt ngoại lệ, đúng ngoại lệ cần bắt xuất hiện
    // ta có xanh
}

// Quy ước màu xanh: nếu tất cả các lời gọi hàm getFactrial();
// Đều trả về giá trị đúng như kỳ vọng, nói cách khác tất cả các hàm assertEquals() đều so sánh
// khớp ecpected vs actual thì có màu xanh
// XANH: KHI TẤT CẢ CÁC TÌNH HUỐNG TEST HÀM ĐỀU CHẠY ĐÚNG
// ĐỎ: chỉ cần 1 đám này sai, coi như ĐỎ CHO TẤT CẢ
// Lí do phía sau: ĐÃ TEST HÀM THÌ HÀM PHẢI ĐÚNG CHO CÁC TÌNH HUỐNG TEST DC ĐƯA RA
// ĐÃ TEST THÌ PHẢI ĐÚNG CHO TẤT CẢ CÁC TRƯỜNG HỢP DC ĐƯA RA
// Ko chơi trò: hầu hết các hàm đúng, thì đúng....
