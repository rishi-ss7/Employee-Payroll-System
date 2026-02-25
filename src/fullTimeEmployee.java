public class fullTimeEmployee extends Employee {
    private double monthSalary;
    public fullTimeEmployee(String name, int id, double monthSalary){
        super(name, id);
        this.monthSalary =monthSalary;

    }
    @Override
    public  double calculateSalary(){
        return monthSalary;
    }

}
