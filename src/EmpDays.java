public class EmpDays {
    private int EmpSalary;
    private int EmpPresentDays;
    private String EmpType;

    public int getEmpSalary() {
        return EmpSalary;
    }

    public void setEmpSalary(int empDays) {
        EmpSalary = empDays;
    }

    public int getEmpPresentDays() {
        return EmpPresentDays;
    }

    public void setEmpPresentDays(int empPresentDays) {
        EmpPresentDays = empPresentDays;
    }

    public String getEmpType() {
        return EmpType;
    }

    public void setEmpType(String empType) {
        EmpType = empType;
        if(EmpType.contains("Per"))
        {
            this.EmpSalary = 100;
        }
        else{
            this.EmpSalary =50;
        }
    }

    @Override
    public String toString() {
        return "EmpSalary{" +
                "EmpSalary=" + EmpSalary +
                ", EmpPresentDays=" + EmpPresentDays +
                '}';
    }


}
