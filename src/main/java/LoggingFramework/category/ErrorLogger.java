package LoggingFramework.category;

import LoggingFramework.sink.LogSubject;

public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int level){
        this.level = level;
    }
    @Override
    protected void display(String msg, LogSubject logSubject) {
        logSubject.notifyAllObservers(2, msg);
//        System.out.println("ERROR: " + msg);
    }
}
