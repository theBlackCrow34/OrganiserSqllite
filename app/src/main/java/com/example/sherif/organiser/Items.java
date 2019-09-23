package com.example.sherif.organiser;

public class Items {
    private int result;
    private String date;
    private String salah;
    private String sonan;
    private String wodoo;
    private String azkar;
    private String sabah;
    private String qouraan;
    private String masaa;
    private String weter;
    private String azkarNawm;
    private String dohaa;

    public Items(int result, String date,String salah,String weter,String wodoo,String dohaa,String azkar,String azkarNawm,String
             qouraan,String sabah,String masaa,String sonan) {
        this.result = result;
        this.date = date;
        this.sabah = sabah;
        this.salah = salah;
        this.masaa = masaa;
        this.dohaa = dohaa;
        this.weter = weter;
        this.sonan = sonan;
        this.azkar = azkar;
        this.azkarNawm = azkarNawm;
        this.qouraan = qouraan;
        this.wodoo = wodoo;
    }

    public int getResult() {
        return result;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getAzkar() {
        return azkar;
    }

    public String getSalah() {
        return salah;
    }

    public void setSalah(String salah) {
        this.salah = salah;
    }

    public String getAzkarNawm() {
        return azkarNawm;
    }

    public String getsonan() {
        return sonan;
    }

    public String getwodoo() {
        return wodoo;
    }

    public String getSabah() {
        return sabah;
    }

    public void setAzkar(String azkar) {
        this.azkar = azkar;
    }

    public void setsonan(String sonan) {
        this.sonan = sonan;
    }

    public void setSabah(String sabah) {
        this.sabah = sabah;
    }

    public void setwodoo(String wodoo) {
        this.wodoo = wodoo;
    }

    public String getDohaa() {
        return dohaa;
    }

    public String getMasaa() {
        return masaa;
    }

    public String getqouraan() {
        return qouraan;
    }

    public String getweter() {
        return weter;
    }

    public void setqouraan(String qouraan) {
        this.qouraan = qouraan;
    }

    public void setAzkarNawm(String azkarNawm) {
        this.azkarNawm = azkarNawm;
    }

    public void setMasaa(String masaa) {
        this.masaa = masaa;
    }

    public void setDohaa(String dohaa) {
        this.dohaa = dohaa;
    }

    public void setweter(String weter) {
        this.weter = weter;
    }
}


























