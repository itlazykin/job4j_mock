package ru.job4j.site.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Calendar;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonDTO {
    private int id;
    private String username;
    private String email;
    private String experience;
    private String salary;
    private PhotoDTO photo;
    private String location;
    private Calendar updated;
    private Calendar created;
}
