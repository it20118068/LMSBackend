package com.lmsbackend.service.impl;

import com.lmsbackend.dao.model.AppUser;
import com.lmsbackend.dao.repostory.AppUserRepository;
import com.lmsbackend.dto.request.ProcessRequestDto;
import com.lmsbackend.dto.response.ProcessResponseDto;
import com.lmsbackend.service.i.LMSBackendService;
import com.lmsbackend.util.enums.ApiStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LMSBackendServiceImpl implements LMSBackendService {

    @Autowired AppUserRepository appUserRepository;


    @Transactional
    public ProcessResponseDto saveAppUser(ProcessRequestDto requestDto) {

        ProcessResponseDto responseDto = new ProcessResponseDto();

        try {
            if(requestDto.getAppUser() != null){
                AppUser appUser = new AppUser();
                appUser.setFname(requestDto.getAppUser().getFname());
                appUser.setLname(requestDto.getAppUser().getLname());
                appUser.setEmail(requestDto.getAppUser().getEmail());
                appUser.setUsername(requestDto.getAppUser().getUsername());
                appUser.setPassword(requestDto.getAppUser().getPassword());

                appUserRepository.save(appUser);

                responseDto.setSuccess(true);
                responseDto.setApiStatus(ApiStatus.INSERT_SUCCESS);
            } else {
                responseDto.setSuccess(false);
                responseDto.setApiStatus(ApiStatus.INPUT_NULL);
            }
        } catch (Exception e) {
            responseDto.setSuccess(false);
            System.out.println("saveAppUser : " + e);
        }

        return responseDto;
    }
}
