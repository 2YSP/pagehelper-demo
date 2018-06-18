package cn.sp.controller;

import cn.sp.bean.Person;
import cn.sp.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 2YSP on 2018/6/15.
 */
@RestController
@RequestMapping("person")
public class PersonController {

    @Resource
    private PersonService personService;

    @GetMapping("/{age}")
    public List<Person> getPersons(@PathVariable("age") int age){

        return personService.queryPersonByPage(10,1,age);
    }
}
