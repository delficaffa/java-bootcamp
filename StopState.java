
public class StopState implements PlayerState{

	Song song;
	
	public StopState(Song song) {
		this.song = song;
		System.out.println("The song stops.");	
		
	}
	
	@Override
	public void play() {
		song.setPState(new PlayState(song));
		
	}

	@Override
	public void pause() {
		song.setPState(new PauseState(song));
		
	}

	@Override
	public void stop() {
	
	}


}
