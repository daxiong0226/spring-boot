package cn.dx.mybatis.dao;

import cn.dx.mybatis.domain.model.City;
import org.springframework.stereotype.Component;

@Component("CityMapper")
public interface CityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}