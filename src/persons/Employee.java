package persons;

public class Employee extends Person {
    public int salary;
    public int workExperience;
    public static Employee createEmployee(String name, String surname, int age, String mailAdress, String phoneNumber,int salary,int workExperience){
        Employee employee = new Employee();
        employee.name = name;
        employee.surname = surname;
        employee.age = age;
        employee.mailAdress = mailAdress;
        employee.phoneNumber = phoneNumber;
        employee.salary=salary;
        employee.workExperience=workExperience;
        return employee;
    }
}
