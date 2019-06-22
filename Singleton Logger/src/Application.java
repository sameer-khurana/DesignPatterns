import java.util.Arrays;

public class Application {

    private int[] myData;

    public int[] getMyData() {
        return myData;
    }

    public void setMyData(int[] myData) {
        this.myData = myData;
    }

    public  void sortData(){
        Arrays.sort(myData);
    }

    public static void main(String[] args) {
        String file = "C:\\Users\\sameer.khurana\\Downloads\\Accolite Training\\LogFile.txt";
        LoggerSingleton loggerSingleton = LoggerSingleton.getLogger(file);
        LoggerSingleton loggerSingleton1 = LoggerSingleton.getLogger(file);
        if(loggerSingleton == loggerSingleton1)
            System.out.println("Same instance");
        Application application = new Application();
        application.setMyData(new int[]{10, 4, 3, 78, 34, 98, 13});
        loggerSingleton.log("Data set ");
        application.sortData();
        loggerSingleton.log("Data sorted ");
        for(Integer i: application.getMyData()){
            System.out.print(i + "\t");
        }
        loggerSingleton.log("Data get");
    }

}
