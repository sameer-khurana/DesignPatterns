import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class LoggerSingleton {

    private static LoggerSingleton logger;

    private String fileName;
    private BufferedWriter bufferedWriter;

    private LoggerSingleton(String fileName){
        this.fileName = fileName;
    }

    public static LoggerSingleton getLogger(String fileName){
        if(logger == null){
            logger = new LoggerSingleton(fileName);
        }
        return logger;
    }


    public void log(String fileData){
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(fileName, true));
            bufferedWriter.append(fileData + "\n");
        }

        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try{
            bufferedWriter.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}

