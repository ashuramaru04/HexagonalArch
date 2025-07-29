package com.AshuraDev.HexagonalArch.infrastructure.config;


import com.AshuraDev.HexagonalArch.aplication.services.TaskService;
import com.AshuraDev.HexagonalArch.aplication.usescases.*;
import com.AshuraDev.HexagonalArch.domain.ports.in.GetAdditionalTaskInfoUseCase;
import com.AshuraDev.HexagonalArch.domain.ports.out.ExternalServicePort;
import com.AshuraDev.HexagonalArch.domain.ports.out.TaskRepositoryPort;
import com.AshuraDev.HexagonalArch.infrastructure.adapters.ExternalServiceAdapter;
import com.AshuraDev.HexagonalArch.infrastructure.repositories.JpaTaskRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public TaskService taskService(TaskRepositoryPort taskRepositoryPort, GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase) {
        return new TaskService(
                new CreateTaskUseCaseImpl(taskRepositoryPort),
                new RetrieveTaskUseCaseImpl(taskRepositoryPort),
                new UpdateTaskUseCaseImpl(taskRepositoryPort),
                new DeleteTaskUseCaseImpl(taskRepositoryPort),
                getAdditionalTaskInfoUseCase);


    }
    @Bean
    public TaskRepositoryPort taskRepositoryPort (JpaTaskRepositoryAdapter jpaTaskRepositoryAdapter){
        return jpaTaskRepositoryAdapter;
    }
    @Bean
    public GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase (ExternalServicePort externalServicePort){
        return new GetAdditionalTaskInfoUseCaseImpl(externalServicePort);
    }
    @Bean
    public ExternalServicePort externalServicePort() {

        return new ExternalServiceAdapter();
    }

}


