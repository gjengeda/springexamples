package no.gjengeda;

import org.junit.Test;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.Singleton;

import no.gjengeda.model.ExternalAddress;

public class GuiceInjectorTest {

	public static class TestModule extends AbstractModule implements Module {

		@Override
		protected void configure() {
			bind(ExternalAddress.class).in(Singleton.class);
		}

	}

	private static Injector injector;

	static {
		injector = Guice.createInjector(new TestModule());
	}
	
	@Test
	public void injectedPropertyShouldBeRealObjectNotWrapped() {
		ExternalAddress externalAddress1 = injector.getInstance(ExternalAddress.class);
		ExternalAddress externalAddress2 = injector.getInstance(ExternalAddress.class);
		int a = 1;
	}
}
