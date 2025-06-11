package org.hgnv11.util;


import org.hgnv11.util.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    verifyFactorialGiveRightArg0RunsWell();

    verifyFactorialGiveRightArg1RunsWell();

        verifyFactorialGiveRightArg2RunsWell(2);
        verifyFactorialGiveRightArgRunsWell(24,4);
        verifyFactorialGiveRightArgRunsWell(120,5);
        verifyFactorialGiveRightArgRunsWell(720,6);



    }

    public static void verifyFactorialGiveRightArgRunsWell(long expected, int n){
        //IN
        System.out.println(n+"!"+ ": Expected: "+expected+" Actual: "+MathUtility.getFactorial(n));

    }
    //test case #3: verify the getFactorial() with N=2;
    public static void verifyFactorialGiveRightArg2RunsWell(int n){

        //IN
        System.out.println("2!: Expected: 2 ; Actual: "+MathUtility.getFactorial(n));

    }

    //test case #2: verify the getFactorial() with N=1;
    public static void verifyFactorialGiveRightArg1RunsWell(){
        int n=1;
        long expected=1;// hi vong 1 trả về nếu 0!
        Long actual=MathUtility.getFactorial(n);
        //IN
        System.out.println("1!: Expected: "+expected+" Actual: "+actual);

    }
    // hàm tính giai thừa gọi trong main
    // phải có test case
    //test case #1: verify the getFactorial() with N=0;
    //step:
    // given n=0;
    // call getFactorial(n);
    // expected result:
    //return 1; as the result of 0!=1
    public static void verifyFactorialGiveRightArg0RunsWell(){
        int n=0;
        long expected=1;// hi vong 1 trả về nếu 0!
        Long actual=MathUtility.getFactorial(n);
        System.out.println("0! Expected: "+expected+" Actual: "+actual);

    }





}

//ki thua vừa viết code vừa gõ test case gọi là
//TĐ (đưa vào cv) test driver develop