
package finalWordOccurences;

import static org.junit.Assert.*;
import java.io.InputStream;

import org.junit.Test;

public class wordCountTest {

	@Test
	public void test() {

		wordCount WordCountTest = new wordCount();
		InputStream inputstream = this.getClass().getResourceAsStream("PoePoem.txt");
		assertNotNull(inputstream);
		
		InputStream inputstream1 = this.getClass().getResourceAsStream("PPOEM.txt");
		assertNotNull(inputstream1);
	}
}