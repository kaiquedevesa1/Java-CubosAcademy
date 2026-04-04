package br.com.cubosacademy.util.wrappers;

import java.util.HashMap;
import java.util.Map;

public class WrappersTeste {

    public static void main(String[] args) {
        Integer num1 = 10;
        Integer num2 = 20;

        Integer num3 = 9;

        System.out.println(num1.floatValue());
        System.out.println(num1.equals(11));
        System.out.println(num1.compareTo(num2));


        Boolean flag = false;
        System.out.println(flag);
        Double valor = 12.5;
        System.out.println(valor.intValue());


        Map<Integer,String> map = new HashMap<Integer, String>();
    }
}
