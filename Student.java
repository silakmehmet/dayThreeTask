package dayThreeTask;

public class Student extends User{
	private String graduation;
	private String selectedCourse;
	
	public Student(String nationalIdentity, String firstName, String lastName, String email, String password,
			String graduation, String selectedCourse) {
		super(nationalIdentity, firstName, lastName, email, password);
		this.graduation = graduation;
		this.selectedCourse = selectedCourse;
	}

	public String getGraduation() {
		return graduation;
	}

	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}

	public String getSelectedCourse() {
		return selectedCourse;
	}

	public void setSelectedCourse(String selectedCourse) {
		this.selectedCourse = selectedCourse;
	}
	
	
	

}
