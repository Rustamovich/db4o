package com.db4o.project;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame{
    public MainWindow(){
        ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "fish_new");
        setTitle("Добавление");
        setBounds(200, 200, 400, 300);
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
        JButton jButton1 = new JButton("Добавление паспорта судна");
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddWindow addWindow = new AddWindow(db);
            }
        });
        jp1.add(jButton1);
        JButton jButton2 = new JButton("Добавление членов команды");
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddCrewMember addCrewMember = new AddCrewMember(db);
            }
        });
        jp1.add(jButton2);
        JButton jButton3 = new JButton("Добавление выхода на лов");
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddFishing addFishing = new AddFishing(db);
            }
        });
        jp1.add(jButton3);
        JButton jButton4 = new JButton("Добавление посещений банок");
        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddVisitBanki addVisitBanki = new AddVisitBanki(db);
            }
        });
        jp1.add(jButton4);
        JButton jButton5 = new JButton("Добавление названий банок");
        jButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddBankiName addBankiName = new AddBankiName(db);
            }
        });
        jp1.add(jButton5);
        setVisible(true);
    }
}
