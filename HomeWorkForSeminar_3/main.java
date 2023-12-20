package HomeWorkForSeminar_3;

import java.util.*;

/**
 * Создать класс Employee (сотрудник) со следующими полями:
 * 1. String name - имя
 * 2. int age - возраст
 * 3. double salary - зарплата
 * <p>
 * Необходимо:
 * 0. Создать список из 10-20 рандомных сотрудников.
 * 1. Отсортировать его по убыванию возрастов (от большего к меньшему).
 * 2. Отсортировать его по возрастанию зарплаты.
 * 3. Вывести топ-5 сотрудников с наибольшей зарплатой, отсортированных по имени в алфавитном порядке.
 * 4.* Отсортировать сотрудников по возрастанию возрастов.
 * Если возрасты одинаковые - то по убыванию зарплаты.
 * Если и они равны - в алфавитном порядке.
 */

public class main {

    public static void main(String[] args) {

        EmployeeByAgeComparator_Descending ageSort_Descending = new EmployeeByAgeComparator_Descending(); // задание 1
        EmployeeByAgeComparator_Ascending ageSort_Ascending=new EmployeeByAgeComparator_Ascending();
        EmployeeBySalaryComparator_Ascending salarySort_Ascending = new EmployeeBySalaryComparator_Ascending(); // задание 2
        EmployeeBySalaryComparator_Descending salarySort_Descending = new EmployeeBySalaryComparator_Descending();
        EmployeeByNameComparator nameSort = new EmployeeByNameComparator();

        Comparator<Employee> sortAgeSalaryName =ageSort_Ascending.thenComparing(salarySort_Descending); // задание 4


       List<Employee> db = new  ArrayList <>();






        db.add(new Employee("Игорь", 30, 900.0));
        db.add(new Employee("Юрий", 35, 900.0));
        db.add(new Employee("Евгений", 35, 600));
        db.add(new Employee("Егор", 45, 700.0));
        db.add(new Employee("Карим", 50, 700.0));
        db.add(new Employee("Тимур", 30, 800.0));
        db.add(new Employee("Илья", 45, 500.0));
        db.add(new Employee("Константин", 30, 700.0));

        //       db.sort(ageSort_Descending);     // задание 1 сортировка  по убыванию возрастов
        //       db.sort(salarySort_Ascending);   // задание 2 сортировка по возрастанию зарплаты.

        /*
        Задание 3.
        отсортировал колекцию сотрудников по возрастанию зарплаты
        Создал коллекцию №2 и добавил в неё первые 5 сотрудников из первой коллекции
        результат вывел в консоль
         */

        List<Employee> db2 = new  ArrayList <>();       // задание 3
        db.sort(salarySort_Descending);              // задание 3
        db2.sort(nameSort);                         // задание 3


        int count = 1;
        Iterator<Employee> iterator = db.iterator();
        while (iterator.hasNext()){
            Employee el = iterator.next();
            if(count <=5) {
                db2.add(el);
            count++;
            }
//            System.out.println(el);
        }

        System.out.println(db2);


    }





}
