package task1.log;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * there are two methods in the class that output logs to separate folders
 */
public class Log {

    public static void exLogs(String massage) throws IOException {
        SimpleDateFormat newDate = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss:SSS");
        String log =(newDate + " -> " + massage);
        File logs=new File("execution_log.txt");
        FileWriter writer=new FileWriter("execution_log.txt");
        if (logs.createNewFile()){
            System.out.println("Создан файл execution_log.txt");
            writer.write("Создан файл execution_log.txt");
        }
        System.out.println(log);
        writer.write(log);
        writer.close();
    }

    public static void erLogs(String massage) throws IOException {
        SimpleDateFormat newDate = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss:SSS");
        String log =(newDate + " -> " + massage);
        File logs=new File("error_log.txt");
        FileWriter writer=new FileWriter("error_log.txt");
        if (logs.createNewFile()){
            System.out.println("Создан файл error_log.txt");
            FileWriter writer2=new FileWriter("execution_log.txt");
            writer2.write("Создан файл error_log.txt");
            writer2.close();
        }
        System.out.println(log);
        writer.write(log);
        writer.close();
    }
}
