package atm;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public abstract class Tray {
    private int left;
    private Tray nextTray;
    private final int NOMINAL;

    public Tray(int nominal) {
        this.NOMINAL = nominal;
    }


    void setNext(Tray next){
        nextTray = next;
    }

    void process(int amount){
        left = amount % NOMINAL;

        if (nextTray == null && left > 0) {
            throw new IllegalArgumentException("Such bill cannot be processed!");

        } else if (nextTray != null && left > 0) {
            nextTray.process(left);
        }
        System.out.println("Extracted " + amount / NOMINAL + "*" + NOMINAL);
    }
}
