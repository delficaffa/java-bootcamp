package exercise3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FilesManagerBehaviour {
	private int max;
	private List<File> recentFilesList;

	public FilesManagerBehaviour(int max) {
		this.max = max;
		recentFilesList = new ArrayList<File>();
	}

	public void OpenAFile(String s) throws IOException{
		try{
			File newFile = new File(s);
			if (!newFile.exists()){
			    BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));
			    if (recentFilesList.contains(newFile)) {
			    	recentFilesList.set(0, newFile);
				}else if (recentFilesList.size() < max){
					recentFilesList.add(newFile);
					}else{
					recentFilesList.remove(max-1);
					recentFilesList.add(newFile);
				}
			    bw.close();
			    System.out.println("File successfully created");
			}else{
				System.out.println( "File already exists");
			}
		}catch (FileNotFoundException e1){
			System.out.println("\r\n" + "Create File Error");
		}
	}

	public List<File> getRecentFilesList(){
		return this.recentFilesList;		
	}
	
}