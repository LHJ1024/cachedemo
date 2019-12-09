package com.springboot.cachedemo;

import com.springboot.cachedemo.bean.Employee;
import com.springboot.cachedemo.mapper.EmployeeMapper;
import org.junit.Test;
//import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CachedemoApplicationTests {
    @Autowired
    EmployeeMapper employeeMapper;

    @Test
    public void contextLoads() {
        Employee getbyid
//                = new Employee();
                = employeeMapper.getEmpById(2);
        System.out.print(getbyid);
//        getbyid.setLastName("wayne");
//        employeeMapper.insertEmployee(getbyid);
        //employeeMapper.deleteEmpById(1);
    }

}
