package com.AshuraDev.HexagonalArch.domain.ports.out;

import com.AshuraDev.HexagonalArch.domain.models.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepositoryPort {
    Task save(Task task);

    Optional<Task> findById(Long id);

    List<Task> findALL();

    Optional<Task> update(Task task);

    boolean deleteById(Long id);
}
