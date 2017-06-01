package compositionAssignment;

//Person.java
public class Person {
	// composition has-a relationship
	private Job job;
	private Education education;

	public Person() {
		
		this.job = new Job();
		this.education = new Education();
		job.setSalary(1000L);
		job.setRole("Teacher");
		job.setId(101);
	}

	public long getSalary() {
		return job.getSalary();
	}

	@Override
	public String toString() {
		return "job \n" + job.toString() + ", \neducation\n" + education.toString() + "";
	}
	
}