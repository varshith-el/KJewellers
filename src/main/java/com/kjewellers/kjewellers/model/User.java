package com.kjewellers.kjewellers.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("users")
public class User {
    @Id
    private Long id;
    private String username;
    private String email;
    private String password;
    private boolean isAdmin;

    @CreatedDate
    private LocalDateTime createdAt;



    // You don't need to explicitly define constructors, getters, and setters
    // thanks to Lombok's @Data, @NoArgsConstructor, and @AllArgsConstructor annotations
}
