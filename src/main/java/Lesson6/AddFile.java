package Lesson6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AddFile {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        try {
            BufferedReader br = new BufferedReader(new FileReader( "DZ6"));
            BufferedReader r = new BufferedReader(new FileReader( "DZ6_2"));
            String s1;
            String s2;

            while ((s1 = br.readLine()) != null) {
                list.add(s1);
            }
            while((s2 = r.readLine()) != null) {
                list.add(s2);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("DZ6_3"));
        String listWord;
        for (String s : list) {
            listWord = s;
            writer.write(listWord);
            writer.write("\n");
        }
        System.out.println("completed");
        writer.close();
    }
}

