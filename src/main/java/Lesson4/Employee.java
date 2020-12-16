package Lesson4;


/* 1.	Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
   2.	Конструктор класса должен заполнять эти поля при создании объекта.
   3.	Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
   4.	Создать массив из 5 сотрудников.
   5.	С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
*/


import javax.imageio.stream.FileImageOutputStream;

public class Employee {

    private String FIO;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String b, String FIO) {this.FIO = FIO;}


    Employee (String FIO, String position,  String email, String phone, int salary, int age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    String getFIO() {
        return FIO;
    }
    String getPosition() {
        return position;
    }
    String getEmail() {
        return email;
    }
    String getPhone() {
        return phone;
    }
    int getSalary() {
        return salary;
    }
    int getAge() {
        return age;
    }


}
