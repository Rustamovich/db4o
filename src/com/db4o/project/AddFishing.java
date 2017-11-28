package com.db4o.project;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddFishing extends JFrame{
    ObjectContainer db;

    public AddFishing(ObjectContainer db){
        this.db = db;
        setTitle("Добавление выхода на лов");
        setBounds(200, 200, 400, 700);
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
        jp1.setLayout(new GridLayout(19,1,5,5));
        jp.add(jp1, BorderLayout.CENTER);
        JTextField vesselName = new JTextField();
        vesselName.setText("Название");
        jp1.add(vesselName);
        JTextField crewMember1Name = new JTextField();
        crewMember1Name.setText("Имя первого члена команды");
        jp1.add(crewMember1Name);
        JTextField crewMember2Name = new JTextField();
        crewMember2Name.setText("Имя второго члена команды");
        jp1.add(crewMember2Name);
        JTextField crewMember3Name = new JTextField();
        crewMember3Name.setText("Имя третьего члена команды");
        jp1.add(crewMember3Name);
        JTextField crewMember4Name = new JTextField();
        crewMember4Name.setText("Имя четвертого члена команды");
        jp1.add(crewMember4Name);
        JTextField crewMember5Name = new JTextField();
        crewMember5Name.setText("Имя пятого члена команды");
        jp1.add(crewMember5Name);
        JTextField dateOut = new JTextField();
        dateOut.setText("Время выхода");
        jp1.add(dateOut);
        JTextField dateIn = new JTextField();
        dateIn.setText("Время возвращения");
        jp1.add(dateIn);
        JTextField sort1 = new JTextField();
        sort1.setText("Название первого сорта рыбы");
        jp1.add(sort1);
        JTextField weightSort1 = new JTextField();
        weightSort1.setText("Вес первого сорта рыбы");
        jp1.add(weightSort1);
        JTextField sort2 = new JTextField();
        sort2.setText("Название второго сорта рыбы");
        jp1.add(sort2);
        JTextField weightSort2 = new JTextField();
        weightSort2.setText("Вес второго сорта рыбы");
        jp1.add(weightSort2);
        JTextField sort3 = new JTextField();
        sort3.setText("Название третьего сорта рыбы");
        jp1.add(sort3);
        JTextField weightSort3 = new JTextField();
        weightSort3.setText("Вес третьего сорта рыбы");
        jp1.add(weightSort3);
        JTextField sort4 = new JTextField();
        sort4.setText("Название четвертого сорта рыбы");
        jp1.add(sort4);
        JTextField weightSort4 = new JTextField();
        weightSort4.setText("Вес четвертого сорта рыбы");
        jp1.add(weightSort4);
        JTextField sort5 = new JTextField();
        sort5.setText("Название пятого сорта рыбы");
        jp1.add(sort5);
        JTextField weightSort5 = new JTextField();
        weightSort5.setText("Вес пятого сорта рыбы");
        jp1.add(weightSort5);
        JButton jButton = new JButton("Отправить");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String vesselName_ = vesselName.getText();
                String crewMember1Name_ = crewMember1Name.getText();
                CrewMember proto1 = new CrewMember(crewMember1Name_, null, null);
                ObjectSet result1 = db.queryByExample(proto1);
                CrewMember CM1 = (CrewMember) result1.get(0);
                String crewMember2Name_ = crewMember2Name.getText();
                CrewMember proto2 = new CrewMember(crewMember2Name_, null, null);
                ObjectSet result2 = db.queryByExample(proto2);
                CrewMember CM2 = (CrewMember) result2.get(0);
                String crewMember3Name_ = crewMember3Name.getText();
                CrewMember proto3 = new CrewMember(crewMember3Name_, null, null);
                ObjectSet result3 = db.queryByExample(proto3);
                CrewMember CM3 = (CrewMember) result3.get(0);
                String crewMember4Name_ = crewMember4Name.getText();
                CrewMember proto4 = new CrewMember(crewMember4Name_, null, null);
                ObjectSet result4 = db.queryByExample(proto4);
                CrewMember CM4 = (CrewMember) result4.get(0);
                String crewMember5Name_ = crewMember5Name.getText();
                CrewMember proto5 = new CrewMember(crewMember5Name_, null, null);
                ObjectSet result5 = db.queryByExample(proto5);
                CrewMember CM5 = (CrewMember) result5.get(0);
                String dateOut_ = dateOut.getText();
                String dateIn_ = dateIn.getText();
                String sort1_ = sort1.getText();
                String weightSort1_ = weightSort1.getText();
                String sort2_ = sort2.getText();
                String weightSort2_ = weightSort2.getText();
                String sort3_ = sort3.getText();
                String weightSort3_ = weightSort3.getText();
                String sort4_ = sort4.getText();
                String weightSort4_ = weightSort4.getText();
                String sort5_ = sort5.getText();
                String weightSort5_ = weightSort5.getText();
                Fishing fishing_add = new Fishing(vesselName_, CM1, CM2, CM3, CM4, CM5, dateOut_, dateIn_,
                sort1_, weightSort1_, sort2_, weightSort2_, sort3_, weightSort3_, sort4_, weightSort4_,
                sort5_, weightSort5_);
                db.store(fishing_add);
            }
        });
        jp1.add(jButton);
        setVisible(true);
    }
}
