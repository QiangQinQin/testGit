package com.example.testgit;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author QiangQin
 * * @date 2022/7/24
 */
public class testOOM {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            String str = "";
            for (int j = 0; j < 100; j++) {
                str += UUID.randomUUID().toString();
            }


            list.add(str);
        }
        System.out.println("ok");
    }
}
