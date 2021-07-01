package henrique.nicolas.professoralunofuncionario;

public class Student extends Person {
    private double grade1;
    private double grade2;
    private double media;

    public Student() {
    }


    public Student(String name, String lastName, String email, String birthDate, double grade1, double grade2) {
        super(name, lastName, email, birthDate);
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public double getGrade1() {
        return grade1;
    }

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    public double tocauculatemedia(){
        return  (grade1 + grade2)/2;
    }

    @Override
    public String toString() {
        return super.toString() +
                " \nnota1= " + grade1 + "\nnota2 = " + grade2 +
                "\n sua media é: " +tocauculatemedia();
    }
}
