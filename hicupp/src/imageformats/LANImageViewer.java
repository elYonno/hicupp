package imageformats;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class LANImageViewer {
  public static void main(String[] args) {
    try {
      RGBAImage image = new LANImage(args[0]).toRGBAImage();
      Frame frame = new Frame("LAN Image Viewer");
      frame.add(new ImageViewer(image));
      frame.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
          System.exit(0);
        }
      });
      frame.pack();
      frame.setVisible(true);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
