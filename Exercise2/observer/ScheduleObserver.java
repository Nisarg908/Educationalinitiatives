package observer;

import model.Task;

public class ScheduleObserver {

    public void notifyConflict(Task newTask, Task existingTask) {
        System.out.println("Conflict Detected: Task '" + newTask.getDescription() + "' overlaps with existing task '"
                + existingTask.getDescription() + "'");
    }
}
