package com.example.day_4_task.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    Integer id;
    String name;
    String address;
    String contact;
}
