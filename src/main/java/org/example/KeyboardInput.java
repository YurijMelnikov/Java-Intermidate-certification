package org.example;
import java.io.*;

public class KeyboardInput {
    public KeyboardInput() {
    }

    public String dataInput(String inputPrompt) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.print(inputPrompt+":"+" ");
        return bufferedReader.readLine();
    }
}
