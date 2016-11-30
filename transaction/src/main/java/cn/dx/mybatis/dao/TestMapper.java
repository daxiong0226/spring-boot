package cn.dx.mybatis.dao;

import cn.dx.mybatis.domain.model.Test;
import org.springframework.stereotype.Component;

@Component("TestMapper")
public interface TestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Test record);

    int insertSelective(Test record);

    Test selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}