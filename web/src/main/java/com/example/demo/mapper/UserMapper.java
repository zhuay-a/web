package com.example.demo.mapper;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM s_course")
    List<User> findAll();

    @Insert("insert into s_course value(#{id},#{name},#{hours},#{sid})")
    int insert(User user);
    int update(User user);
    @Delete("delete from s_course where id = #{id}")
    Integer deleteById(@Param("id") Integer id);
}
