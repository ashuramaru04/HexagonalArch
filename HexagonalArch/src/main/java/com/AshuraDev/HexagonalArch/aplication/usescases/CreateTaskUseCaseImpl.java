package com.AshuraDev.HexagonalArch.aplication.usescases;

import com.AshuraDev.HexagonalArch.domain.models.Task;
import com.AshuraDev.HexagonalArch.domain.ports.in.CreateTaskUseCase;
import com.AshuraDev.HexagonalArch.domain.ports.out.TaskRepositoryPort;

public class CreateTaskUseCaseImpl implements CreateTaskUseCase {
    private final TaskRepositoryPort taskRepositoryPort;

    public CreateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Task createTask(Task task) {
        return taskRepositoryPort.save(task);
    }
}
