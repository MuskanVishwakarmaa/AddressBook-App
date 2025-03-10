package com.example.addressBook.services;

import com.example.addressBook.dto.UserDTO;
import com.example.addressBook.model.User;
import com.example.addressBook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public User createUser(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setAddress(userDTO.getAddress());
        user.setPincode(userDTO.getPincode());
        user.setPermanentAddress(userDTO.isPermanentAddress());
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Long id, UserDTO userDTO) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        user.setName(userDTO.getName());
        user.setAddress(userDTO.getAddress());
        user.setPincode(userDTO.getPincode());
        user.setPermanentAddress(userDTO.isPermanentAddress());
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> saveAllUsers(List<UserDTO> userDTOList) {
        // Convert UserDTO list to User list
        List<User> users = userDTOList.stream()
                .map(dto -> {
                    User user = new User();
                    user.setName(dto.getName());
                    user.setAddress(dto.getAddress());
                    user.setPincode(dto.getPincode());
                    user.setPermanentAddress(dto.isPermanentAddress());
                    return user;
                })
                .collect(Collectors.toList());

        // Save all users to the database
        return userRepository.saveAll(users);
    }
}