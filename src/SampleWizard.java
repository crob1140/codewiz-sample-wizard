import com.github.crob1140.codewiz.Wizard;

public class SampleWizard extends Wizard {
	
	@Override
	public void onIdle() {
		move(50);
	}
	
	@Override
	public void onEnemySighted() {
		
	}
}
