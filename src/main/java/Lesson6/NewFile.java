package Lesson6;

import java.io.*;

public class NewFile {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            FileOutputStream DZ = new FileOutputStream("DZ6");

            PrintStream ps = new PrintStream(DZ);
            ps.println("Я помню чудное мгновенье:\n" +
                       "Передо мной явилась ты,\n" +
                       "Как мимолетное виденье,\n" +
                       "Как гений чистой красоты.\n");

            ps.close();
            DZ.flush();
            DZ.close();

            FileOutputStream DZ_2 = new FileOutputStream("DZ6_2");

            PrintStream ps_2 = new PrintStream(DZ_2);
            ps_2.println("В томленьях грусти безнадежной,\n" +
                    "В тревогах шумной суеты,\n" +
                    "Звучал мне долго голос нежный\n" +
                    "И снились милые черты.\n");

            ps_2.close();
            DZ_2.flush();
            DZ_2.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }


        System.out.println("End program");


    }
}
