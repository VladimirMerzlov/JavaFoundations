package io_strems.io;

import java.io.*;

public class IORunner {
    public static void main(String[] args) {
//        OutputStream os = System.out;
//        try {
//            os.write(104);
//            os.write(105);
//            os.flush();
//            os.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            FileWriter fileWriter = new FileWriter("text.txt");
//            BufferedWriter bf = new BufferedWriter(fileWriter);
//            bf.write("My new String!", 0, 14);
//            bf.flush();
//            bf.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            FileReader fileReader = new FileReader("text.txt");
            BufferedReader bf = new BufferedReader(fileReader);
            String line;
            while((line = bf.readLine()) != null) {
                System.out.println(line);
            }
            bf.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
