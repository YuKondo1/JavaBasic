package practice14.common;

public class DBCourse implements Course{
	private String courseName = PREFIX + " DB基礎";
	private String[] courseUnit = {"DB基礎", "SQL基礎", "正規化", "SQL応用"};


	public String getCourseName() {
		return courseName;
	}

	public String[] getCourseUnit() {
		return courseUnit;
	}


}
