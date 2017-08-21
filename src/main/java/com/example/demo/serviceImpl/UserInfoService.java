package com.example.demo.serviceImpl;

import com.example.demo.service.IUserInfo;
import org.springframework.stereotype.Service;
/**
 * Created by think on 2017/8/21.
 */
@Service("userInfoService")
public class UserInfoService implements IUserInfo {
    @Override
    public String GetUserInfo(int id) {
        return "Y1986";
    }
}
