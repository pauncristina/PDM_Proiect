package com.example.proiect;

public class Description {
    private String titlu;
    private int imagine;
    private String descriere;

    public Description(String titlu, int imagine, String descriere){
        this.imagine = imagine;
        this.titlu = titlu;
        this.descriere = descriere;
    }
    public int getImagine(){
        return imagine;
    }

    public String getDescriere(){
        return descriere;
    }

    public String getTitlu(){

        return titlu;
    }

    public void setTitlu(String titlu) {

        this.titlu = titlu;
    }

    public void setImagine(int imagine){
        this.imagine = imagine;
    }

    public void setDescriere(String descriere){
        this.descriere = descriere;
    }
}
