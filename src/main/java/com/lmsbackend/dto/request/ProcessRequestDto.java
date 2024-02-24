package com.lmsbackend.dto.request;

import com.lmsbackend.dao.model.AppUser;
import lombok.Data;

@Data
public class ProcessRequestDto {
    private AppUser appUser;
}
