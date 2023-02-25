package com.rest.model.entity;

import com.rest.model.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * Used to store information about user.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String password;
    private String phoneNumber;
    private String emailAddress;
    private Timestamp createDate;
    private Timestamp updateDate;
    private UserRole role;
}
