package com.AshuraDev.HexagonalArch.domain.ports.in;



import com.AshuraDev.HexagonalArch.domain.models.Task;

import java.util.List;
import java.util.Optional;

public interface RetrieveTaskUseCase {
    Optional<Task> getTaskById(Long id);
    List<Task> getAllTasks();


}
