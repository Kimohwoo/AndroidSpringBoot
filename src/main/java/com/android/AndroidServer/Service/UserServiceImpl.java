package com.android.AndroidServer.Service;

import com.android.AndroidServer.Mapper.UserMapper;
import com.android.AndroidServer.VO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean register(UserDTO user) {
        return userMapper.registUser(user) == 1;
    }

    @Override
    public UserDTO login(String uId) {
        return userMapper.login(uId);
    }
    @Override
    public boolean updateUser(UserDTO user) {
        return userMapper.updateUser(user) == 1;
    }

    @Override
    public boolean deleteUser(String uId) {
        return userMapper.deleteUser(uId) == 1;
    }
}
