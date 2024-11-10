package osrg.adap.testing;

public interface TodoRepository {

    TodoItem save(TodoItem todo);
    void delete(long id);
    TodoItem get(long id);
    boolean exists(long id);
}
