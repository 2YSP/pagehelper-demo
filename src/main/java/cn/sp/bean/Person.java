package cn.sp.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 2YSP on 2018/6/15.
 */
@Data
public class Person implements Serializable{

    private Integer id;

    private String name;

    private String sex;

    private Integer age;

    private Date birthday;


}
