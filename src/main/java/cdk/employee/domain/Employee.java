package cdk.employee.domain;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Employee {
    Integer employeeId;
    String employeeName;
    Float employeeSalary;
//    Map<Integer ,Employee> employees;
}
