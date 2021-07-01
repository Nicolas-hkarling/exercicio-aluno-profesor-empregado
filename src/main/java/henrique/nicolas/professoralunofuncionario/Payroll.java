package henrique.nicolas.professoralunofuncionario;

public abstract class Payroll  extends Person{
    protected String registrationNumber;

    public abstract double tocauculatepayment();

    public abstract double FGTS();

    public Payroll() {
    }

    public Payroll(String name, String lastName, String email, String birthDate, String registrationNumber) {
        super(name, lastName, email, birthDate);
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
