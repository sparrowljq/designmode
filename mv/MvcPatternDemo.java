package com.lzu.edu.cn.desiginmode.mv;

public class MvcPatternDemo {
	public static void main(String[] args) {
		Student model=retrieveStudenFromDatabase();
		StudentView view=new StudentView();
		StudentController controller=new StudentController(model, view);
		controller.updateview();
		controller.setStudentName("John");
		controller.updateview();
	}
	private static Student retrieveStudenFromDatabase() {
		Student student=new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}
}
