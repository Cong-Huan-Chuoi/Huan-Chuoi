package Lab03.hust.soict.globalict.aims.store;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Lab03.media.CompactDisc;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen{

    private JTextField tfId;
    private JTextField tfTitle;
    private JTextField tfCategory;
    private JTextField tfCost ;
    private JTextField tfDirector;
    private JTextField tfLength;
    private JTextField tfArtist;
    private JLabel jlId;
    private JLabel jlTitle;
    private JLabel jlCategory;
    private JLabel jlCost;
    private JLabel jlDirector;
    private JLabel jlLength;
    private JLabel jlArtist;
    private JButton button;
    private ButtonListener btnListener;
    public AddCompactDiscToStoreScreen(Store store) {
        super(store);
        this.setTitle("Add DVD to Store");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel Item = createItem();
        this.add(Item, BorderLayout.CENTER);
    }

    @Override
    public JPanel createItem() {
        

        JPanel holder = new JPanel();
        holder.setLayout(new GridLayout(0, 2, 0 ,3));
        
        jlId = new JLabel("Enter the Id: ");
        jlTitle = new JLabel("Enter the Title: ");
        jlCategory = new JLabel("Enter the category: ");
        jlDirector = new JLabel("Enter the director: ");
        jlCost = new JLabel("Enter the cost: ");
        jlLength = new JLabel("Enter the Length");
        jlArtist = new JLabel("Enter the artist: ");

        tfId = new JTextField(30);
        tfTitle = new JTextField(30);
        tfCategory = new JTextField(30);
        tfCost = new JTextField(30);
        tfDirector = new JTextField(30);
        tfCost =new JTextField(30);
        tfLength = new JTextField(30);
        tfArtist = new JTextField(30);

        jlTitle.setPreferredSize(new Dimension(5, 5));
        tfTitle.setPreferredSize(new Dimension(5, 5));
        jlTitle.setHorizontalAlignment(JLabel.LEFT);
 
        button = new JButton("Confirm");
        btnListener = new ButtonListener();
        button.addActionListener(btnListener);
        
 
        holder.add(jlId);
        holder.add(tfId);

        holder.add(jlTitle);
        holder.add(tfTitle);

        holder.add(jlCategory);
        holder.add(tfCategory);

        holder.add(jlCost);
        holder.add(tfCost);

        holder.add(jlLength);
        holder.add(tfLength);

        holder.add(jlDirector);
        holder.add(tfDirector);

        holder.add(jlArtist);
        holder.add(tfArtist);
       
        holder.add(button);
        
        return holder;
    }

    private class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String buttonString = e.getActionCommand();

            if(buttonString.equals("Confirm")){
                String title = tfTitle.getText().trim();
                String category = tfCategory.getText().trim();
                String director = tfDirector.getText().trim();
                String artist = tfArtist.getText().trim();
                String idtext = tfId.getText().trim();
                String costtext = tfCost.getText().trim();
                String lengthtext = tfLength.getText().trim();

                int id = Integer.parseInt(idtext);
                int length = Integer.parseInt(lengthtext);
                float cost = Float.parseFloat(costtext);

                if (title.isEmpty() || director.isEmpty() || category.isEmpty() || artist.isEmpty() || idtext.isEmpty() ||
                    costtext.isEmpty() || lengthtext.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Please write correctlly", "Error", JOptionPane.ERROR_MESSAGE);;
                    return;
                }

                CompactDisc newcD = new CompactDisc(id, title, category, director, length, cost, artist);
                store.addMedia(newcD);
                JOptionPane.showMessageDialog(null, "CD added successfully");

                tfTitle.setText("");
                tfId.setText("");
                tfCategory.setText("");
                tfCost.setText("");
                tfLength.setText("");
                tfDirector.setText("");
                tfArtist.setText("");

            }
            
        }
    
        
    }

}
