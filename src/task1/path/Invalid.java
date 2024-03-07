package task1.path;
/*
method for outputting an incorrect document number to a file
 */

import task1.log.Log;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Invalid {

    public static void invalid(String line) throws IOException {
        File other=new File("other.txt");
        if (other.createNewFile()){
            Log.exLogs("Создан файл other");
        }
        FileWriter writer=new FileWriter("other.txt");
        if (line.length()<IConstant.validNumberOfSymbols){
            writer.write(line+" номер документа имеет недостаточное количество символов");
        }else if (line.length()>IConstant.validNumberOfSymbols){
            writer.write(line+" номер документа имеет перебор по количеству символов");
        }else if (line.contains(" ")||line.contains(",")||line.contains("/#$")){
            writer.write(line+ " номер документа имеет неверные символы");
        }else if (line.indexOf(IConstant.ValidName2) == 0 || line.indexOf(IConstant.validName1) == 0){
            writer.write(line+ " неверный формат документа");
        }
        Log.exLogs("убран невалидный документ");
        writer.close();
    }
}
