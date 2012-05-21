package no.gjengeda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SingletonBeanWithPrototypeBean {

	@Autowired
	PrototypeBean prototypeBean;
	
}
