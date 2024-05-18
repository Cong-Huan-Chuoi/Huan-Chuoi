package Lab03.hust.soict.globalict.aims.store;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


import Lab03.Book;

public class AddBookToStoreScreen extends AddItemToStoreScreen {
    private JTextField tfId;
    private JTextField tfTitle;
    private JTextField tfCategory;
    private JTextField tfCost ;
    private JTextField tfAuthor;
    private JLabel jlId;
    private JLabel jlTitle;
    private JLabel jlCategory;
    private JLabel jlCost;
    private JLabel jlAuthor;
    private JButton button;
    private ButtonListener btnListener;

    

    public AddBookToStoreScreen(Store store){
        super(store);
        this.setTitle("Add Book to Store");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel Item = createItem();
        this.add(Item,BorderLayout.CENTER);
    }
    public JPanel createItem(){
       JPanel holder = new JPanel();
       
       holder.setLayout(new GridLayout(0, 2, 0 ,3));
       
       jlId = new JLabel("Enter the Id: ");
       jlTitle = new JLabel("Enter the Title: ");
       jlCategory = new JLabel("Enter the category: ");
       jlAuthor = new JLabel("Enter the author: ");
       jlCost =new JLabel("Enter the cost: ");
       tfId = new JTextField(30);
       tfTitle = new JTextField(30);
       tfCategory = new JTextField(30);
       tfCost = new JTextField(30);
       tfAuthor = new JTextField(30);
       tfCost =new JTextField(30);

       jlTitle.setPreferredSize(new Dimension(5, 5));
       tfTitle.setPreferredSize(new Dimension(5, 5));
       jlTitle.setHorizontalAlignment(JLabel.LEFT);

       button = new JButton("Confirm");
       //btn Listener chưa được khởi tạo đcmmm
       btnListener = new ButtonListener();
       button.addActionListener(btnListener);
       

       holder.add(jlId);
       holder.add(tfId);
       holder.add(jlTitle);
       holder.add(tfTitle);
       holder.add(jlCategory);
       holder.add(tfCategory);
       holder.add(jlAuthor);
       holder.add(tfAuthor);
       holder.add(jlCost);
       holder.add(tfCost);
       holder.add(button);
       
       return holder;

    }

    private class ButtonListener implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e) {
            //check button
            System.out.println("you press button");
           String buttonString = e.getActionCommand();
           if (buttonString.equals("Confirm")){
            if (tfId.getText().equals("") || tfTitle.getText().equals("") || tfCategory.getText().equals("") ||
               tfAuthor.getText().equals("") || tfCost.getText().equals("") ){
                JOptionPane.showMessageDialog(null, "Please write correctlly", "Error", JOptionPane.ERROR_MESSAGE);;
              return;
               }
            
            String title = tfTitle.getText();
            int Id = Integer.parseInt(tfId.getText());
            List<String> authors = new ArrayList<>();
            authors.add(tfAuthor.getText());
            String category = tfCategory.getText();
            float cost = Float.parseFloat(tfCost.getText());

            Book newbook = new Book(Id, title, category, cost, authors );
  
            store.addMedia(newbook);
            JOptionPane.showMessageDialog(null, "Book added successfully");


            tfTitle.setText("");
            tfId.setText("");
            tfAuthor.setText("");
            tfCategory.setText("");
            tfCost.setText("");
           }
        }
    }
   
    
}
