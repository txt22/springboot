package com.example.demo.restful;
import com.example.demo.dao.UserInfoMapper;
import com.example.demo.service.IUserInfo;
import com.example.demo.model.UserInfo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by think on 2017/8/19.
 */
@Controller
@RequestMapping(value = "/Home")
public class HomeController {

    private Logger logger = Logger.getLogger(HomeController.class);

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private IUserInfo userInfoService ;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model Model){
        Model.addAttribute("name",userInfoService.GetUserInfo(1));
        return "index";
    }

    @RequestMapping(value = "userlist",method = RequestMethod.GET)
    @ResponseBody
    public List<UserInfo> userList(@RequestParam(value = "page",defaultValue = "1")int page,
                                   @RequestParam(value = "pageSize",defaultValue = "10")int pageSize){
        PageHelper.startPage(page,pageSize);
        Page<UserInfo> pageInfos = userInfoMapper.selectAll();
        return pageInfos;
    }
}