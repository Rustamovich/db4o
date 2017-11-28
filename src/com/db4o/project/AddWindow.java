package com.db4o.project;

import com.db4o.ObjectContainer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AddWindow extends JFrame{
    ObjectContainer db;

    public AddWindow(ObjectContainer db){
        this.db = db;
        setTitle("Добавление");
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
        jp1.setLayout(new GridLayout(5,1,5,5));
        jp.add(jp1, BorderLayout.CENTER);
        JTextField name = new JTextField();
        name.setText("Название");
        jp1.add(name);
        JTextField type = new JTextField();
        type.setText("Тип");
        jp1.add(type);
        JTextField displacement = new JTextField();
        displacement.setText("Водоизмещение");
        jp1.add(displacement);
        JTextField year = new JTextField();
        year.setText("Год выпуска");
        jp1.add(year);
        JButton jButton = new JButton("Отправить");
        jButton.addActionListener(new ActionListener() {
                                      @Override
                                      public void actionPerformed(ActionEvent e) {
                                          String name_ = name.getText();
                                          String type_ = type.getText();
                                          String displacement_ = displacement.getText();
                                          String year_ = year.getText();
                                          Passport p_add = new Passport(name_, type_, displacement_, year_);
                                          db.store(p_add);
                                      }
                                  });
        jp1.add(jButton);
        setVisible(true);
    }
}
