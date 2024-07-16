package com.rodrigopeleias.bookstoremanager.users.mapper;

import com.rodrigopeleias.bookstoremanager.users.dto.UserDTO;
import com.rodrigopeleias.bookstoremanager.users.entity.User;

public class UserMapper {

    public static User toModel(UserDTO userDTO) {
        if (userDTO == null) {
            return null;
        }
        User user = new User();
        user.setId(userDTO.getId());
        user.setName(userDTO.getName());
        user.setAge(userDTO.getAge());
        user.setGender(userDTO.getGender());
        user.setEmail(userDTO.getEmail());
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        user.setBirthDate(userDTO.getBirthDate());
        user.setRole(userDTO.getRole());
        return user;
    }

    public static UserDTO toDTO(User user) {
        if (user == null) {
            return null;
        }
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setAge(user.getAge());
        userDTO.setGender(user.getGender());
        userDTO.setEmail(user.getEmail());
        userDTO.setUsername(user.getUsername());
        userDTO.setPassword(user.getPassword());
        userDTO.setBirthDate(user.getBirthDate());
        userDTO.setRole(user.getRole());
        return userDTO;
    }
}