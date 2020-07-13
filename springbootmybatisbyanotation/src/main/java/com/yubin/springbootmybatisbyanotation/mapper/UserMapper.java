package com.yubin.springbootmybatisbyanotation.mapper;

import com.yubin.springbootmybatisbyanotation.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {

    @Insert("insert into user(name,phone,create_time,age) values(#{name},#{phone},#{createTime},#{age})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    int insert(User user);


    @Select("select * from user where id = #{userId}")
    @Results({@Result(column = "create_time", property = "createTime")})
    User findById(Long userId);

    @Select("select * from user")
    @Results({@Result(column = "create_time", property = "createTime")})
    List<User> findAllUser();


    @Update("update user set name=#{name},phone=#{phone},create_time=#{createTime},age=#{age} where id = #{id}")
//    @Results({@Result(column = "create_time", property = "createTime")})
    void update(User user);

//    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    @Delete("delete from user where id = #{id}")
    void delete(Long id);
}
