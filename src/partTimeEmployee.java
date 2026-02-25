public class partTimeEmployee extends Employee{

    private int hourlyWorked;
    private double hourlyRate;
    public partTimeEmployee(String name , int id, int hourlyWorked, double hourlyRate){
        super(name, id);
        this.hourlyRate= hourlyRate;
        this.hourlyWorked= hourlyWorked;

    }
    @Override
    public double calculateSalary(){
        return hourlyWorked * hourlyRate;

    }
}
