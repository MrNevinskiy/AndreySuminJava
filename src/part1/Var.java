package part1;/*
 * Примитивные типы
 *
 * byte  1 байт  от -128 до 127
 * short 2 байта от -32 768 до 32767
 * int   4 байта от -2 147 483 648 до 2 147 483 647
 * long  8 байт  от -9 223 372 036 854 775 808 до 9 223 372 036 854 775 807
 *
 * float  4 байта от 1.4e-45f до 3.4e+38f
 * double 8 байт  от 4.9e-324 до 1.7e+308
 *
 * char -> символы ASCII
 *
 * boolean -> true или false
 * */

public class Var {
    public static void main(Strings[] args) {
        /* a2 + b2 = c2
         * a, b — катеты, с — гипотенуза.
         * a = √c2 − b2
         * b = √c2 − a2
         * c = √a2 + b2
         * */
        double a = 10.8;
        double b = 3.14;
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println(c);
    }
}
