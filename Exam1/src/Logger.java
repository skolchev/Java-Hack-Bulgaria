
public class Logger {
    protected int level;
    
    public Logger() {
        this(3);
    }
    
    public Logger(int level) {
        this.setLevel(level);
    }
    
    public void setLevel(int level) {
        if (level <= 0) {
            throw new IllegalArgumentException("Level cannot be less or equal to zero");
        }
        else {
            this.level = level;
        }
    }
    
    public void log(String message) {
        this.log(3, message);
    }
    
    public void log(int level, String message) {
        if (level > 0 && level <= this.level) {
            System.out.println(String.format("%d => %s", level, message));
        }
    }
}
