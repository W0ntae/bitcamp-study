package com.eomcs.quiz.ex01.sol;

// 출처: codefights.com
//
// 주어진 숫자에 짝수가 몇 개인지 세어라.
// 예) 
// 1010 => 2
// 123 => 1
//
public class Test04 {

  public static void main(String[] args) {
    System.out.println(countEvenNumber(1238694636) == 6);
    System.out.println(countEvenNumber(2567884) == 5);
  }

  static int countEvenNumber(int value) {
    int result = 0;
    String number = Integer.toString(value);
    for (int i = 0 ; i < number.length(); i++) {
      if (Integer.valueOf(number.charAt(i)) % 2 == 0) {
        result++;
      }
    }
    return result;
  }
}
