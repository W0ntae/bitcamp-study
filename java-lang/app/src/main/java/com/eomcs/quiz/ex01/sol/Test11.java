package com.eomcs.quiz.ex01.sol;

import java.util.ArrayList;

// 출처: codefights.com
//
// 소문자 알파벳의 문자열이 주어질 때, 서로 다른 알파벳의 개수는?
//
// 예) "cabca" ==> 3
//
/*
Given a string, find the number of different characters in it.

for "cabca" output should be 3

[input] string s

a string of lowercase latin letters
[output] integer
 */
//
// [시간 복잡도]
// - ?
//
public class Test11 {

  public static void main(String[] args) {
    System.out.println(differentSymbolsNaive("cabca") == 3);
  }

  static int differentSymbolsNaive(String s) {
    int result = 0;
    ArrayList<Character> letters = new ArrayList<Character>();
    for (int i = 0; i < s.length(); i++) {
      char character = s.charAt(i);
      if (letters.contains(character)) {
        continue;
      }
      else {
        letters.add(character);
      }
    }
    result = letters.size();
    // 이 메서드를 완성하시오!
    return result;
  }
}











