package cn.dx.mybatis.service.impl;

import cn.dx.mybatis.dao.CountryMapper;
import cn.dx.mybatis.dao.TestMapper;
import cn.dx.mybatis.domain.model.Country;
import cn.dx.mybatis.domain.model.Test;
import cn.dx.mybatis.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Autowired
    @Qualifier("TestMapper")
    private TestMapper testMapper;

    @Transactional(readOnly = true,rollbackFor = Throwable.class)
    @Override
    public List<Country> getAll() {
        Test test = new Test();
        test.setName("333");
        insert(test);
        return this.countryMapper.getAll();
    }

    @Transactional
    @Override
    public void insert(Test test) {
        this.testMapper.insert(test);
        int i = 1/0;
    }
}
