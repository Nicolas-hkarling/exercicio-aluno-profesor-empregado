package henrique.nicolas.professoralunofuncionario;

public class Teacher extends Payroll {

    private double workedDays;
    private double workedHours;
    private double workedHoursValue;


    public Teacher() {
    }

    public Teacher(String name, String lastName, String email, String birthDate, String registrationNumber, double workedDays, double workedHours, double workedHoursValue) {
        super(name, lastName, email, birthDate, registrationNumber);
        this.workedDays = workedDays;
        this.workedHours = workedHours;
        this.workedHoursValue = workedHoursValue;
    }


    public double getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(double workedHours) {
        this.workedHours = workedHours;
    }

    public double getWorkedHoursValue() {
        return workedHoursValue;
    }

    public void setWorkedHoursValue(double workedHoursValue) {
        this.workedHoursValue = workedHoursValue;
    }

    public double getWorkedDays() {
        return workedDays;
    }

    public void setWorkedDays(double workedDays) {
        this.workedDays = workedDays;
    }

    public double tocauculatepayment(){
        return workedDays * workedHours * workedHoursValue;}


    @Override
    public double FGTS() {
        return tocauculatepayment() * 8/100;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nworkedHours: " + workedHours +
                "\nworkedHoursValue: " + workedHoursValue +
                "\npayment: " + tocauculatepayment()
                +"\ndiscount FGTS: " + FGTS();
    }
}
