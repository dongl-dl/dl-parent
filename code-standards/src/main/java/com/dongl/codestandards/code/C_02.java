package com.dongl.codestandards.code;


/**
 *
 */
public class C_02 {

    /**
     * 正例
     * @param m 参数1
     * @param n 参数2
     */
    public void addName(int m, int n) {
        int a = m;
        int b = n;
        if(a == b) {
            getMessage("param1", "param2", "param3", "param4");
        }
    }

    /**
     * 反例
     * @param m 参数1
     * @param n 参数2
     */
    public void updateName(int m, int n) {
        int a=m;
        int b=n;
        if(a==b) {
            getMessage("param1","param2","param3","param4");
        }
    }

    /**
     *  获取信息
     * @param param1 参数1
     * @param param2 参数2
     * @param param3 参数3
     * @param param4 参数4
     */
    private String getMessage(String param1, String param2, String param3, String param4) {
        System.out.println("获取信息");
        return "SUCCESS";
    }
}
