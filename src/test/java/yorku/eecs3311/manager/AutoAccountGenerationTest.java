package yorku.eecs3311.manager;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class AutoAccountGenerationTest {
	
	@Test
	public void generateMangerAccountTest() {
		AutoAccountGeneration auto = new AutoAccountGeneration();
		auto.generateManagerAccount();
		List<ManagerAccount> managers = auto.loadManagers();
		assertEquals(false, managers.isEmpty());
		
	}
}
