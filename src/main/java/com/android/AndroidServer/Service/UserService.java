package com.android.AndroidServer.Service;

import com.android.AndroidServer.VO.UserDTO;

public interface UserService {

    public UserDTO login(String uId);

    public boolean updateUser(UserDTO user);

}
