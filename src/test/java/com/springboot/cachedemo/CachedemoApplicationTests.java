package com.springboot.cachedemo;

import com.springboot.cachedemo.bean.Employee;
import com.springboot.cachedemo.mapper.EmployeeMapper;
import org.junit.Test;
//import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CachedemoApplicationTests {
    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    StringRedisTemplate stringRedisTemplate;  //操作k-v都是字符串的

    @Autowired
    RedisTemplate redisTemplate;  //k-v都是对象的

//    @Autowired
//    RedisTemplate<Object, Employee> empRedisTemplate;

    @Test
    public void test01(){
       // stringRedisTemplate.opsForValue().append("msg","hello");
		String msg = stringRedisTemplate.opsForValue().get("msg");
		System.out.println(msg);
    }
    @Test
    public void contextLoads() {
        Employee getbyid
//                = new Employee();
                = employeeMapper.getEmpById(1);
        System.out.print(getbyid);
//        getbyid.setLastName("wayne");
//        employeeMapper.insertEmployee(getbyid);
        //employeeMapper.deleteEmpById(1);
    }
    @Test
    public  void test02(){
        Employee emp = employeeMapper.getEmpById(2);
        redisTemplate.opsForValue().set("emp-01", emp);
    }

}
