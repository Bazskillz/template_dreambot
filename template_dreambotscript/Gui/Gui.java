package gem_cutter.Gui;

import javax.swing.*;

public class Gui extends JFrame {

    public Gui(gem_cutter.src.Main.Main reference) {
        init(reference);
    }

    public void init(gem_cutter.src.Main.Main reference) {

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        reference.isStarted = true;
        setVisible(false);
    }
}
