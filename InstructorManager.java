package dayThreeTask;

public class InstructorManager extends UserManager{
	public void addUser(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+ instructor.getLastName()+ " isimli kullanýcý oluþturuldu.");
				}
	public void getInformation(Instructor instructor) {
		System.out.println("Kursu verenin adý: "+ instructor.getFirstName()+" "+ instructor.getLastName());
		System.out.println("Tecrübesi(yýl): "+ instructor.getExperience());
		System.out.println("Ýletiþim: "+instructor.getEmail());
	}
}
