package task049_ChatBot;

import task049_ChatBot.controlleres.ChatBotController;

public class Main {
    public static void main(String[] args) {
        ChatBotController botController = new ChatBotController();
        System.out.println(botController.completeTask("1", 1));
        System.out.println(botController.completeTask("1", 1));
        System.out.println(botController.completeTask("1", 1));
        System.out.println(botController.completeTask("1", 1));
    }
}
