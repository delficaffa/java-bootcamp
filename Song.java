
public class Song implements PlayerState {
	
	PlayerState pState = new PlayState(this);
	
	public void setPState(PlayerState pState) {
		this.pState = pState;
	}

	@Override
	public void play() {
		pState.play();
		
	}

	@Override
	public void pause() {
		pState.pause();
		
	}

	@Override
	public void stop() {
		pState.stop();
		
	}
	
	

}
