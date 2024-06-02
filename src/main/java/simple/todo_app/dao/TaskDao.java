package simple.todo_app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import simple.todo_app.model.Task;

public interface TaskDao extends JpaRepository<Task, Integer> {
}
