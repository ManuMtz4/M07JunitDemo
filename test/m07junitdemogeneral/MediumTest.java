package m07junitdemogeneral;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class MediumTest {
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	private final String fileName = "file.txt";
	private BufferedWriter bw;
	private BufferedReader br;

	@Before
	public void createFile() throws IOException {
		File file = new File(fileName);
		if(file.exists()) {
			file.delete();
		}
		file.createNewFile();
		bw = new BufferedWriter(new FileWriter(file));
		br = new BufferedReader(new FileReader(file));
	}

	@After
	public void deleteFile() throws IOException {
		File file = new File(fileName);
		if(file.exists()) {
			file.delete();
		}
		if(bw != null) {
			bw.close();
		}
		if(br != null) {
			br.close();
		}
	}

	@Test
	public void writeTest() throws IOException {
		bw.write("Hola \n");
		bw.flush();
	}

	@Test
	public void readTest() throws IOException {
		bw.write("Hola\n");
		bw.flush();
		assertEquals("Hola", br.readLine());
	}

	@Test(expected = IOException.class)
	public void expectedException() throws IOException {
		bw.close();
		bw.write("Hola\n");
	}
}
