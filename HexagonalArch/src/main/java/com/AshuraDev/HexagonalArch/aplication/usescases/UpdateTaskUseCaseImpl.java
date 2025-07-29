package com.AshuraDev.HexagonalArch.aplication.usescases;

import com.AshuraDev.HexagonalArch.domain.models.Task;
import com.AshuraDev.HexagonalArch.domain.ports.in.UpdateTaskUseCase;
import com.AshuraDev.HexagonalArch.domain.ports.out.TaskRepositoryPort;


import java.util.Optional;

public class UpdateTaskUseCaseImpl implements UpdateTaskUseCase {
    private final TaskRepositoryPort taskRepositoryPort;

    public UpdateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }


    @Override
    public Optional<Task> updateTask(Long id, Task updateTask) {
        return taskRepositoryPort.update(updateTask);
    }
}
