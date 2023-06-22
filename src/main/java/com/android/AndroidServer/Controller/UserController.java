package com.android.AndroidServer.Controller;

import com.android.AndroidServer.Service.UserService;
import com.android.AndroidServer.VO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/*")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("user-reg")
    public UserDTO registUser(@RequestBody UserDTO user){

        if(userService.register(user)){
            return userService.login(user.getUId());
        } else {
            return null;
        }
    }

    @PostMapping("user-login")
    public UserDTO login(@RequestBody UserDTO user){
        if(user != null){
            return userService.login(user.getUId());
        }
        return null;
    }

    @PutMapping("user")
    public UserDTO updateUser(@RequestBody UserDTO user){
        System.out.println("user 확인용 ->" + user.getDogName());
        if(userService.updateUser(user)){
            return userService.login(user.getUId());
        } else {
            return null;
        }
    }

    @DeleteMapping("user")
    public int deleteUser(@RequestBody UserDTO user){
        if(userService.deleteUser(user.getUId())){
            return 1;
        } else {
            return 0;
        }
    }

}
