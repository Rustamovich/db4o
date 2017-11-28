package com.db4o.project;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class CheckDB {
    public static void main(String[] args) {
        ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "fish_new");
        ObjectSet result1 = db.query(CrewMember.class);
        System.out.println(result1.size());;
        ObjectSet result2 = db.query(Passport.class);
        System.out.println(result2.size());;
        ObjectSet result3 = db.query(visitBanki.class);
        System.out.println(result3.size());;
        ObjectSet result4 = db.query(Fishing.class);
        System.out.println(result4.size());;
        ObjectSet result5 = db.query(BankiName.class);
        System.out.println(result5.size());;
        db.close();
    }
}
