package simple.todo_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import simple.todo_app.dao.TaskDao;
import simple.todo_app.model.Task;

import java.util.List;
@Service
public class TaskServiceImpl implements TaskService{
    @Autowired
    private TaskDao taskDao;

    @Override
    public Task addTask(Task task) {
        return taskDao.save(task);
    }

    @Override
    public List<Task> showAllTask() {
        return taskDao.findAll();
    }

    @Override
    public Task getATask(int taskId) {
        return taskDao.findById(taskId).get();
    }

    @Override
    public Task updateTask(Task task) {
        taskDao.save(task);
        return task;
    }

    @Override
    public void deleteTask(int taskId) {
       Task ta = taskDao.findById(taskId).get();
       taskDao.delete(ta);
    }
}
