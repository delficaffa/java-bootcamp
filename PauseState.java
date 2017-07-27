
public class PauseState implements PlayerState{

	Song song;
	
	public PauseState(Song song) {
		this.song = song;
		System.out.println("The song paused.");		

	}
	
	@Override
	public void play() {
		song.setPState(new PlayState(song));
		
	}

	@Override
	public void pause() {

	}

	@Override
	public void stop() {
		song.setPState(new StopState(song));
		
	}

}
