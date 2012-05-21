package no.gjengeda;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/ApplicationContext.xml")
public class SingletonBeanWithPrototypeBeanTest {

	@Autowired
	private SingletonBeanWithPrototypeBean bean;

	@Test
	public void logHashCodeOfBeans() {
		System.out.println(hashCode());
		System.out.println(bean.hashCode());
		System.out.println(bean.prototypeBean.hashCode());
	}

	@Test
	public void logHashCodeOfBeansAgain() {
		System.out.println(hashCode());
		System.out.println(bean.hashCode());
		System.out.println(bean.prototypeBean.hashCode());
	}
}
