/*
Design and implement a HitCounter class that keeps track of requests (or hits). It should support the following operations:

    record(timestamp): records a hit that happened at timestamp
    total(): returns the total number of hits recorded
    range(lower, upper): returns the number of hits that occurred between timestamps lower and upper (inclusive)

Follow-up: What if our system has limited memory?
 */

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

public class DCP132 {

    ArrayList arr = new ArrayList();

    public void recordTime(){
        Date date = new Date();
        arr.add(date);
    }

    public void totalTime(){
        System.out.println(arr.size());
    }

    public void rangeTime(int upper, int lower){
        
    }

    public static void main(String[] args) {
        DCP132 test = new DCP132();
        test.recordTime();
        test.recordTime();
        test.totalTime();
    }
}
