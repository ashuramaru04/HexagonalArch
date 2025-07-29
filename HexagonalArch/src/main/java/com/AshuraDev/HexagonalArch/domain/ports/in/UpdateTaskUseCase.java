package com.AshuraDev.HexagonalArch.domain.ports.in;

import com.AshuraDev.HexagonalArch.domain.models.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {
    Optional<Task> updateTask(Long id, Task updateTask);


}
