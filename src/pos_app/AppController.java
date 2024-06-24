/*
 * Point of Sale System Project - Academic Assignment
 * Author/s: Mariano Luiz B. King, et al.
 *
 * This program was created as part of an academic assignment in Computer Science at Pamantasan ng Lungsod ng Maynila.
 * It is intended for educational purposes only and should not be used for commercial purposes.
 * 
 */

package pos_app;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;


public class AppController {
    private static List<JFrame> frames = new ArrayList<>();
    
    public static void registerFrame(JFrame frame) {
        frames.add(frame);
    }
    
    public static void unregisterFrame(JFrame frame) {
        frames.remove(frame);
    }
    
    public static void disposeAllFrames() {
        for (JFrame frame : frames) {
            frame.dispose();
        }
        frames.clear();
    }
}
