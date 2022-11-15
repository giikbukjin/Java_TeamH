package table;

import javax.swing.JFrame;

import facade.DataEngineInterface;
import account.AccountMgr;

public class GUIMain {
    static DataEngineInterface engine;
    public static void startGUI(DataEngineInterface en) {
    	engine = en;
       //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
    	JFrame mainFrame = new JFrame("TableSelectionDemo");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        TableSelectionDemo newContentPane = new TableSelectionDemo();
        newContentPane.addComponentsToPane();
        mainFrame.getContentPane().add(newContentPane);

        //Display the window.
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}
