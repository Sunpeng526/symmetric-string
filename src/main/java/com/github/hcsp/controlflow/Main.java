package com.github.hcsp.controlflow;

public class Main {
    public static void main(String[] args) {
        System.out.println(isSymmetric("1234"));
        System.out.println(isSymmetric("1234321"));
    }

    /**
     * 判断一个字符串是否是对称字符串。一个字符串对称意味着它和它的逆序相同。
     *
     * <p>例如，"12321"和"上海自来水d来自海上"是对称字符串 "1234"不是对称字符串
     *
     * @param str 给定的字符串
     * @return 若给定的字符串是对称的，返回true，否则返回false
     */
    public static boolean isSymmetric(String str) {
        boolean isTrue = true;
        for (int i = str.length()-1; i >=0; i--) {
            for (int j = 0; j <str.length() ; j++) {
                if(i + j == str.length()-1){
                    char charFromStrEnd = str.charAt(i);
                    char charFromStrStart = str.charAt(j);
                    if(charFromStrEnd != charFromStrStart){
                        isTrue = false;
                    }
                }
            }
        }
        return isTrue;
    }
}
