package com.example.addressbook.dto;
import lombok.Data;

@Data
public class UserDTO {
    private String name;
    private String address;
    private int pincode;
    private boolean PermanentAddress;
}