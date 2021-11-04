package wordCounter1;

import static org.junit.Assert.*;
import java.io.InputStream;

import org.junit.Test;

public class WordCounterTest {

	@Test
	public void test() {

		WordCount WordCountTest = new WordCount();
		InputStream inputstream = this.getClass().getResourceAsStream("PoePoem.txt");
		assertNotNull(inputstream);
		
		InputStream inputstream1 = this.getClass().getResourceAsStream("PPOEM.txt");
		assertNotNull(inputstream1);
	}
}
