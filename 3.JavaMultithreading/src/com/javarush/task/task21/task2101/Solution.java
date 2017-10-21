package com.javarush.task.task21.task2101;

/* 
Определяем адрес сети
*/
public class Solution {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {

        byte [] temp = new byte [4];
        for (int i = 0; i < 4; i++) temp[i] = (byte) (((byte) ip[i]) & ((byte) mask[i]));
        return temp;
    }

    public static void print(byte[] bytes) {

        for (int i = 0; i < 4; i++) {
            int o = 0;
            StringBuilder sb = new StringBuilder();
            int k = bytes[i];
            if(k < 0) k+= 256;
            while (k > 0) {
                o = k % 2;
                k = k / 2;
                sb.append(o);
            }
            int digits = sb.length();
            if(digits < 8) {
                for (int j = 0; j < 8-digits ; j++) {
                    sb.append("0");
                }
            }
            sb = sb.reverse();
            System.out.print(sb + " ");
        }
        System.out.println();
    }
}
