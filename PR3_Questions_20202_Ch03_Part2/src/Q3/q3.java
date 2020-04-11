/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author khatib
 */
public class q3 {

    Employee[] employees = {
        new Employee(1, "Ahmad", "IT", 1201),
        new Employee(2, "Sami", "Sales", 950.8),
        new Employee(5, "Huda", "IT", 1010.5),
        new Employee(7, "Ali", "Marketing", 1300),
        new Employee(4, "Hani", "Sales", 1050)
    };
    List<Employee> listEmployees = Arrays.asList(employees);
//عملنا هنا list stream 

    listEmployees.stream () //وفي عنا هنا "filter" 
    //فيها شرط انو تكون السلري بين ال 800 و 1200


.filter(e-> e.getSalary() >=800 && e.getSalary() <1200)
       // عملنا map
        //عملنا داخلو ابجكت من employee
        //وحطينا فيه بعض المعلومات بحيث انو السلري مش نفس النسبة 
 .map(e-> new Employee
(e.getId(), e.getName(), e.getDepartment(), getSalary()*1.02))
//هنا يعمل تجميع على حسب القسم 
        //ثم يقوم بوضع الاعداد لكل قسم 
        .collect(Collectors.
groupingBy(Employee::getDepartment,
Collectors.counting()))
        //عملنا فور ايتش علشان تمر على كل اللست وتطبع المحتويات 
 .forEach((d, c) -> System.out.println("Dept: "+ d + ", Count: " + c));

}
