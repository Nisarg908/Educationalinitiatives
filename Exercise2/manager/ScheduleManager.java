package manager;

import model.Task;
import observer.ScheduleObserver;
import logger.LoggerUtil;

import java.time.LocalTime;
import java.util.*;

public class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> taskList;
    private ScheduleObserver observer;

    private ScheduleManager() {
        taskList = new ArrayList<>();
        observer = new ScheduleObserver();
    }

    public static synchronized ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void addTask(Task task) throws Exception {
        for (Task t : taskList) {
            if (tasksOverlap(t, task)) {
                observer.notifyConflict(task, t);
                throw new Exception("Error: Task conflicts with an existing task.");
            }
        }
        taskList.add(task);
        LoggerUtil.log("Task added: " + task.getDescription());
    }

    public void removeTask(String description) throws Exception {
        boolean found = false;
        for (Task t : taskList) {
            if (t.getDescription().equals(description)) {
                taskList.remove(t);
                LoggerUtil.log("Task removed: " + t.getDescription());
                found = true;
                break;
            }
        }
        if (!found) {
            throw new Exception("Error: Task not found.");
        }
    }

    public void viewTasks() {
        if (taskList.isEmpty()) {
            System.out.println("No tasks scheduled for the day.");
            return;
        }
        Collections.sort(taskList, (t1, t2) -> t1.getStartTime().compareTo(t2.getStartTime()));
        for (Task t : taskList) {
            System.out.println(t);
        }
    }

    public void markTaskAsCompleted(String description) throws Exception {
        boolean found = false;
        for (Task t : taskList) {
            if (t.getDescription().equals(description)) {
                t.setCompleted(true);
                LoggerUtil.log("Task marked as completed: " + t.getDescription());
                found = true;
                break;
            }
        }
        if (!found) {
            throw new Exception("Error: Task not found.");
        }
    }

    private boolean tasksOverlap(Task existing, Task newTask) {
        return (newTask.getStartTime().isBefore(existing.getEndTime()) && newTask.getEndTime().isAfter(existing.getStartTime()));
    }
}
