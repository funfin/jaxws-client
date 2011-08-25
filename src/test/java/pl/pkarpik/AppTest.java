package pl.pkarpik;

import java.net.MalformedURLException;

import org.junit.Before;

import pl.pkarpik.webservice.client.HelloService;
import pl.pkarpik.webservice.client.HelloServiceImplService;

/**
 * Unit test for simple App.
 */
public class AppTest {

	private HelloService service;

	@Before
	public void setUp() throws MalformedURLException {
		service = new HelloServiceImplService().getHelloServiceImplPort();

	}

	@org.junit.Test
	// @Ignore
	public void sayHelloTest() {
		System.out.println("result: "+service.sayHello("Piotr"));

	}

}
