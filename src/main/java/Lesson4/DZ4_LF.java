package Lesson4;

/* 1.	Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
   2.	Конструктор класса должен заполнять эти поля при создании объекта.
   3.	Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
   4.	Создать массив из 5 сотрудников.
   5.	С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
*/

public class DZ4_LF {
    public static void main(String[] args) {

        Employee mainEmployee = new Employee ("Иванов Иван Иванович", "Инженер", "Ivanov@mail.ru", "89162345678", 15000, 32);

        System.out.println("ФИО: " + mainEmployee.getFIO() + ", " + "должность: " + mainEmployee.getPosition());

        Employee[] employees = {
                mainEmployee,
                new Employee("Сухарев Федор Григорьевич", "Проектировщик", "Sucharev@mail.ru", "89161111111", 25000, 40),
                new Employee("Севастьянов Дмитрий Анатольевич", "Руководитель группы", "sevastyanov@mail.ru", "89162340001", 35000, 43),
                new Employee("Лукина Анна Петровна", "Инженер", "Lukina@mail.ru", "89161345876", 15000, 41),
                new Employee("Шорохова Антонина Михайловна", "Ассистент", "Shorochova@mail.ru", "89161150413", 10000, 22),
        };

        System.out.println();

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                System.out.println("ФИО:  " + employees[i].getFIO() + "  " +
                        "Должность:  " + employees[i].getPosition() + "  " +
                        "email:  " + employees[i].getEmail() + "  " +
                        "телефон:  " + employees[i].getPhone() + "  " +
                        "зарплата:  " + employees[i].getSalary() +  "  " +
                        "возраст:  " + employees[i].getAge());
            }
        }
        
    }

}
