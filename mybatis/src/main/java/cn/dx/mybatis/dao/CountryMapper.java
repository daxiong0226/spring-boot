package cn.dx.mybatis.dao;

import cn.dx.mybatis.domain.model.Country;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("CountryMapper")
public interface CountryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Country record);

    int insertSelective(Country record);

    Country selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Country record);

    int updateByPrimaryKey(Country record);

    List<Country> getAll();
}