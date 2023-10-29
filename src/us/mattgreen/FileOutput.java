package us.mattgreen;

import java.io.*;

public class FileOutput {

    private Writer out = null;
    private String fileName;

    public FileOutput(String fileName, boolean append) {
        this.fileName = fileName;
        try {
            out = new BufferedWriter(new FileWriter(fileName, append)); // Use FileWriter with append mode
        } catch (IOException e) {
            System.out.println("File Open Error: " + fileName + " " + e);
        }
    }

    public void fileWrite(String line) {
        try {
            out.write(line + "\n");
        } catch (Exception e) {
            System.out.println("File Write Error: " + fileName + " " + e);
        }
    }

    public void fileClose() {
        if (out != null) {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}