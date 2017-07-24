
public class PlayState implements PlayerState{

	Song song;
	
	public PlayState(Song song) {
		this.song = song;	
		System.out.println("The song is playing.");
	}
	
	@Override
	public void play() {	

	}

	@Override
	public void pause() {
		song.setPState(new PauseState(song));
		
	}

	@Override
	public void stop() {	
		song.setPState(new StopState(song));
		
	}
	

	
	

}
