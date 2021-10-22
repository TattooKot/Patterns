package main.java.com.tattookot.patterns.youtube.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleChat chat = new SimpleChat();

        User admin = new Admin(chat, "Admin");
        User user1 = new SimpleUser(chat, "User 1");
        User user2 = new SimpleUser(chat, "User 2");

        chat.setAdmin(admin);
        chat.addUserToChar(user1);
        chat.addUserToChar(user2);

        user1.sendMessage("Hello from user 1");
        admin.sendMessage("Hello from admin");
    }
}
