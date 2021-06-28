package assignmentone;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchFiles {
    public void findFiles(String path, String regExp) {
        File directory = new File(path);
        File[] fileNames = directory.listFiles(); // listing all the fileNames in given directory path
        if (fileNames!= null && fileNames.length > 0) {
            for (File file : fileNames)
                if (file.isDirectory()) { // If file is a Directory to check in the directory
                    findFiles(file.getAbsolutePath(), regExp);
                } else if (file.getName().contains(regExp)){
                    System.out.println(file.getAbsolutePath() + "     " + file.getName());
                }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Enter Regular Expression:");
            String regExp = br.readLine();
            if(regExp.equalsIgnoreCase("Done"))
                break;
            SearchFiles searchFiles = new SearchFiles();
            searchFiles.findFiles("/home", regExp);
        }
        System.out.println("File Search Done!!");
    }
}
