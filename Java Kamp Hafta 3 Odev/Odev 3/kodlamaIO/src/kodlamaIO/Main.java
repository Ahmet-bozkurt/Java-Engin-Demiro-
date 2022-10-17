package kodlamaIO;


import kodlamaIO.business.CourseManager;
import kodlamaIO.dataAccess.HibernateCourseDao;
import kodlamaIO.dataAccess.JdbcCourseDao;
import kodlamaIO.entities.Category;
import kodlamaIO.entities.Course;
import kodlamaIO.logging.DatabaseLogger;
import kodlamaIO.logging.FileLogger;
import kodlamaIO.logging.Logger;
import kodlamaIO.logging.MailLogger;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

		Category category = new Category("C++");
		Course course = new Course("Java 2023",100,category);
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
		courseManager.add(course);
	}

}
