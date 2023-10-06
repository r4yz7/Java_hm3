package org.example;

public class Money {
    int hryvna;
    int kopecks;

    public Money(int hryvna, int kopecks) {
        this.hryvna = hryvna;
        this.kopecks = kopecks;
    }
    public Money(){}

    public int getHryvna() {
        return hryvna;
    }

    public void setHryvna(int hryvna) {
        this.hryvna = hryvna;
    }

    public int getKopecks() {
        return kopecks;
    }

    public void setKopecks(int kopecks) {
        this.kopecks = kopecks;
    }

    public void addMoney(int hr, int kop){
        this.hryvna += hr;
        this.kopecks +=kop;
        if(this.kopecks>=100){
            this.hryvna+=this.kopecks/100;
            this.kopecks %=100;
        }
    }
    public void subMoney(Money m1, Money m2) {
        if (m1.getHryvna() < m2.getHryvna() || (m1.getHryvna() == m2.getHryvna() && m1.getKopecks() < m2.getKopecks())) {
            System.out.println("Not enough money");
        } else {
            int newHr = m1.getHryvna() - m2.getHryvna();
            int newKop = m1.getKopecks() - m2.getKopecks();

            while (newKop < 0) {
                newHr--;
                newKop += 100;
            }

            m1.setHryvna(newHr);
            m1.setKopecks(newKop);
        }
    }

    public void showMoney(){
        System.out.println("Hryvna: "+hryvna+"\nKopecks: " + kopecks + "\n");
    }
}
