package cz.uhk.fim.rssreader.gui;

import cz.uhk.fim.rssreader.utils.FileUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


public class MainFrame extends JFrame {

    JLabel errorLabel = new JLabel("Prázdné pole");


    public MainFrame () {
       init();
   }

   private void init(){
       setTitle("RSSreader");
       setSize(800, 600);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLocationRelativeTo(null);

       initContentUI();
   }


    public boolean validateInput(String text){
        if(text.trim().isEmpty()){
            errorLabel.setHorizontalAlignment(SwingConstants.CENTER);
            errorLabel.setForeground(Color.RED);
            errorLabel.setVisible(true);
        } return false;
    }

    private void initContentUI(){

       JPanel controlPanel = new JPanel(new BorderLayout());

       JButton btnLoad = new JButton("Load");
       JTextField txtInputField = new JTextField();
       JButton btnSave = new JButton("Save");

       controlPanel.add(btnLoad, BorderLayout.WEST);
       controlPanel.add(btnSave, BorderLayout.EAST);
       controlPanel.add(txtInputField, BorderLayout.CENTER);
       controlPanel.add(errorLabel, BorderLayout.SOUTH);
       errorLabel.setVisible(false);

       add(controlPanel,BorderLayout.NORTH);

       JTextArea txtContent = new JTextArea();

       add(new JScrollPane(txtContent), BorderLayout.CENTER);

       btnLoad.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {

               try {
                   if(validateInput(txtInputField.getText()) == false){
                   txtContent.setText(FileUtils.loadStringFromFile(txtInputField.getText()));}
               } catch (IOException e1){
                   System.out.println(e1.getMessage());
               }
           }
       });

       btnSave.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e1) {

               try {
                   FileUtils.saveStringToFile(txtInputField.getText(),txtContent.getText().getBytes("UTF-8"));
               } catch (IOException e) {
                   e.printStackTrace();
               }

           }
       });


    }

}
