
public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "C# + ANGULAR", "EnginDemiroğ", 21 );
		Course course2 = new Course(2, "JAVA + REACT", "EnginDemiroğ", 16 );
		
		Course course3 = new Course();
		course3.id = 3;
		course3.name = "Temel Kurs";
		course3.instructor = "Engin Demiroğ";
		course3.days = 16;
		
		Course[] courses = { course1, course2, course3 };
		
		CourseManager courseManager = new CourseManager();
		courseManager.Add(course3);
		
		for(Course course:courses) {
			System.out.println(course.name + " giris yapıldı");
		}

	}

}
