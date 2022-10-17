package kodlamaIO.business;

import kodlamaIO.dataAccess.CourseDao;
import kodlamaIO.entities.Category;
import kodlamaIO.entities.Course;
import kodlamaIO.logging.Logger;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao,Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		Category category1 = new Category("Java");
		Category category2 = new Category(".Net");
		Course[] courses = new Course[] {new Course("Java 2022",150,category1), new Course(".Net 2022",200,category2)};
		// Business rule
		if (course.getCoursePrice() < 0) {
			throw new Exception("Kurs fiyatı 0'dan kucuk olamaz");
		}
		
		for(Course course1 : courses) {
			if (course1.getCourseName() == course.getCourseName()) {
				throw new Exception("Kurs ismi tekrar edemez.");
			}
			if (course1.getCategory().getName() == course.getCategory().getName()) {
				throw new Exception("Kategori ismi tekrar edemez.");
			}
		}
		System.out.println("CourseManager calisti.");

		courseDao.add(course);

		for(Logger logger:loggers) {
			logger.log(course.getCourseName());
		}

	}
}