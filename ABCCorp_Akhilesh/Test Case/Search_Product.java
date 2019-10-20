import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.dao.SaleDAO;

public class Search_Product {

    private SaleDAO daoref;
	@Before
	public void setup()
	{
		daoref = new SaleDAO();
	}
	@Test
	public void test() {
	
		Sale s=daoref.getInfo(1004);
		assertTrue(s.getProductname().equals("Telescope"));
		
	}
	@After
	public void finish()
	{
		daoref =null;
	}

}
