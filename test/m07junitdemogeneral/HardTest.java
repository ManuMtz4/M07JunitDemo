package m07junitdemogeneral;

import org.junit.ClassRule;
import org.junit.Test;
import org.junit.rules.ExternalResource;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class HardTest {
	private static BufferedWriter bw;
	private static BufferedReader br;

	@ClassRule
	public static final ExternalResource resource = new ExternalResource() {
		private final String fileName = "file.txt";

		@Override
		protected void before() throws Throwable {
			System.out.println("Creando archivo");
			File file = new File(fileName);
			if(file.exists()) {
				file.delete();
			}
			file.createNewFile();
			bw = new BufferedWriter(new FileWriter(file));
			br = new BufferedReader(new FileReader(file));
		}

		@Override
		protected void after() {
			System.out.println("Borrando archivo");
			try {
				File file = new File(fileName);
				if (file.exists()) {
					file.delete();
				}
				if (bw != null) {
					bw.close();
				}
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	};

	@Test
	public void test1() throws IOException {
		bw.write("texto1\n\ntexto2");
		bw.flush();
		assertThat(br.lines().count(), is(3L));
	}

	@Test
	public void test2() throws IOException {
		bw.write("hola");
		bw.newLine();
		bw.flush();
		bw.append("\nadios");
		bw.flush();
		Optional<String> first = br.lines().findFirst();
		assertTrue(first.isPresent());
		assertThat(first.get(), equalTo("hola"));
	}
}
