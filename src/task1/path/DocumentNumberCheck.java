package task1.path;

/**
 * document input verification method
 */
public class DocumentNumberCheck {


    public static boolean documentName(String line){
        return line.indexOf(IConstant.ValidName2) == 0 || line.indexOf(IConstant.validName1) == 0;
    }
}
