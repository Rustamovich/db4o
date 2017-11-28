package com.db4o.project;

import com.db4o.ObjectContainer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddVisitBanki extends JFrame {
    ObjectContainer db;

    public AddVisitBanki(ObjectContainer db){
        this.db = db;
        setTitle("Добавление банок");
        setBounds(200, 200, 1000, 500);
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
        jp1.setLayout(new GridLayout(6,1,5,5));
        jp.add(jp1, BorderLayout.CENTER);
        JTextField vesselName1 = new JTextField();
        vesselName1.setText("Название первого катера");
        jp1.add(vesselName1);
        JTextField bankaName1 = new JTextField();
        bankaName1.setText("Название первой банки");
        jp1.add(bankaName1);
        JTextField dateIn1 = new JTextField();
        dateIn1.setText("Время прибытия на первую банку");
        jp1.add(dateIn1);
        JTextField dateOut1 = new JTextField();
        dateOut1.setText("Время отбытия от банки");
        jp1.add(dateOut1);
        JTextField quality1 = new JTextField();
        quality1.setText("Качество рыбы в первой банке");
        jp1.add(quality1);

        JButton jButton = new JButton("Отправить");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bankaName1_ = bankaName1.getText();
                String vesselName1_ = vesselName1.getText();
                String dateIn1_ = dateIn1.getText();
                String dateOut1_ = dateOut1.getText();
                String quality1_ = quality1.getText();
                visitBanki banki_add = new visitBanki();
                banki_add.setDateIn1(dateIn1_);
                banki_add.setDateOut1(dateOut1_);
                banki_add.setQuality1(quality1_);
                banki_add.setBankaName1(bankaName1_);
                banki_add.setVesselName1(vesselName1_);
                db.store(banki_add);
            }
        });
        jp1.add(jButton);
        setVisible(true);
    }
}
