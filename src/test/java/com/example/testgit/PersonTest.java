package com.example.testgit;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author QiangQin
 * * @date 2022/6/24
 */
public class PersonTest {
    public static void main(String[] args) {
        List<Person> listOfPersons = new ArrayList<Person>();

        listOfPersons.add(new Person(15, "John Doe", new Date()));
        listOfPersons.add(new Person(20, "Janette Doe", new Date()));


        String jsonOutput = JSON.toJSONString(listOfPersons);
        System.out.println(jsonOutput);

    }

}
