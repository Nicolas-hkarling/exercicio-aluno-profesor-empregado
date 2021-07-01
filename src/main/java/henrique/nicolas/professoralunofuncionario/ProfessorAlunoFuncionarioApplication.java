package henrique.nicolas.professoralunofuncionario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProfessorAlunoFuncionarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfessorAlunoFuncionarioApplication.class, args);
		Student student = new Student("Harry",
				"Potter",
				"HPotter@Hogwarts.com",
				"31/07/1980",
				7.3,
				8.2 );
		Teacher teacher = new Teacher("Severo",
				"Snape",
				"SSsnape@Hogwarts.com",
				"09/01/1960",
				"13455647",
				29.0,
				8.0,
				15.50
		);

		Employeee employeee = new Employeee("Rubeus",
				"Hagrid",
				"RHangrid@Hogwarts.com",
				"06/12/1980",
				"87778588",
				2000.00);



		System.out.println(student);
		System.out.println(teacher);
		System.out.println(employeee);
	}

}
