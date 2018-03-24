package com.velmen.service;

import com.velmen.domain.Task;

public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);
}
