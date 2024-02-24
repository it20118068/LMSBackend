package com.lmsbackend.dto.response;

import com.lmsbackend.dao.model.AppUser;
import com.lmsbackend.util.enums.ApiStatus;
import lombok.Data;

import java.util.List;

@Data
public class ProcessResponseDto {
    private List<AppUser> appUserList;
    private ApiStatus apiStatus;
    private boolean isSuccess;
}
