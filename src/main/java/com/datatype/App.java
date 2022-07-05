package com.datatype;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // 1 byte
        boolean testBoo = false;

        // 2 byte , 0 ~ 65535
        char c = 'p';

        // 1 byte , -128 ~ 127
        byte bValue = 127;

        // 2 byte , -32768 ~ 32767
        short sValue = 32767;

        // 4 byte , -2147483648 ~ 2147483647
        int ivalue = 2147483647;

        // 8 byte , -9223372036854775808 ~ 9223372036854775807
        long lValue = 9223372036854775807L;

        // 4 byte , -3.4e38 ~ 3.4e38
        float fValue = 3.4e38f;

        // 8 byte , -1.7e308 ~ 1.7e308
        double dValue = 1.7e308;

        System.out.println(testBoo);
        System.out.println(c);
        System.out.println(bValue);
        System.out.println(sValue);
        System.out.println(ivalue);
        System.out.println(lValue);
        System.out.println(fValue);
        System.out.println(dValue);
    }
}
