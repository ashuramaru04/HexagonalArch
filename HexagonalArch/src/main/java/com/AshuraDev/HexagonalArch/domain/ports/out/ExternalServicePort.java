package com.AshuraDev.HexagonalArch.domain.ports.out;

import com.AshuraDev.HexagonalArch.domain.models.AdditionalTaskInfo;

public interface ExternalServicePort {
    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);
}
