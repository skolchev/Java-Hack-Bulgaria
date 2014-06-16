import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateLogger extends Logger {
    public DateLogger() {
        super(Integer.MAX_VALUE);
    }
    
    public DateLogger(int level) {
        super(level);
    }
    
    public void log(String message) {
        this.log(3, message);
    }
    
    public void log(int level, String message) {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss yyyy/MM/dd ");
        Date date = new Date();
        System.out.print(dateFormat.format(date));
        super.log(level, message);
    }
}
