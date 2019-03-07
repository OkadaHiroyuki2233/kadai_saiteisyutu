package com.company;

    public class Peason {

        private String myname;

        private String syushin;

        public Peason(String myname, String syushin) {
            this .myname = myname;
            this .syushin = syushin;
        }

        public void SelfIntroduction(){
            System.out.println( "私の名前は" + myname + "です。" + syushin + "出身です。");
        }
    }

