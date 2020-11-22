package Task6.service;

import java.io.*;
import java.util.Scanner;

class ReadService {

    static String[] reading() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        FileReader input = new FileReader(path);
        LineNumberReader count = new LineNumberReader(input);
        int lines = (int) count.lines().count();
        count.close();

        String[] s = new String[lines];

        try {
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            int i = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                s[i] = data;
                i++;
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Please write valid path name");
            e.printStackTrace();
        }
        return s;


    }

}
