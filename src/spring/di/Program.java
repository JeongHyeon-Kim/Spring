package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context = //IoC Container
				new ClassPathXmlApplicationContext("spring/di/setting.xml"); // src�� root(���� ��ġ) ����
		
		//Exam exam = context.getBean(Exam.class); // setting�� �� Ȯ�ο�
		//System.out.println(exam.toString());
		
		ExamConsole console = (ExamConsole) context.getBean("console");//id�� ������(����ȯ �ʿ�)
		// ExamConsole console = context.getBean(ExamConsole.class);
		console.print(); //���� �ҽ� �ڵ忡 @Autowired ����(InlineExamConsole) 
		
		//4. �ݷ���(ex. ArrayList) �Ẹ��
		//List<Exam> exams = (List<Exam>) context.getBean("exams"); // id�� ��������(����ȯ �ʿ�)
		//exams.add(new NewlecExam(1,1,1,1)); // setting.xml���� �߰��߱� ������ ���� ����
		
		//for (Exam e : exams) { // for������ Ž��
		//	System.out.println(e); //���(object �ν�)
		//}
	}

}