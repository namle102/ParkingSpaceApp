package yorku.eecs3311.parking;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingComponentTest {

    private TestComponent component;

    @Before
    public void setUp() {
        component = new TestComponent();
    }

    @Test
    public void testInitialStateIsEnabled() {
        assertTrue(component.isEnabled());
    }

    @Test
    public void testDisableSetsEnabledToFalse() {
        component.disable();
        assertFalse(component.isEnabled());
    }

    @Test
    public void testEnableAfterDisable() {
        component.disable();
        component.enable();
        assertTrue(component.isEnabled());
    }

    @Test
    public void testShowStatusWhenEnabled() {
        component.enable();
        assertEquals("Component is enabled", component.getStatus());
    }

    @Test
    public void testShowStatusWhenDisabled() {
        component.disable();
        assertEquals("Component is disabled", component.getStatus());
    }

    @Test
    public void testEnableMultipleTimes() {
        component.enable();
        component.enable();
        assertTrue(component.isEnabled());
    }

    @Test
    public void testDisableMultipleTimes() {
        component.disable();
        component.disable();
        assertFalse(component.isEnabled());
    }

    @Test
    public void testToggleEnableDisable() {
        component.disable();
        assertFalse(component.isEnabled());
        component.enable();
        assertTrue(component.isEnabled());
        component.disable();
        assertFalse(component.isEnabled());
    }

    @Test
    public void testStatusAfterMultipleToggles() {
        component.disable();
        component.enable();
        component.disable();
        assertEquals("Component is disabled", component.getStatus());
    }

    @Test
    public void testConsistentStatusWithIsEnabled() {
        component.disable();
        assertEquals(component.isEnabled() ? "Component is enabled" : "Component is disabled", component.getStatus());
    }

    // ----------------------------
    // Inner test class
    // ----------------------------
    private static class TestComponent extends ParkingComponent {
        private boolean enabled = true;
        private String status = "Component is enabled";

        @Override
        void enable() {
            enabled = true;
            status = "Component is enabled";
        }

        @Override
        void disable() {
            enabled = false;
            status = "Component is disabled";
        }

        @Override
        boolean isEnabled() {
            return enabled;
        }

        @Override
        void showStatus() {
            System.out.println(status);
        }

        // Helper for testing what would be shown
        String getStatus() {
            return status;
        }
    }
}
