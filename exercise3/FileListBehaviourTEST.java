package exercise3;

import static org.junit.Assert.*;
import org.junit.Test;

public class FileListBehaviourTEST {

	FilesManagerBehaviour fileManager;
	
	@Test
	public void testFirstRun() {
		fileManager= new FilesManagerBehaviour(15);
		assertEquals(0,fileManager.getRecentFilesList().size());
	}
	@Test
	public void testOpenAFileRun(){
		String directory = System.getProperty("user.dir");  
		System.out.println(directory);
		try {
			fileManager.OpenAFile(directory+"/start.txt");
			assertEquals(1,fileManager.getRecentFilesList().size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Test
	public void testOpenAnExistingFileRun() {
		String directory = System.getProperty("user.dir");  
		System.out.println(directory);
		try {
			fileManager.OpenAFile(directory+"/start.txt");
			assertEquals(1,fileManager.getRecentFilesList().size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testOpenAnotherFileFileRun() {
		String directory = System.getProperty("user.dir");  
		System.out.println(directory);
		try {
			fileManager.OpenAFile(directory+"/start2.txt");
			assertEquals(2,fileManager.getRecentFilesList().size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
