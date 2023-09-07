import javax.swing.*;

// creating a simple  GUI using inheritance 


public class Swing2 extends JFrame

{
  // inheriting jframe 

  JFrame f;


  Swing2()// Name of the file
  {
      JButton b= new JButton("Click Me");// creating obj b in class JButton

      b.setBounds(130, 100, 100, 47);// setting boundaries to the GUI

      add(b); // adding button to the GUI

      setSize(400, 500);  //declaring the size of the  GUI

      setLayout(null);

      setVisible(true);

  
  }

  public static void main(String[]  args) 
  {
    new Swing2();// calling the method
  }
}