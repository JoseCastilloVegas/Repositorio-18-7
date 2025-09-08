package com.example.Prueba_Test.servicios;


import com.example.Prueba_Test.Service.UserService;
import com.example.Prueba_Test.domain.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
@Transactional //Limpia la base de datos embebida antes de cada test
@TestInstance(TestInstance.Lifecycle.PER_CLASS) // Se usa para que el metodo beforeAll pueda ser no estatico
public class UserServiceIntegrationTest {

    @Autowired
    UserService userService;

    @BeforeAll
    void before() {

        User user = new User(null, "mainUser", "emailMainUser");

        userService.registerUser(user.getName(), user.getEmail());

        User user2 = new User(null, "mainUser2", "emailMainUser2");

        userService.registerUser(user2.getName(), user2.getEmail());


    }


    @Test
    void registerUserTest() {

        User user = new User(null, "Pepe", "emailPepe");

        assertThrows(IllegalArgumentException.class, () -> userService.getUserByEmail("emailPepe"));

        userService.registerUser(user.getName(), user.getEmail());

        User userFromDB = userService.getUserByEmail("emailPepe");

        assertNotNull(userFromDB);

        assertEquals(user.getName(), userFromDB.getName());

        assertEquals(user.getEmail(), userFromDB.getEmail());

    }

    @Test

    void borrar(){

        User user=userService.getUserByEmail("emailMainUser");

        assertNotNull(userService.getUserByEmail("emailMainUser"));

        userService.borrar(userService.getUserByEmail("emailMainUser").getId());

        assertThrows(IllegalArgumentException.class, () -> userService.getUserByEmail("emailMainUser"));


    }

}
