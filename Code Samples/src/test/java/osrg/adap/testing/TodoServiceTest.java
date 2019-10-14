package osrg.adap.testing;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class TodoServiceTest {

    @Test
    public void testSetDone() {
        // ARRANGE
        TodoRepository repository = mock(TodoRepository.class);
        SlackNotificator notificator = mock(SlackNotificator.class);

        long todoId = 123L;
        TodoService todoService = new TodoService(repository, notificator);
        when(repository.get(todoId)).thenReturn(new TodoItem(todoId, "test todo"));

        // ACT
        todoService.setDone(todoId);

        // ASSERT
        verify(repository, times(1)).get(todoId);
        verify(repository, times(1)).save(new TodoItem(todoId, "test todo", true));
        verify(notificator, times(1)).notify(anyString());
    }
}