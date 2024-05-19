package gem_cutter.src.Main;

import org.dreambot.api.methods.Calculations;
import org.dreambot.api.methods.container.impl.Inventory;
import org.dreambot.api.methods.container.impl.bank.Bank;
import org.dreambot.api.methods.container.impl.bank.BankLocation;
import org.dreambot.api.methods.input.Camera;
import org.dreambot.api.methods.interactive.Players;
import org.dreambot.api.methods.item.GroundItems;
import org.dreambot.api.methods.map.Area;
import org.dreambot.api.methods.map.Tile;
import org.dreambot.api.methods.walking.impl.Walking;
import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;
import org.dreambot.api.utilities.Sleep;
import org.dreambot.api.utilities.Timer;

import javax.swing.*;
import java.awt.*;

@ScriptManifest(
        name = "Bredz' template",
        author = "Bredz",
        version = 1.0,
        category = Category.MONEYMAKING
)

public class Main extends AbstractScript {

    private int Stat1 = 0;

    public enum State {
        STATE_1, STATE_2, STATE_3
    }


    private Timer t = new Timer();

    public boolean isStarted;
    private State state;


    public void state_handler() {
        switch (state) {
            case STATE_1:
                break;
            case STATE_2:
                break;
            case STATE_3:
                break;
        }
    }

    public void set_state() {
        if (Inventory.isFull()) {
            // this.state = State.STATE_1;
            this.state = State.STATE_2;
        } else {
            this.state = State.STATE_3;
        }
    }

    public void STATE_1() {
        ; //code
    }

    public void STATE_2() {
        ; //code
    }

    private void STATE_3() {
        ; //code
    }

    public void onPaint(Graphics g) {
        g.drawString(t.formatTime(), 102, 269);
        g.drawString("Stat 1: " + t.formatTime(), 102, 289);
    }

    public void onStart() {
        this.Stat1 = 0;
        SwingUtilities.invokeLater(() -> {
            new gem_cutter.Gui.Gui(this);
        });
    }

    public int onLoop() {
        set_state();
        state_handler();
        return Calculations.random(600, 700);
    }
}

