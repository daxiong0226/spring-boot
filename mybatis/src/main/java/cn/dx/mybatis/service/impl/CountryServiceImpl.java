package cn.dx.mybatis.service.impl;

import cn.dx.mybatis.dao.CountryMapper;
import cn.dx.mybatis.domain.model.Country;
import cn.dx.mybatis.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Liu Xiongwei
 * Date: 2016-11-28
 * Time: 15:40
 * Description:
 * To change this template use File | Settings | File Templates.
 */
@Service("CountryService")
public class CountryServiceImpl implements CountryService {

    @Autowired
    @Qualifier("CountryMapper")
    private CountryMapper countryMapper;

    @Override
    public List<Country> getAll() {
        return this.countryMapper.getAll();
    }
}
