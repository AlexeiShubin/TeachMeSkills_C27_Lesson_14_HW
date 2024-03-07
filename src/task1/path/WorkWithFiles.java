package task1.path;

import task1.log.Log;

import java.io.*;
import java.util.Scanner;

/**
 * methods for sorting document names and
 * outputting them to different files with subsequent
 * output of a message to the console
 */
public class WorkWithFiles {

    public static void strings() throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите путь к файлу: ");
        String path =scanner.nextLine() ;
        scanner.close();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String str;
            while ((str = reader.readLine()) != null) {
                if (DocumentNumberCheck.documentName(str)&&DocumentNumberCheck.documentName(str)){
                    recordingDocumentNamesInFiles(str);
                }else {
                    Invalid.invalid(str);
                }
            }
        } catch (IOException e) {
            Log.erLogs("Файл не был найден");
        }
    }

    public static void recordingDocumentNamesInFiles(String line) throws IOException {
        if (line.indexOf("docnum")==0){
            File docnums=new File("Docnums.txt");
            try {
                if (docnums.createNewFile()){
                    Log.exLogs("Создан файл docnums");
                }
            } catch (IOException e) {
                Log.erLogs("ошибка в создании файла");
            }
            FileWriter writer=new FileWriter("Docnums.txt");
            writer.write(line+"\n");
            Log.exLogs("Добавлен документ");
            writer.close();
        } else if (line.indexOf("contract")==0) {
            File contracts=new File("Contracts.txt");
            try {
                if (contracts.createNewFile()){
                    Log.exLogs("Создан файл Contracts");
                }
            } catch (IOException e) {
                Log.erLogs("ошибка в создании файла");
            }
            FileWriter writer=new FileWriter("Contracts.txt");
            writer.write(line+"\n");
            Log.exLogs("Добавлен контракт");
            writer.close();
        }
    }
}
