package com.company;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Empleado {
    private String nonbreCompleto;
    private String nss;
    private String telf;
    private Calendar fecha;
    private Tipo[] type;

    public Empleado(String nonbreCompleto, String nss, String telf, Calendar fecha, Tipo[] type) {
        this.nonbreCompleto = nonbreCompleto;
        this.nss = nss;
        this.telf = telf;
        this.fecha = Calendar.getInstance();
        this.type = type;
    }

    public Empleado(String nonbreCompleto, String nss, String telf, Calendar fecha) {
        this.nonbreCompleto = nonbreCompleto;
        this.nss = nss;
        this.telf = telf;
        this.fecha = fecha;

    }

    public String getNonbreCompleto() {
        return nonbreCompleto;
    }

    public void setNonbreCompleto(String nonbreCompleto) {
        this.nonbreCompleto = nonbreCompleto;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Tipo[] getType() {
        return type;
    }

    public void setType(Tipo[] type) {
        this.type = type;
    }

 

    @Override
    public String toString() {
        return "Empleado{" +
                "nonbreCompleto='" + nonbreCompleto + '\'' +
                ", nss='" + nss + '\'' +
                ", telf='" + telf + '\'' +
                ", fecha=" + fecha +
                ", type=" + Arrays.toString(type) +
                '}';
    }
}
