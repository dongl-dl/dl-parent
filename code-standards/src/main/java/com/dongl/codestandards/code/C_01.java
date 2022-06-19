package com.dongl.codestandards.code;


import com.dongl.codestandards.User;
import org.apache.commons.lang3.StringUtils;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 1、目的是使开发人员能以标准的、规范的方式设计和编码，通过独立的编码规范，以使每一个开发人员养成良好的编码风格和习惯，
 * 并以此形成开发规范，提高程序的可靠性，代码的可读性、可修改性、可维护性和一致性；增进团队的交流，保证软件产品的质量。
 *
 * 2、对于代码而言，首要的要求就是
 *
 *
 *
 *
 *
 * 格式：
 *     采用4个空格进行缩进，严禁使用tab字符，
 *     行宽一般设置为120个字符，超出需要进行换行
 */
public class C_01 {

    /**
     * 正例
     * @param name
     */
    public void addName(String name) {
        if(StringUtils.isNotBlank(name)){
            System.out.println("添加姓名："+ name);
        }else {
            System.out.println("姓名为空");
        }
    }


    /**
     * 反例
     * @param name
     */
    public void updateName(String name) {
        //缩进过多
            if(StringUtils.isNotBlank(name))
            {
                System.out.println("修改姓名："+ name);
            }
            //2、进行了过度的换行
            else
            {
                System.out.println("姓名为空");
            }
    }



    /**
     * 正例
     */
    public void addUserList(List<User> userList) {
        List<User> addUserList = userList.stream().filter(user -> user.getAge() > 18)
                .sorted(Comparator.comparing(User::getAge))
                .collect(Collectors.toList());
        int sum = 123 + 456 + 789 + 452 + 478 + 852 + 694 + 452 + 215 + 123 + 456 + 789 + 452 + 478 + 852 + 694
                + 452 + 215 + 123 + 456 + 789 + 452 + 478 + 852 + 694 + 452 + 215;

        String message = getMessage("requestMessageParam1", "requestMessageParam2", "requestMessageParam3",
                "requestMessageParam4");
    }


    /**
     * 反例
     */
    public void updateUserList(List<User> userList) {
        //行宽超过120字符需要进行换行
        List<User> addUserList = userList.stream().filter(user -> user.getAge() > 18).sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList());

        //括号前不要换行
        List<User> addUserList1 = userList.stream().filter(user -> user.getAge() > 18).sorted
                (Comparator.comparing(User::getAge)).collect(Collectors.toList());

        //换行带符号
        int sum = 123 + 456 + 789 + 452 + 478 + 852 + 694 + 452 + 215 + 123 + 456 + 789 + 452 + 478 + 852 + 694 +
                452 + 215 + 123 + 456 + 789 + 452 + 478 + 852 + 694 + 452 + 215;

        //逗号后换行
        String message = getMessage("requestMessageParam1", "requestMessageParam2", "requestMessageParam3"
                , "requestMessageParam4");
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
