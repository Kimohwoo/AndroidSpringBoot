package com.android.AndroidServer.Service;

import com.android.AndroidServer.VO.UserDTO;

public interface UserService {

    public UserDTO login(String uId);
    public boolean register(UserDTO user);
    public boolean updateUser(UserDTO user);
    public boolean deleteUser(String uId);

}
