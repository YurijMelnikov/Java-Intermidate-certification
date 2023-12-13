package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public WriteFile() {
    }

    public void writeFile(Person person) throws IOException {
        try {

            if (person.getSecondName() == null || person.getSecondName().matches("^ *$")) {
                System.out.println("Ошибка, поле Фамилия не заполнено");
                throw new CustomExceptions("Не все поля правильно заполнены");
            }
            if (person.getFirstName() == null || person.getFirstName().matches("^ *$")) {
                System.out.println("Ошибка, поле Имя не заполнено");
                throw new CustomExceptions("Не все поля правильно заполнены");
            }
            if (person.getSurName() == null || person.getSurName().matches("^ *$")) {
                System.out.println("Ошибка, поле Отчество не заполнено");
                throw new CustomExceptions("Не все поля правильно заполнены");
            }
            if (person.getDateOfBirth() == null || !person.getDateOfBirth().matches("^\\d{1,2}.\\d{1,2}.\\d{4}$")) {
                System.out.println("Ошибка, поле Дата рождения не заполнено или заполнено не правильно");
                throw new CustomExceptions("Не все поля правильно заполнены");
            }
            if (person.getPhoneNumber() == null) {
                System.out.println("Ошибка, поле Номер телефона не заполнено");
                throw new CustomExceptions("Не все поля правильно заполнены");
            }
            if (person.getSex() == null || !person.getSex().matches("^[fFmM]$")) {
                System.out.println("Ошибка, поле Пол не заполнено или заполнено не правильно");
                throw new CustomExceptions("Не все поля правильно заполнены");
            }

            StringBuilder stringData = new StringBuilder();
            stringData.append(person.getSecondName())
                    .append(" ")
                    .append(person.getFirstName())
                    .append(" ")
                    .append(person.getSurName())
                    .append(" ")
                    .append(person.getDateOfBirth())
                    .append(" ")
                    .append(person.getPhoneNumber().toString())
                    .append(" ")
                    .append(person.getSex())
                    .append("\n");
            File file = new File(person.getSecondName());
            if (!file.exists()) {
                file.createNewFile();
                System.out.printf("Файл \"%s\" успешно создан\n", person.getSecondName());
            }
            else
            {
                System.out.printf("Файл \"%s\" уже существует\n", person.getSecondName());
            }
            FileWriter writer = new FileWriter(file, true);
            writer.write(stringData.toString());
            writer.flush();
            writer.close();
            System.out.println("Данные успешно записаны в файл");

        } catch (CustomExceptions ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException(e);
        }
    }
}