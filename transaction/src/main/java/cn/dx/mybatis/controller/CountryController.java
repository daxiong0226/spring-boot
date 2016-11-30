package cn.dx.mybatis.controller;

import cn.dx.mybatis.domain.model.Country;
import cn.dx.mybatis.service.CountryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Liu Xiongwei
 * Date: 2016-11-28
 * Time: 15:32
 * Description:
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    @Qualifier("CountryService")
    private CountryService countryService;

    @RequestMapping
    public String getAll(Model model,Country country){
        List<Country> countryList = this.countryService.getAll();
        model.addAttribute("pageInfo",new PageInfo<Country>(countryList));
        model.addAttribute("queryParam",country);
        model.addAttribute("page",10);
        model.addAttribute("rows",1);
        return "index";
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<Country> list(@RequestParam(required = false, defaultValue= "0") int offset,
                              @RequestParam(required = false, defaultValue = "10") int limit){
        //搜索前拦截
        PageHelper.startPage(offset/limit + 1, limit);
        List<Country> list = this.countryService.getAll();
        PageInfo page = new PageInfo(list);
        return page.getList();
    }

}
