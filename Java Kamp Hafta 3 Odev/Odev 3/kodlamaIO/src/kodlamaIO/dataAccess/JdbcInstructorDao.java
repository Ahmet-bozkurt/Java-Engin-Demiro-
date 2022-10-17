package kodlamaIO.dataAccess;

import kodlamaIO.entities.Instructor;

public class JdbcInstructorDao {
	public void add(Instructor instructor) {
		System.out.println("Egitmen JDBC Dao ile veritabanina eklendi.");
	}
}
