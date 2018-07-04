package eu.irian;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Counter {

    private int counter1;
    private int counter2;


    public Counter() {
        System.out.println("#new");
    }

    public String reload1() {
        counter1++;
        System.out.println("#1 " + counter1);
        return null;
    }

   public String reload2() {
        counter2++;
       System.out.println("#2 " + counter2);
        return null;
    }

    public int getCounter1() {
        return counter1;
    }

    public int getCounter2() {
        return counter2;
    }
}
