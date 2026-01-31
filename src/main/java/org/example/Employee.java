package org.example;

import org.w3c.dom.Element;

import java.util.List;

public class Employee {
    public long id;
    public String firstName;
    public String lastName;
    public String country;
    public int age;

    public Employee() {
        // Пустой конструктор
        /*this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.age = age;*/
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", country='" + country + '\'' + ", age=" + age + '}';
    }

    public Employee(long id, String firstName, String lastName, String country, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.age = age;
    }

    public static Employee createFromElement(Element empElement) {
        // Извлекаем данные из атрибутов

        long id = Long.parseLong(empElement.getElementsByTagName("id").item(0).getTextContent());
        String firstName = empElement.getElementsByTagName("firstName").item(0).getTextContent();
        String lastName = empElement.getElementsByTagName("lastName").item(0).getTextContent();
        String country = empElement.getElementsByTagName("country").item(0).getTextContent();
        int age = Integer.parseInt(empElement.getElementsByTagName("age").item(0).getTextContent());

        // Создаем объект Employee
        return new Employee(id, firstName, lastName, country, age);
    }
}
