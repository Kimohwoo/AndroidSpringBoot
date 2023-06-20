package com.android.AndroidServer.Controller;

import com.android.AndroidServer.Service.UserService;
import com.android.AndroidServer.VO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("user")
    public UserDTO registUser(@RequestBody UserDTO user){

        return null;
    }

    @PostMapping("user")
    public UserDTO login(@RequestBody UserDTO user){

        if(user != null){
            return userService.login(user.getUId());
        }
        return null;
    }

    @PutMapping("user")
    public UserDTO updateUser(@RequestBody UserDTO user){
        if(userService.updateUser(user)){
            return userService.login(user.getUId());
        } else {
            return null;
        }
    }

}
