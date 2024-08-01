package com.example;

import com.example.model.UserCommand;
import com.example.mapper.UserMapper;
import com.example.domain.User;
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String... args) {
        System.out.println(StringUtils.capitalize("hello world!"));

        User user = User.builder()
                .firstName("first")
                .lastName("last")
                .age(8)
                .build();
        UserCommand userCommand = UserMapper.INSTANCE.userToUserCommand(user);

        System.out.println(userCommand);
    }
}