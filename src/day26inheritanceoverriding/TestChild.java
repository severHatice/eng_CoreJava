package day26inheritanceoverriding;

public class TestChild  extends TestParent{
	
	@Override
	public void getDetails() {
		System.out.println("Test child...");
	}

}
