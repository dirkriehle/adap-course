package osrg.adap.testing;

public class TodoService {

    private TodoRepository todoRepository;
    private SlackNotificator notificator;

    public TodoService(TodoRepository todoRepository, SlackNotificator notificator) {
        this.todoRepository = todoRepository;
        this.notificator = notificator;
    }

    public void setDone(long id) {
        TodoItem todo = this.todoRepository.get(id);
        todo.setDone(true);

        this.todoRepository.save(todo);
        this.notificator.notify("Todo " + todo.getId() + " has been settled!");
    }
}
