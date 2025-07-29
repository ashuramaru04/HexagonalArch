package com.AshuraDev.HexagonalArch.aplication.usescases;

import com.AshuraDev.HexagonalArch.domain.ports.in.DeleteTaskUseCase;
import com.AshuraDev.HexagonalArch.domain.ports.out.TaskRepositoryPort;

public class DeleteTaskUseCaseImpl implements DeleteTaskUseCase {
    private final TaskRepositoryPort taskRepositoryPort;


    public DeleteTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public boolean deleteTask(Long id) {
        return taskRepositoryPort.deleteById(id);
    }
}
