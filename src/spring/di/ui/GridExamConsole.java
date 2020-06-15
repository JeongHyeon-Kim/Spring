package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {
	private Exam exam;
	public GridExamConsole() { // ctrl + space bar肺 扁夯 积己磊 积己
		// TODO Auto-generated constructor stub
	}
	
	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}
	@Override
	public void print() {
		System.out.println("ΓΑΑΑΑΑΑΑΑΑΑΘΑΑΑΑΑΑΑΑΑΑΔ");
		System.out.println("Β   total  Β    avg   Β");
		System.out.println("ΗΑΑΑΑΑΑΑΑΑΑΛΑΑΑΑΑΑΑΑΑΑΙ");
		 System.out.printf("Β   %3d    Β   %3.2f   Β\n", exam.total(), exam.avg());
		System.out.println("ΖΑΑΑΑΑΑΑΑΑΑΚΑΑΑΑΑΑΑΑΑΑΕ");

	}
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}

}
