package Lab03.hust.soict.globalict.aims.store;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Lab03.Book;
import Lab03.media.CompactDisc;
import Lab03.media.DigitalVideoDisc;
import Lab03.media.Media;
import Lab03.media.Playable;


public class MediaStore extends JPanel {
   private Media media;
   JLabel mediaType;

public MediaStore(Media media){
    this.media = media;
    this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

    ButtonListener btnListener = new ButtonListener();
    
    if (media instanceof Book) mediaType = new JLabel("(Book)");
    else if (media instanceof CompactDisc) mediaType = new JLabel("(CD)");
    else if (media instanceof DigitalVideoDisc) mediaType = new JLabel("(DVD)");

    mediaType.setFont(new Font(mediaType.getFont().getName(), Font.PLAIN, 15));
    mediaType.setAlignmentX(CENTER_ALIGNMENT);

    JLabel title = new JLabel(media.getTitle());
    title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 15));
    title.setAlignmentX(CENTER_ALIGNMENT);

    JLabel cost = new JLabel("" + media.getCost() + "$");
    cost.setAlignmentX(CENTER_ALIGNMENT);

    JPanel container = new JPanel();
    container.setLayout(new FlowLayout(FlowLayout.CENTER));

    if (media instanceof Playable){
        JButton playButton = new JButton("Play");
        playButton.addActionListener(btnListener);
        container.add(playButton);

    }

    this.add(Box.createVerticalGlue());
    this.add(mediaType);
    this.add(title);
    this.add(cost);
    this.add(Box.createVerticalGlue());

    this.add(container);
    this.setBorder(BorderFactory.createLineBorder(Color.BLACK));

   }
    

   private class ButtonListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String buttonCommand = e.getActionCommand();

            if (buttonCommand.equals("Play")) {

                if (media instanceof CompactDisc) {

                    CompactDisc cdToPlay = (CompactDisc) media;
                    cdToPlay.play();

                } else if (media instanceof DigitalVideoDisc) {
                    
                    DigitalVideoDisc dvdToPlay = (DigitalVideoDisc) media;
                    dvdToPlay.play();
                }
    
             }
   }
  }
}
