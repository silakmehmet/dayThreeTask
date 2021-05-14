package dayThreeTask;

public class Instructor extends User{
	private int experience;
	private String courseName;
	
	public Instructor(String nationalIdentity, String firstName, String lastName, String email, String password,
			int experience, String courseName) {
		super(nationalIdentity, firstName, lastName, email, password);
		this.experience = experience;
		this.courseName = courseName;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
