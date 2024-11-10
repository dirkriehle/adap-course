package osrg.adap.testing;

import java.util.Objects;

public class TodoItem {

    private long id;
    private String content;
    private boolean done;

    public TodoItem(long id, String content) {
        this(id, content, false);
    }

    public TodoItem(long id, String content, boolean done) {
        this.id = id;
        this.content = content;
        this.done = done;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItem todoItem = (TodoItem) o;
        return id == todoItem.id &&
                done == todoItem.done &&
                Objects.equals(content, todoItem.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, id, done);
    }
}
