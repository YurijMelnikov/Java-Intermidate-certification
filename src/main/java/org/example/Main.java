package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Person person1 = new Person();
        person1.dataInput();
        WriteFile write = new WriteFile();
        write.writeFile(person1);
        Person person2 = new Person();
        person2.dataInput();
        write.writeFile(person2);
        Person person3 = new Person();
        person3.dataInput();
        write.writeFile(person3);
        Person person4 = new Person();
        person4.dataInput();
        write.writeFile(person4);
    }
}