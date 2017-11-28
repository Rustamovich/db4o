package com.db4o.project;

import com.db4o.ObjectContainer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBankiName extends JFrame{

    ObjectContainer db;

    public AddBankiName(ObjectContainer db){
        this.db = db;
        setTitle("Добавление названия банки");
        setBounds(200, 200, 400, 250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(Color.DARK_GRAY);
        JPanel jp = new JPanel();
        jp.setLayout(new BorderLayout());
        add(jp);
        JMenuBar jmenubar = new JMenuBar();
        jmenubar.setBounds(0,0,20,20);
        jp.add(jmenubar, BorderLayout.PAGE_START);
        JMenu jmenu = new JMenu("File");
        jmenubar.add(jmenu);
        JMenuItem exit = new JMenuItem("Exit");
        jmenu.add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                db.close();
                System.exit(0);

            }
        });
        JPanel jp1 = new JPanel();
        jp1.setLayout(new GridLayout(2,1,5,5));
        jp.add(jp1, BorderLayout.CENTER);
        JTextField name = new JTextField();
        name.setText("Название банки");
        jp1.add(name);
        JButton jButton = new JButton("Отправить");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name_ = name.getText();
                BankiName bankiName_add = new BankiName();
                bankiName_add.setBankaName(name_);
                db.store(bankiName_add);
            }
        });
        jp1.add(jButton);
        setVisible(true);
    }
}
