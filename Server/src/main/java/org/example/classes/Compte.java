package org.example.classes;

import java.util.Date;

public class Compte {
    private int code;
    private double solde;
    private Date date;

    public Compte() {
    }

    public Compte(int code, double solde, Date date) {
        this.code = code;
        this.solde = solde;
        this.date = date;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
