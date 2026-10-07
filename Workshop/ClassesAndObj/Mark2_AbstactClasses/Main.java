package ClassesAndObj.Mark2_AbstactClasses;

public class Main{

    static void main(String[] args){

        Employee Emp1 = new Employee("Jeff", 101);
        Emp1.Info();

        Employee Emp2 = new Employee("Carl", 102);
        Emp2.Info();

        System.out.println();

        HR Hr1 = new HR("Stacy", 201);
        Hr1.Info();

        HR Hr2 = new HR("Garry", 202);
        Hr2.Info();






    }




}


abstract class Orgs {
    String Name;
    int ID;

    abstract void Info();
}

class HR extends Orgs{
    public HR(String name, int id) {
        this.Name = name;
        this.ID = id;
    }

    @Override
    void Info(){
        System.out.println("HR " + ID + ": " + Name);
    }
}


class Employee extends Orgs{
    public Employee(String name, int id){
        this.Name = name;
        this.ID = id;
    }

    @Override
    void Info(){
        System.out.println("Employee " + ID + ": " + Name);
    }
}

