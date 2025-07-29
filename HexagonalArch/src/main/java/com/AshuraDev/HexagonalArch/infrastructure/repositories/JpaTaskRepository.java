package com.AshuraDev.HexagonalArch.infrastructure.repositories;


import com.AshuraDev.HexagonalArch.infrastructure.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTaskRepository extends JpaRepository<TaskEntity, Long> {

}
