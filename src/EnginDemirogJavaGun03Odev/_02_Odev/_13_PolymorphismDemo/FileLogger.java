package EnginDemirogJavaGun03Odev._02_Odev._13_PolymorphismDemo;

public class FileLogger extends BaseLogger{
    //Override
    public void log(String message){
        System.out.println("Logged to file: " + message);

    }



}
