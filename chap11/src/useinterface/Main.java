package useinterface;

public class Main {

	public static void main(String[] args) {
		Runnable walkRun = new WalkRun();
		Runnable flyRun = new FlyRun();

		Goblin g = new Goblin('A', 50);
		g.setRunnable(walkRun);
		g.run();
		
		
	}

}
