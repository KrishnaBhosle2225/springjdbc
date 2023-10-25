package com.spring.jdbc;

import java.net.SocketTimeoutException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.cj.jdbc.BlobFromLocator;
import com.spring.jdbc.dao.EmployeeDao;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Employee;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        
    	Scanner scanner = new Scanner(System.in); 
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        
        //for student data inserting
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//        
//        Student student = new Student();
//        student.setId(1553);
//        student.setName("Vedant Chavan");
//        student.setCity("Dombivali");
//        
//        int res = studentDao.insert(student);
//        System.out.println(res + " Record Inserted");
        
        
//        //for employee data inserting
//        EmployeeDao employeeDao = context.getBean("employeeDao", EmployeeDao.class);
//        
//        Employee employee = new Employee();
//        employee.setId(102);
//        employee.setName("Vaibhav Galnde");
//        employee.setDept("Sales");
//        employee.setSalary(80000);
//        
//        int row = employeeDao.insert(employee);
//        System.out.println(row + " Data inserted...");
        
        
////        for Employee data updating
//        EmployeeDao employeeDao = context.getBean("employeeDao", EmployeeDao.class);
//        Employee employee = new Employee();
//        employee.setId(101);
//        employee.setName("Krishna Bhosle");
//        employee.setDept("Computer");
//        employee.setSalary(902910);
//        
//        int rows = employeeDao.change(employee);
//        System.out.println("Data Changed "+ rows );
        
        
////        for student data updating
//        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//        
//        Student student = new Student();
//        student.setId(111);
//        student.setName("Ramesh Jadhav");
//        student.setCity("Delhi");
//        
//        int rows = studentDao.change(student);
//        System.out.println(rows + " data changed...");
        
        
////        deleting data from student table
//        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//        
//        Student student = new Student();
//        student.setId(111);
//        
//        int rows = studentDao.delete(student);
//        System.out.println(rows +" row deleted...");
        
        
////        deleting data BlobFromLocator employee table
//        EmployeeDao employeeDao = context.getBean("employeeDao", EmployeeDao.class);
//
//        int rows = employeeDao.delete(102);
//        System.out.println(rows +" row data deleted...");
        
        
//        Taking data from user and inserting into the Employee Table
        EmployeeDao employeeDao = context.getBean("employeeDao", EmployeeDao.class);
//        Employee employee = new Employee();
//        System.out.println("Enter Employee id");
//        int id = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Enter Employee Name");
//        String name = scanner.nextLine();
//        System.out.println("Enter Employee dept");
//        String Dept = scanner.nextLine();
//
//        System.out.println("Enter Employee salary");
//        int sal = scanner.nextInt();
//        
//        employee.setId(id);
//        employee.setName(name);
//        employee.setDept(Dept);
//        employee.setSalary(sal);
//        
//        int rows = employeeDao.insert(employee);
//        System.out.println(rows + " data inserted...");
        
        Student student = studentDao.select(222);
        System.out.println(student);
        
        Employee employee = employeeDao.select(101);
        System.out.println(employee);
        
    }
}
