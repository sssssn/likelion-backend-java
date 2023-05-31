package com.likelion.project02.week7.day3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class PersonDAOTest {

    PersonDAO personDAO = new PersonDAO();

    @BeforeEach
    void setUp() {
        personDAO.initPerson();
    }

    @Test
    void findByNamePerson() {
        String name = "sn";
        personDAO.insertPerson(name);
        assertEquals(name, personDAO.findByNamePerson(name).get().getName());
        assertNotEquals(name, personDAO.findByNamePerson("aa"));
        assertEquals(Optional.empty(), personDAO.findByNamePerson("aa"));
    }

    @Test
    void findAllPerson() {
        personDAO.insertPerson("sn");
        personDAO.insertPerson("tofu");
        assertEquals("[001 sn, 002 tofu]", personDAO.findAllPerson().toString());
    }

    @Test
    void insertPerson() {
        int cnt = personDAO.insertPerson("sn");
        assertEquals(1, cnt);
    }
}