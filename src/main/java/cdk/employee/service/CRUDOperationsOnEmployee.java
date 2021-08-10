package cdk.employee.service;

import cdk.employee.domain.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CRUDOperationsOnEmployee {

  Scanner scanner = new Scanner(System.in);
  private static Map<Integer, Employee> employeeMap = new HashMap<>();

  public void addEmployee() {
    Employee employee = new Employee();
    System.out.println("Enter employee id : ");
    employee.setEmployeeId(scanner.nextInt());
    System.out.println("Enter employee name : ");
    employee.setEmployeeName(scanner.next());
    System.out.println("Enter employee salary : ");
    employee.setEmployeeSalary(scanner.nextFloat());
    employeeMap.put(employee.getEmployeeId(), employee);
  }

  public void updateEmployee() {
    if (employeeMap.isEmpty()) {
      System.out.println("There are no employees exist");
    } else {
      System.out.println("Enter id of the employee to be updated");
      int id = scanner.nextInt();
      if (employeeMap.get(id) == null) {
        System.out.println("Please enter valid employee ID");
        updateEmployee();
      } else {
        System.out.println("Enter updated name for the employee");
        Employee employee = new Employee();
        employee.setEmployeeId(employeeMap.get(id).getEmployeeId());
        employee.setEmployeeName(scanner.next());
        System.out.println("Enter updated salary : ");
        employee.setEmployeeSalary(scanner.nextFloat());
        employeeMap.put(id, employee);
      }
    }
  }

  public void readEmployee() {
    if (employeeMap.isEmpty()) {
      System.out.println("There are no employees exist");
    } else {
      System.out.println("Enter id of the employee to read \n");
      int id = scanner.nextInt();
      if (employeeMap.get(id) == null) {
        System.out.println("Please enter valid employee ID");
        readEmployee();
      } else {
        System.out.println("id   |   name   |   salary");
        System.out.println(
            employeeMap.get(id).getEmployeeId()
                + "   |   "
                + employeeMap.get(id).getEmployeeName()
                + "   |   "
                + employeeMap.get(id).getEmployeeSalary());
      }
    }
  }

  public void readEmployeesList() {
    if (employeeMap.isEmpty()) {
      System.out.println("There are no employees exist");
    } else {
      System.out.println("id   |   name   |   salary");
      for (Map.Entry<Integer, Employee> employeeEntry : employeeMap.entrySet()) {
        System.out.println(
            employeeEntry.getValue().getEmployeeId()
                + "   |   "
                + employeeEntry.getValue().getEmployeeName()
                + "   |   "
                + employeeEntry.getValue().getEmployeeSalary());
      }
    }
  }

  public void deleteEmployee() {
    if (employeeMap.isEmpty()) {
      System.out.println("There are no employees exist");
    } else {
      System.out.println("Enter id of the employee to delete : ");
      int id = scanner.nextInt();
      if (employeeMap.get(id) == null) {
        System.out.println("Please enter valid employee ID");
        deleteEmployee();
      } else employeeMap.remove(id);
    }
    }
}
