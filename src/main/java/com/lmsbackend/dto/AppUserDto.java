package com.lmsbackend.dto;

import lombok.Data;

@Data
public class AppUserDto {
    private Integer id;
    private String fname;
    private String lname;
    private String email;
    private String username;
    private String password;
}
