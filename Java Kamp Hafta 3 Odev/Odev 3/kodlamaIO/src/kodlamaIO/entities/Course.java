package kodlamaIO.entities;

public class Course extends BaseEntity {
	private String courseName;
	private double coursePrice;
	Category category = new Category();
	
	public Course() {
	}
	
	public Course(String courseName, double coursePrice, Category category) {
		this.courseName = courseName;
		this.coursePrice = coursePrice;
		this.category = category;
	}

	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	
}
