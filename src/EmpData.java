public class EmpData {
    private int Id;
    private String Name;
    private double Salary;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    public EmpData(){

    }

    public EmpData(int id, String name, double salary) {
        Id = id;
        Name = name;
        Salary = salary;
    }

    public double getSalary() {

        return Salary;
    }

    public void setSalary(double salary)
    {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "EmpData{" +
                "\nId=" + Id +
                "\nName='" + Name + '\'' +
                "\nSalary=" + Salary +
                '}';
    }

}
