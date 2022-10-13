import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utility {
    public static String gitDateAndTime(){
        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return date.format(now).replaceAll("/","-").replaceAll(":","-").replaceAll(" ","-");

    }
}
