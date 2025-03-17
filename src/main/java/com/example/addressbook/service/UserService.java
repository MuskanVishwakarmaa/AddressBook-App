package com.example.addressbook.service;

import com.example.addressbook.dto.UserDTO;
import com.example.addressbook.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User createUser(UserDTO userDTO);
    User updateUser(Long id, UserDTO userDTO);
    void deleteUser(Long id);
    List<User> saveAllUsers(List<UserDTO> userDTOList);
}