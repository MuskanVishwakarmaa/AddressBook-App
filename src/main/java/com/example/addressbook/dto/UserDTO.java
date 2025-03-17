package com.example.addressbook.dto;

public class UserDTO {
    private String name;
    private String address;
    private int pincode;
    private boolean PermanentAddress;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public boolean isPermanentAddress() {
        return PermanentAddress;
    }

    public void setPermanentAddress(boolean permanentAddress) {
        PermanentAddress = permanentAddress;
    }
}