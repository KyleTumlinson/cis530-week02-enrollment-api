package edu.bellvue.cis520.week02.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Student {
    Long id;
    String firstName;
    String lastName;
    String email;
    String courseCode;
    String semester;
}


