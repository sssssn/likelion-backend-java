package com.likelion.project02.week7.day3;

import java.util.List;

public class DBMain extends BaseDAO {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();
        personDAO.initPerson();
        System.out.println( personDAO.insertPerson("sn") );
        System.out.println( personDAO.insertPerson("tofu") );
        List<Person> personList = personDAO.findAllPerson();
        System.out.println(personList.toString());
        System.out.println( personDAO.findByNamePerson("pang") );
    }
}