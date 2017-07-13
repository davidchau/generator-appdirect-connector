package <%= groupId %>;

import static org.assertj.core.api.Assertions.assertThat;

import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class ApplicationTest {

	private Application application;

	@BeforeMethod
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		application = new Application();
	}

	/**
	 * Rigourous Test :-)
	 */
	@Test
	public void testApp() {
		assertThat(application).isNotNull();
	}
}
