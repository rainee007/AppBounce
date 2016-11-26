package jun.test.bounce;


import javax.swing.*;

class AppBounce {

    public static void main(String[] args) {
      try {
        // Set System L&F
        String n = UIManager.getSystemLookAndFeelClassName();
        UIManager.setLookAndFeel(n);
      }
      catch (Exception e) {
        // handle exception
        System.out.println(e.getLocalizedMessage());
      }

      javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          MainFrame frame = new MainFrame();
          JFrame.setDefaultLookAndFeelDecorated(true);
          frame.showFrame();
        }
      });
    }
}
