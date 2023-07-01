package com.codestates.seb.calculator;
import java.util.*;

public class Calculator {
  public static void main(String[] args) {
    boolean run = true;
    while (run == true) {
      System.out.println("===Java Calculator===");


      System.out.println("첫번째 숫자를 입력하세요");
      Scanner numInput1 = new Scanner(System.in);
      double inputNumber1 = numInput1.nextFloat();

      System.out.println("연산자를 입력하세요(+, -, *, / )");
      Scanner operator = new Scanner(System.in);
      String operatorInput = operator.nextLine();


      System.out.println("두번째 숫자를 입력하세요");
      Scanner numInput2 = new Scanner(System.in);
      double inputNumber2 = numInput2.nextFloat();


      if (operatorInput.equals("+")) {
        System.out.println(add(inputNumber1, inputNumber2));
        run = false;
      }

      if (operatorInput.equals("-")) {
        System.out.println(minus(inputNumber1, inputNumber2));
        run = false;
      }

      if (operatorInput.equals("*")) {
        System.out.println(multi(inputNumber1, inputNumber2));
        run = false;
      }

      if (operatorInput.equals("/")) {
        System.out.println(div(inputNumber1, inputNumber2));
        run = false;
      }
    }
  }




  public static String add(double num1, double num2) {
    double result = num1 + num2;

    return String.format("%f + %f = ",num1,num2)+String.format("%f",result);
  }

  public static String minus(double num1, double num2) {
    double result = num1 - num2;

    return String.format("%f - %f = ",num1,num2)+String.format("%f",result);
  }

  public static String div(double num1, double num2) {
    double result = num1 / num2;

    return String.format("%f / %f = ",num1,num2)+String.format("%f",result);
  }


  public static String multi(double num1, double num2) {
    double result = num1 * num2;

    return String.format("%f * %f = ",num1,num2)+String.format("%f",result);
  }
}




        /*
            요구 사항에 따라 간단한 계산기를 만들어주세요.
            1. 사용자의 입력으로 첫 번째 숫자, 연산자, 두 번째 숫자를 받아야 합니다.ok
            2. 연산자의 종류는 +, -, *, / 입니다. ok
            3. 소수점 연산을 수행할 수 있어야 합니다. ok
            4. 연산 결과를 콘솔에 출력합니다.  ok
        */
    // TODO...

