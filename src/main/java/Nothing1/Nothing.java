package Nothing1;

import java.util.LinkedList;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Java 8 questions
 * Id,age,Gender
 * HR :2
 * D&l :1
 * next : 5
 */
public class Nothing {
    public static void main(String[] args) {
        LinkedList<Employee> emp = new LinkedList<Employee>();
        emp.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        emp.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        emp.add(new Employee(122, "Paul Niksui", 25, "Female", "Sales And Marketing", 2015, 13500.0));
        emp.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        emp.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
// output Male:4,Female:5;
//       Map<String, Long> fun =  emp.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//        System.out.println(fun);
        //  emp.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
//      Map<String,Double> fun =  emp.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
//        System.out.println(fun);
//        Optional<Employee> name = emp.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
//       Employee empl =  name.get();
//        System.out.println(empl.getName());
        //       emp.stream().filter(a -> a.getYearOfJoining() < 2015).map(Employee::getName).forEach(System.out::println);
//Map<String,Long> fun =  emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//        System.out.println(fun);
//        Map<String,Double> fun = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
//        System.out.println(fun);
//Optional<Employee> fun = emp.stream().filter(a -> a.getGender() == "Male" && a.getDepartment() == "Product Development").min(Comparator.comparingInt(Employee::getAge));
//Employee name = fun.get();
//        System.out.println(name.getName());
//        Optional<Employee> fun = emp.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
//        Employee name = fun.get();
//        System.out.println(name.getName());
//        Map<String,Long> fun = emp.stream().filter(a -> a.getDepartment() == "Sales And Marketing").collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//        System.out.println(fun);
//        List<Integer> fun = emp.stream().map(Employee::getId).collect(Collectors.toList());
//        System.out.println(fun);
        // normal lambda
        // name = jhon,>30,uniq ... jhone * 5 = totalSalary
//        emp.stream().filter(a ->a.getName().equals("Jhon") && a.age > 30).distinct()
//                .mapToDouble(Employee::getSalary).sum();
        // Male = {ram,raj}, female = {rani,ss}
        //Map<String,List<String>> names = emp.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.mapping(a -> a.getName())))
    }
}
class Employee{
    int id,age;
    String gender;
    String name;
    String department;
    int yearOfJoining;
    double salary;

    public Employee(int id, String name,int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
// hello to HELLO
interface FI{
      String fun(String name);
}
