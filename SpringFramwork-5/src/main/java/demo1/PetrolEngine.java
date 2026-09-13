package demo1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class PetrolEngine implements Engine {
	
	public void run() {
		System.out.println("running by petrol");
	}

}
