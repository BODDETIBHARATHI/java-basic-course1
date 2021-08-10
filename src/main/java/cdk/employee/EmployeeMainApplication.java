package cdk.employee;

import cdk.employee.service.CRUDOperationsOnEmployee;

import java.util.Scanner;

public class EmployeeMainApplication {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    CRUDOperationsOnEmployee crudOperationsOnEmployee = new CRUDOperationsOnEmployee();
    while(true){
      System.out.println("Enter 1 for add employee\n" +
              "Enter 2 for update employee\n" +
              "Enter 3 read specific employee\n" +
              "Enter 4 for read list of employees\n" +
              "Enter 5 for delete employee\n" +
              "Enter 6 for exit\n");
      switch (scanner.nextInt()){
        case 1 : crudOperationsOnEmployee.addEmployee();
        break;
        case 2 : crudOperationsOnEmployee.updateEmployee();
        break;
        case 3 : crudOperationsOnEmployee.readEmployee();
        break;
        case 4 : crudOperationsOnEmployee.readEmployeesList();
        break;
        case 5 : crudOperationsOnEmployee.deleteEmployee();
        break;
        default:System.exit(0);
      }
    }
  }
}
