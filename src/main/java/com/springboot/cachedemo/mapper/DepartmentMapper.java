package com.springboot.cachedemo.mapper;

//import com.atguigu.cache.bean.Department;
import com.springboot.cachedemo.bean.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DepartmentMapper {

    @Select("SELECT * FROM department WHERE id = #{id}")
    Department getDeptById(Integer id);
}
