package main.java.com.tattookot.patterns.youtube.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleChat implements Chat{
    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUserToChar(User user){
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for(User user1 : users){
            if(user1 != user){
                user1.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}
