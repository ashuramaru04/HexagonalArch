package com.AshuraDev.HexagonalArch.aplication.usescases;

import com.AshuraDev.HexagonalArch.domain.models.AdditionalTaskInfo;
import com.AshuraDev.HexagonalArch.domain.ports.in.GetAdditionalTaskInfoUseCase;
import com.AshuraDev.HexagonalArch.domain.ports.out.ExternalServicePort;


public class GetAdditionalTaskInfoUseCaseImpl implements GetAdditionalTaskInfoUseCase {
    private final ExternalServicePort externalServicePort;

    public GetAdditionalTaskInfoUseCaseImpl(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }


    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long Id) {
        return externalServicePort.getAdditionalTaskInfo(Id);
    }
}
