package cn.dx.mybatis.service.impl;

import cn.dx.App;
import cn.dx.mybatis.service.CountryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by IntelliJ IDEA.
 * User: Liu Xiongwei
 * Date: 2016-11-30
 * Time: 15:02
 * Description:
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
@WebAppConfiguration
public class CountryServiceImplTest {

    @Autowired
    @Qualifier("CountryService")
    private CountryService countryService;

    @Test
    public void getAll() throws Exception {
        System.out.println(countryService.getAll().size());
    }

    @Test
    public void insert() throws Exception {
        cn.dx.mybatis.domain.model.Test test = new cn.dx.mybatis.domain.model.Test();
        test.setName("测试中文");
        this.countryService.insert(test);
    }

}