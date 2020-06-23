package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		/* 1. 하나를 넣는 방법 */
//		ApplicationContext context = //IoC Container
//				new AnnotationConfigApplicationContext(NewlecDIConfig.class);
		/* 2. 여러개를 넣는 방법 */
		AnnotationConfigApplicationContext context = //IoC Container
				new AnnotationConfigApplicationContext();
		context.register(NewlecDIConfig.class); // register 함수를 통해 여러개를 넣을 수 있음
		context.refresh();
//				new ClassPathXmlApplicationContext("spring/di/setting.xml"); // src가 root(실행 위치) 기준
		//Exam exam = context.getBean(Exam.class); // setting된 값 확인용
		//System.out.println(exam.toString());
		
		ExamConsole console = (ExamConsole) context.getBean("console");//id로 꺼내기(형변환 필요)
//		ExamConsole console = context.getBean(ExamConsole.class);
		console.print(); //실제 소스 코드에 @Autowired 쓰기(InlineExamConsole) 
		
		//4. 콜렉션(ex. ArrayList) 써보기
		//List<Exam> exams = (List<Exam>) context.getBean("exams"); // id로 가져오기(형변환 필요)
		//exams.add(new NewlecExam(1,1,1,1)); // setting.xml에서 추가했기 때문에 생략 가능
		
		//for (Exam e : exams) { // for문으로 탐색
		//	System.out.println(e); //출력(object 인식)
		//}
	}

}
