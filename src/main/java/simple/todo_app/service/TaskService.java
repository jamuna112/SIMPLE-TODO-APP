package simple.todo_app.service;

import simple.todo_app.model.Task;

import java.util.List;

public interface TaskService {

    public Task addTask(Task task);
    public List<Task> showAllTask();
    public Task getATask(int taskId);
    public Task updateTask(Task task);
    public void deleteTask(int taskId);
}
