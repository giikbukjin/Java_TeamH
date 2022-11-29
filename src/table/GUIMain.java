package table;

import java.awt.Color;

import facade.DataEngineInterface;

public class GUIMain {
    static DataEngineInterface engine;
    public static void startGUI(DataEngineInterface en) {
        engine = en;
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        MyFrame mainFrame = new MyFrame("자산 관리 시스템");

        mainFrame.pack();
        mainFrame.setVisible(true);
        //tab.addTab("자산", mainFrame);
    }
}