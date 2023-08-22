import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
  
public class About extends JFrame implements ActionListener {
    About(){
      setBounds(400, 100, 600, 500);
      setLayout(null);
      ImageIcon pic = new ImageIcon(ClassLoader.getSystemResource("./icons/windows.png"));
      Image pic1 = pic.getImage().getScaledInstance(300, 60, Image.SCALE_DEFAULT);
      ImageIcon pic2 = new ImageIcon(pic1);
      JLabel headerIcon = new JLabel(pic2);
      headerIcon.setBounds(70, 40, 400, 80);
      add(headerIcon);

      ImageIcon pic3 = new ImageIcon(ClassLoader.getSystemResource("./icons/notepad.png"));
      Image pic4 = pic3.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
      ImageIcon pic5 = new ImageIcon(pic4);
      JLabel icon = new JLabel(pic5);
      icon.setBounds(50, 180, 70, 70);
      add(icon);

      JLabel text = new JLabel("<html>Yash Giri <br>Version 0.1.0 (OS Build Java)<br>@Yash Giri.All rights reserved</html>");
      text.setBounds(150,100,500,200);
      text.setFont(new Font("SAN SERIF",Font.PLAIN,16));
      add(text);

      JButton b1 = new JButton("OK");
      b1.setBounds(150,350,120,25);
      b1.addActionListener(this);
      add(b1);
      setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae){
         this.setVisible(false);
    }
    
     public static void main(String[] args){
        new About();
     }

}
