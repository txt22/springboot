package com.example.demo.dao;

/**
 * Created by think on 2017/8/20.
 */
import com.example.demo.model.UserInfo;
import com.github.pagehelper.Page;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    @Select("select * from user_info")
    Page<UserInfo> selectAll();
}