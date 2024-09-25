package model;

import java.time.LocalTime;

public class TaskFactory {
    public Task createTask(String description, String startTime, String endTime, String priority) throws Exception {
        try {
            LocalTime start = LocalTime.parse(startTime);
            LocalTime end = LocalTime.parse(endTime);
            if (start.isAfter(end)) {
                throw new Exception("Error: Start time cannot be after end time.");
            }
            return new Task(description, start, end, priority);
        } catch (Exception e) {
            throw new Exception("Error: Invalid time format. Please use HH:mm.");
        }
    }
}
