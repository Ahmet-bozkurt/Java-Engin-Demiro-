package kodlamaIO.dataAccess;

import kodlamaIO.entities.Course;

public class JdbcCourseDao implements CourseDao {
	public void add(Course course) {
		System.out.println("Kurs JDBC Dao ile veritabanina eklendi.");
	}

}
