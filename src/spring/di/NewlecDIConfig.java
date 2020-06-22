package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;

@ComponentScan("spring.di.ui")
@Configuration
public class NewlecDIConfig {
	@Bean
	public Exam exam() { /* id라 생각하고 짓기 */
		return new NewlecExam();
	}
	
}

