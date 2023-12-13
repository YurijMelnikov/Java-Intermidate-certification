package org.example;

import java.io.IOException;

public class Person {
    private String SecondName;
    private String firstName;
    private String surName;
    private String dateOfBirth;
    private Long phoneNumber;
    private String sex;

    public Person() {
    }

    public void dataInput() throws IOException {
        try {
            KeyboardInput keyboardInput = new KeyboardInput();
            this.SecondName = keyboardInput.dataInput("Введите Фамилию").trim();
            this.firstName = keyboardInput.dataInput("Введите Имя").trim();
            this.surName = keyboardInput.dataInput("Введите Отчество").trim();
            this.dateOfBirth = keyboardInput.dataInput("Введите Дату рождения в формате dd.mm.yyyy").trim();
            try {
                this.phoneNumber = Long.parseLong(keyboardInput.dataInput("Введите Номер телефона в виде числа без пробелов и знаков").trim());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            this.sex = keyboardInput.dataInput("Введите Пол f или m").trim();
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException();
        }
    }

    public String getSecondName() {
        return SecondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public String getSex() {
        return sex;
    }
}

