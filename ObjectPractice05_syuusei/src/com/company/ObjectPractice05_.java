package com.company;

public class ObjectPractice05_ {
    public static void main(String[] args) {
        Peason[] peason4 = {new Peason("森田", "奈良"),
                            new Peason("木村", "埼玉"),
                            new Peason("高山", "東京"),
                            new Peason("茂木", "沖縄")};

        for (int i=0;i < peason4.length; i++){
            peason4[i].SelfIntroduction();
        }

    }
}
