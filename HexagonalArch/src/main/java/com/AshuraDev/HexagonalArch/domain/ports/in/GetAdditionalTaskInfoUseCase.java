package com.AshuraDev.HexagonalArch.domain.ports.in;

import com.AshuraDev.HexagonalArch.domain.models.AdditionalTaskInfo;

public interface GetAdditionalTaskInfoUseCase {
    AdditionalTaskInfo getAdditionalTaskInfo(Long Id);
}
