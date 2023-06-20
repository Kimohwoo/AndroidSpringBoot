package com.android.AndroidServer.Mapper;

import com.android.AndroidServer.VO.UserDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    public UserDTO login(String uId);

    public UserDTO registUser(UserDTO user);

    public int updateUser(UserDTO user);

}
