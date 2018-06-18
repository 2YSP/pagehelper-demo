package cn.sp.service;

import cn.sp.bean.Person;
import cn.sp.mapper.PersonMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 2YSP on 2018/6/15.
 */
@Service
public class PersonService {

    @Resource
    private PersonMapper personMapper;

    /**
     * 分页查询年龄大于age的
     * @param pageSize
     * @param pageNum
     * @param age
     * @return
     */
    public List<Person> queryPersonByPage(int pageSize,int pageNum,int age){
        PageHelper.startPage(pageNum,pageSize);

        Example example = new Example(Person.class);
        Example.Criteria criteria = example.createCriteria();
        if (age > 0){
            criteria.andGreaterThan("age",age);
        }
        List<Person> personList = personMapper.selectByExample(example);
        return personList;
    }
}
