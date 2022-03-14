import java.util.Scanner;

public class EmpOps {
    EmpData empData = new EmpData();
    EmpDays empDays = new EmpDays();
    Scanner sc = new Scanner(System.in);

    public void getEmployee(){
        System.out.println("Enter the Employee Id:");
        empData.setId(sc.nextInt());
        System.out.println("Enter the Employee Name:");
        empData.setName(sc.next());
        System.out.println("Enter if the Emp is Permanent(Y) or Temporary(N):");
        empDays.setEmpType(sc.next());
        System.out.println("Enter the  Days Emp Was Present=");
        empDays.setEmpPresentDays(sc.nextInt());
        empData.setSalary(empDays.getEmpSalary()*empDays.getEmpPresentDays());
    }

    public void showEmployee(){
        System.out.println(empData.toString());
        System.out.println(empDays.toString());

    }
    public static void main(String[] args) {
        EmpOps empOps[] = new EmpOps[3];
        EmpDays empDays[] = new EmpDays[3];
        for (int i = 0; i <= 2; i++){
            empOps[i]=new EmpOps();
            empOps[i].getEmployee();
        }
        for(int i = 0;i<=2;i++){
            empOps[i].showEmployee();
        }
    }
}
