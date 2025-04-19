package com.example.inventoryManagement;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    List<User> userList;
    UserController(List<User> userList){
        this.userList=userList;
    }
    public User getUser(int userId)
    {
        return this.userList.stream().filter(user -> user.id==userId).findFirst().get();
    }
    public void addUser(User user)
    {
        if(this.userList.stream().filter(user1 -> user1.getId()== user.getId()).count()>1){
            return;
        }
        this.userList.add(user);
    }
    public void delUser(User user)
    {
        if(this.userList.stream().filter(user1 -> user1.getId()==user.getId()).count()==0)
        {
            return;
        }
        this.userList.remove(user);
    }
}
