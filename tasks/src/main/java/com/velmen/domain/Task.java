package com.velmen.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
public class Task {

    private Long Id;
    private String name;
    private LocalDate dueDate;
    private Boolean completed;
}
