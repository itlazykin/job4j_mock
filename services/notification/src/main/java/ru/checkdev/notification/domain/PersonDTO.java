package ru.checkdev.notification.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Calendar;
import java.util.List;

@Data
@AllArgsConstructor
public class PersonDTO {
    private String email;
    private String password;
    private boolean privacy;
    private List<RoleDTO> roles;
    private Calendar created;

}
