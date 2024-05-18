package Hust.soict.globalict.swing;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AWTAccumulator extends Frame {
    private TextField tfInput;
    private TextField tfOUtput;
    private int sum = 0;
    public AWTAccumulator(){
        setLayout(new GridLayout(2, 2));
        add(new Label("ENter an Interger: "));
        tfInput = new TextField(10);
        add(tfInput);
        tfInput.addActionListener(new TFInputListener());
        add(new Label("The Accumulated Sum is: "));

        tfOUtput = new TextField(10);
        tfOUtput.setEditable(false);
        add(tfOUtput);
        setTitle("AWT Accumulator");
        setSize(350, 120);
        setVisible(true);
    }
    public static void main(String[] args) {
        new AWTAccumulator();
    }
    private class  TFInputListener implements ActionListener {
        public void actionPerformed(ActionEvent evt){
            int numberIn = Integer.parseInt(tfInput.getText());
            sum += numberIn;
            tfInput.setText("");
            tfOUtput.setText(sum + "");
        }
        
    }
}
