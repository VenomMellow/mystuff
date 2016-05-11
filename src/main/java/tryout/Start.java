package tryout;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Start {
	public static void main(String[] args) {

		ApplicationContext context =
				new AnnotationConfigApplicationContext(config.AspectConfig.class);

		Ramka ram = context.getBean(Ramka.class);
	
	}
}