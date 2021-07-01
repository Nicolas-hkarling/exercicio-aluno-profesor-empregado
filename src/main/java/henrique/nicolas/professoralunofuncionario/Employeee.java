package henrique.nicolas.professoralunofuncionario;

public class Employeee extends Payroll{
    private double fixedPayment;



    public Employeee(String name, String lastName, String email, String birthDate, String registrationNumber, double fixedPayment) {
        super(name, lastName, email, birthDate, registrationNumber);
        this.fixedPayment = fixedPayment;
    }

    @Override
    public double tocauculatepayment() {
        return fixedPayment;
    }

    @Override
    public double FGTS() {
        return fixedPayment * 8/100;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nfixedPayment:" + fixedPayment +
                 " \ndiscount FGTS: " + FGTS();
    }
}
