package com.lmsbackend.dao.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "app_user", catalog = "lmsdb")
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String fname;
    private String lname;
    private String email;
    private String username;
    private String password;
}
