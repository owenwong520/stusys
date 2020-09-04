package com.example.demo.entity;

import lombok.Data;

import java.util.List;
@Data
public class UserPage {
    private long total;
    private long size;
    private long current;
    private long pages;
    private List<UserEntity> records;

}
