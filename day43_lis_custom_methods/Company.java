package day43_lis_custom_methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Company {
    public static void main(String[] args) {
    Employee employee1 = new Employee();
    Employee employee2 = new Employee();
    Employee employee3 = new Employee();

    employee1.name = "Mesut";
    employee1.jobTitle = "SDET";
    employee1.work();

    employee2.name = "Emrah";
    employee2.jobTitle = "PO";
    employee2.work();

    employee3.name = "Ahmet";
    employee3.jobTitle = "BA";
    employee3.work();

 }
}
