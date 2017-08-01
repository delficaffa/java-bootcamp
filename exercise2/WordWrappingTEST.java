package exercise2;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Before;
import org.junit.Test;

public class WordWrappingTEST {

	@Test
	public void WordDoesNotWrap() {
		assertThat(Wrap.wrap("hello", 6), is("hello"));
	}

	@Test
	public void WordThatWrap() {
		assertThat(Wrap.wrap("hello word", 5), is("hello\nword"));
	}

	@Test
	public void WordThatWrapTwice() {
		assertThat(Wrap.wrap("verylongword", 4), is("very\nlong\nword"));
	}


	

	
}