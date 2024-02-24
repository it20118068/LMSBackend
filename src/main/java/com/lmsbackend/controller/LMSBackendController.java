package com.lmsbackend.controller;

import com.lmsbackend.dto.request.ProcessRequestDto;
import com.lmsbackend.dto.response.ProcessResponseDto;
import com.lmsbackend.service.i.LMSBackendService;
import com.lmsbackend.util.common.REST_CONTROLLER_URL;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class LMSBackendController {
    @Autowired
    LMSBackendService service;

    @RequestMapping(value = REST_CONTROLLER_URL.SAVE_USER, method = RequestMethod.POST)
    public @ResponseBody ProcessResponseDto saveAppUser(@RequestBody ProcessRequestDto requestDto, HttpServletRequest request){
        ProcessResponseDto responseDto = new ProcessResponseDto();
        responseDto = service.saveAppUser(requestDto);
        return responseDto;
    }
}
