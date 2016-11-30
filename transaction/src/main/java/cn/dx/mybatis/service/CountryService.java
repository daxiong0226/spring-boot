package cn.dx.mybatis.service;

import cn.dx.mybatis.domain.model.Country;
import cn.dx.mybatis.domain.model.Test;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Liu Xiongwei
 * Date: 2016-11-28
 * Time: 15:39
 * Description:
 * To change this template use File | Settings | File Templates.
 */
public interface CountryService {
    List<Country> getAll();

    void insert(Test test);
}
