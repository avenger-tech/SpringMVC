import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.capgemini.takehome.ui.Product;
import com.capgemini.takehome.util.CollectionUtil;

public class TestCase {
	@Before
	public void setup() {
		
	}

	@Test
	public void test() {
		Product obj= (Product) CollectionUtil.products.get(1001);  // this is for checking that at particular key the namne of the item is equal//
		assertTrue(obj.getProduct_name().equals("LEDTV"));
		Product obj1= (Product) CollectionUtil.products.get(1002);  // this is for checking that at particular key the namne of the item is not equal
		assertTrue(obj1.getProduct_name().equals("LEDTV"));                                                          //and in this case the test case will be fail
		
		
		
	}
	@After
	public void tearDown() {
		
	}

}
