package com.lmsbackend.service.i;

import com.lmsbackend.dto.request.ProcessRequestDto;
import com.lmsbackend.dto.response.ProcessResponseDto;

public interface LMSBackendService {
    public ProcessResponseDto saveAppUser(ProcessRequestDto requestDto);
}
