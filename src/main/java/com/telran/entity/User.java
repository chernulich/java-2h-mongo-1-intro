package com.telran.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

//Document -> Row
//Collection -> Table
//Column -> Field


@Document/*(collection = "persons")*/
public class User /*-> users*/ {

    @Id
    private String id; //hashed alpha-numeric ID

    private String firstName;

    private String lastName;

    private LocalDate dateOfBirth;

}
