package task049_ChatBot.service;

import java.util.HashMap;
import java.util.Map;

import task049_ChatBot.service.tasks.Task;

public class ChatBotService {
    private final TasksService tasksService = new TasksService();
    private final Map<Integer, Task> clientCondition = new HashMap<>();

    public String completeTask(String message, Integer clientId) {
        if (!clientCondition.containsKey(clientId))
            clientCondition.put(clientId, tasksService.iterator().next());
        else {
            clientCondition.get(clientId).completeTask(message);
            if (clientCondition.get(clientId).hasNext()) {
                clientCondition.put(clientId, clientCondition.get(clientId).next());
            } else {
                clientCondition.remove(clientId);
                return "";
            }
        }
        return clientCondition.get(clientId).getText();
    }
}
