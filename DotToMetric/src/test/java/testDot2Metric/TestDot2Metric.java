package testDot2Metric;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import dot2metric.Analisi;
import junit.framework.TestCase;
import utility.ObjMetodo;


public class TestDot2Metric extends TestCase {
	@Test
	public void testMain() {
		System.out.println("Test method --> main() ");
	}
	@Test
	public void testLoadText() {
		System.out.println("Test method --> loadTest()");

	}
	@Test
	public void testLoadConfig() {
		System.out.println("Test method --> loadConfig()");
	}
	@Test
	public void testSetConfig() {
		System.out.println("Test method --> setConfig()");
		
	}
	@Test(expected = Exception.class)
	public  void testAnalisi_start() throws FileNotFoundException {
		System.out.println("Test method --> Analisi.start()");
		HashMap<String, ArrayList<ObjMetodo>> ar= new HashMap<String, ArrayList<ObjMetodo>>();
		Analisi a = new Analisi("", ar);
		assertNotNull(a);
		
	}
	

}
