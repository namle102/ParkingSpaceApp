package yorku.eecs3311.manager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class SuperManagerTest {
	
	@Test
	public void SuperManagerInitTest() {
		SuperManager sm = SuperManager.getInstance();
		
		sm.generateManagerAccount();
		
		List<ManagerAccount> managers = sm.getManagers();
		assertEquals(false, managers.isEmpty());
	}
}
