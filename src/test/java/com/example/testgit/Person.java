package com.example.testgit;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.Test;

import java.util.Date;

/**
 * @author QiangQin
 * * @date 2022/6/24
 */
// 自动生成get set等方法
@Data
@AllArgsConstructor
public class Person {
    @JSONField(name = "AGE")
    private int age;

    @JSONField(name = "FULL NAME")
    private String fullName;

    @JSONField(name = "DATE OF BIRTH")
    private Date dateOfBirth;

//    public Person(int age, String fullName, Date dateOfBirth) {
//        super();
//        this.age = age;
//        this.fullName= fullName;
//        this.dateOfBirth = dateOfBirth;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getFullName() {
//        return fullName;
//    }
//
//    public void setFullName(String fullName) {
//        this.fullName = fullName;
//    }
//
//    public Date getDateOfBirth() {
//        return dateOfBirth;
//    }
//
//    public void setDateOfBirth(Date dateOfBirth) {
//        this.dateOfBirth = dateOfBirth;
//    }

}
