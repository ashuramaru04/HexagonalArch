package com.AshuraDev.HexagonalArch.domain.ports.in;

import com.AshuraDev.HexagonalArch.domain.models.Task;

public interface CreateTaskUseCase {
    Task createTask(Task task);
}
