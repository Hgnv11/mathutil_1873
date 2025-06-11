package org.hgnv11.util.mathutil.core;



public class MathUtility {
    //class này cung câp ham tính toán toán học
    //dăt chước math trong jdk
    //vì những tính toán này , tính xong rồi trả ra kh cần luu
    // do do ta thiet ke ni dang static
    // ta lam hàm tính giai thừa
    //quy uoc
    // 0! =1
    // n! = n*(n-1)!
    // n! = n*(n-1)*(n-2)*...*1

    public static long getFactorial(int n){
        if (n < 0 || n > 20) throw new IllegalArgumentException("n must be between 0 and 20");
        if(n==0) return 1;
        //cpu n = 1,2->20
        // tinh n!=1.2.3.4.5..... thuat toan nhan don/cong don
        long rs=1;
        for (int i = 1; i <= n; i++) {
            rs *= i;
        }
        return rs;
    }

}
