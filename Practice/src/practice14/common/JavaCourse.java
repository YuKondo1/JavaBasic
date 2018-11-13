package practice14.common;

public class JavaCourse implements Course {

	private String courseName = PREFIX + " Java";
	private String[] courseUnit = {"式と演算", "制御構文", "メソッド", "配列", "オブジェクト指向", "継承", "高度な継承"};


	public String getCourseName() {
		return courseName;
	}

	public String[] getCourseUnit() {
		return courseUnit;
	}



}
