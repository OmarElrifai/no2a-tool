package com.vbs.no2a;

import com.vbs.no2a.Nitrite.Employee;
import org.dizitart.no2.FindOptions;
import org.dizitart.no2.Nitrite;
import org.dizitart.no2.SortOrder;
import org.dizitart.no2.objects.Cursor;
import org.dizitart.no2.objects.ObjectRepository;

import java.util.Date;
import java.util.List;

import static org.dizitart.no2.objects.filters.ObjectFilters.*;

public class Main {

     public static void main(String[] args) {

//         Optionss ts = new Optionss(args);
//         Invoker invoker = new Invoker(ts.cmd, ts.options);
//         invoker.setExecute(ts);




         Nitrite db = Nitrite.builder()
                 .compressed()
                 .filePath("src/main/resources/tmp/test.db")
                 .openOrCreate();

//
         ObjectRepository<Employee> repository = db.getRepository(Employee.class);


         Employee emp1 = new Employee();
         emp1.setEmpId(234582);
         emp1.setName("Omar");
         emp1.setJoinDate(new Date());
         emp1.setAge(20);
         emp1.setSalary(3000);

         Employee emp2 = new Employee();
         emp2.setEmpId(239282);
         emp2.setName("Wael");
         emp2.setJoinDate(new Date());
         emp2.setAge(30);
         emp2.setSalary(4000);

         Employee emp3 = new Employee();
         emp3.setEmpId(231282);
         emp3.setName("khara");
         emp3.setJoinDate(new Date());
         emp3.setAge(40);
         emp3.setSalary(5000);
//
         Employee emp4 = new Employee();
         emp4.setEmpId(224582);
         emp4.setName("shawkat");
         emp4.setJoinDate(new Date());
         emp4.setAge(50);
         emp4.setSalary(6000);

         Employee[] employees = new Employee[]{emp1,emp2,emp3,emp4};




//         repository.insert(employees);

//         Employee emp5a = new Employee();
//         emp5a.setAge(20);
//         emp5a.setSalary(3000);
//
//         Employee emp5b = new Employee();
//         emp5b.setAge(30);
//         emp5b.setSalary(4000);
//
//         Employee emp5c = new Employee();
//         emp5c.setAge(40);
//         emp5c.setSalary(5000);
//
//         Employee emp5d = new Employee();
//         emp5d.setAge(50);
//         emp5d.setSalary(6000);

//         repository.update(eq("name" , "Omar"),emp5a);
//         repository.update(eq("name" , "Wael"),emp5b);
//         repository.update(eq("name" , "khara"),emp5c);
//         repository.update(eq("name" , "shawkat"),emp5d);
//         repository.drop();

         Cursor<Employee> cursor = repository.find(and(gt("Age",20),lt("Age" , 50),gt("Salary",4000))  , FindOptions.sort("Age", SortOrder.Descending).thenLimit(0,3));
//         Cursor<Employee> cursor = repository.find();
         List<Employee> cursorList = cursor.toList();
         for (Employee e : cursor ){
             System.out.println(e.getEmpId() +" "+e.getName()+" "+ e.getAge()+" "+e.getSalary());
         }

         System.out.println("I am with    a lot   of spaces");




//         System.out.println(repository.isDropped());
     }


}
