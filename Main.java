package dayThreeTask;

public class Main {

	public static void main(String[] args) {
		Instructor instructor= new Instructor("12345678911", "Engin", "Demiroð", "engindemirog@gmail.com", "666666", 15, "Java-React");
		Student student= new Student("15156151", "Mehmet", "Þýlak", "silakmehmet@gmail.com", "66666152", "Üniversite", "Java-React Kampý");
		
		
		UserManager userManager= new UserManager();
		userManager.addUser(student);
		userManager.addUser(instructor);
		
		InstructorManager instructorManager= new InstructorManager();
		instructorManager.getInformation(instructor);
		

	}

}
