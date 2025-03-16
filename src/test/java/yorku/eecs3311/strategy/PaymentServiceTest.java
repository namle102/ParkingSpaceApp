package yorku.eecs3311.strategy;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import yorku.eecs3311.payment.CreditCard;
import yorku.eecs3311.payment.DebitCard;
import yorku.eecs3311.payment.PaymentService;

public class PaymentServiceTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;
	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	
	
	@Test
	public void init_strategy_test() {
		double payAmount = 1.5;
		PaymentService service = new PaymentService(new CreditCard());
		service.pay(payAmount);
		
		assertEquals(String.format("Paid %.2f with Credit Card Successfully!", payAmount), outContent.toString());
		
	}
	
	@Test
	public void set_strategy_test() {
		double payAmount = 1.5;
		PaymentService service = new PaymentService(new CreditCard());
		
		service.setStrategy(new DebitCard());
		service.pay(payAmount);

		assertEquals(String.format("Paid %.2f with Debit Card Successfully!", payAmount), outContent.toString());
		
	}
	
	@Test
	public void refund_test() {
		double payAmount = 1.5;
		PaymentService service = new PaymentService(new CreditCard());
		service.refund(payAmount);

		assertEquals(String.format("Refunded %.2f to Credit Card Successfully!", payAmount), outContent.toString());
	}
	
	@After
	public void restoreStreams() {
	    System.setOut(originalOut);
	    System.setErr(originalErr);
	}

}
