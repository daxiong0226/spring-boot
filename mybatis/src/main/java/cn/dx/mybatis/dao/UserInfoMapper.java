package cn.dx.mybatis.dao;

import cn.dx.mybatis.domain.model.UserInfo;
import org.springframework.stereotype.Component;

@Component("UserInfoMapper")
public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}