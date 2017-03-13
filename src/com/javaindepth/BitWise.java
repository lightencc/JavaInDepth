package com.javaindepth;

/**
 * Created by chen on 3/13/2017.
 */
public class BitWise {
    public static void main(String[] args) {

        /**
         *  & -> Bitwise AND
         *
         *  x   00000001
         *  y   00000011
         *      00000001
         */
        System.out.println(1&3);



        /**
         *  | -> Bitwise OR
         *
         *  x   00000001
         *  y   00000011
         *      00000011
         */
        System.out.println(1|3);

        /**
         *  ^ -> Bitwise XOR (Exclusive OR)
         *
         *  x   00000001
         *  y   00000011
         *      00000010
         *  ~ -> Bitwise NOT
         */
        System.out.println(1^3);

        /**
         *  ~ -> Bitwise NOT
         *
         *  x   00000000 00000000 00000000 00000001
         * ~x   11111111 11111111 11111111 11111110
         *
         */
        System.out.println(~1);

    }


}
