package de.gbsschulen.wagenhuber.wawi.rest;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

@XmlRootElement
@Entity
public class Artikel {

    @Id
    private int artnr;
    private String bezeichnung, gruppe, vkpreis, lief, ekpreis, lieferzeit, mindbestand, hinweis, mengebestellt, mwst, aktiv, inaktivam, inaktivvon;

    public Artikel() {
    }

    public Artikel(int artnr, String bezeichnung, String gruppe, String vkpreis, String lief, String ekpreis, String lieferzeit, String mindbestand, String hinweis, String mengebestellt, String mwst, String aktiv, String inaktivam, String inaktivvon) {
        this.artnr = artnr;
        this.bezeichnung = bezeichnung;
        this.gruppe = gruppe;
        this.vkpreis = vkpreis;
        this.lief = lief;
        this.ekpreis = ekpreis;
        this.lieferzeit = lieferzeit;
        this.mindbestand = mindbestand;
        this.hinweis = hinweis;
        this.mengebestellt = mengebestellt;
        this.mwst = mwst;
        this.aktiv = aktiv;
        this.inaktivam = inaktivam;
        this.inaktivvon = inaktivvon;
    }

    public int getArtnr() {
        return artnr;
    }

    public void setArtnr(int artnr) {
        this.artnr = artnr;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getGruppe() {
        return gruppe;
    }

    public void setGruppe(String gruppe) {
        this.gruppe = gruppe;
    }

    public String getVkpreis() {
        return vkpreis;
    }

    public void setVkpreis(String vkpreis) {
        this.vkpreis = vkpreis;
    }

    public String getLief() {
        return lief;
    }

    public void setLief(String lief) {
        this.lief = lief;
    }

    public String getEkpreis() {
        return ekpreis;
    }

    public void setEkpreis(String ekpreis) {
        this.ekpreis = ekpreis;
    }

    public String getLieferzeit() {
        return lieferzeit;
    }

    public void setLieferzeit(String lieferzeit) {
        this.lieferzeit = lieferzeit;
    }

    public String getMindbestand() {
        return mindbestand;
    }

    public void setMindbestand(String mindbestand) {
        this.mindbestand = mindbestand;
    }

    public String getHinweis() {
        return hinweis;
    }

    public void setHinweis(String hinweis) {
        this.hinweis = hinweis;
    }

    public String getMengebestellt() {
        return mengebestellt;
    }

    public void setMengebestellt(String mengebestellt) {
        this.mengebestellt = mengebestellt;
    }

    public String getMwst() {
        return mwst;
    }

    public void setMwst(String mwst) {
        this.mwst = mwst;
    }

    public String getAktiv() {
        return aktiv;
    }

    public void setAktiv(String aktiv) {
        this.aktiv = aktiv;
    }

    public String getInaktivam() {
        return inaktivam;
    }

    public void setInaktivam(String inaktivam) {
        this.inaktivam = inaktivam;
    }

    public String getInaktivvon() {
        return inaktivvon;
    }

    public void setInaktivvon(String inaktivvon) {
        this.inaktivvon = inaktivvon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artikel artikel = (Artikel) o;
        return artnr == artikel.artnr &&
                Objects.equals(bezeichnung, artikel.bezeichnung) &&
                Objects.equals(gruppe, artikel.gruppe) &&
                Objects.equals(vkpreis, artikel.vkpreis) &&
                Objects.equals(lief, artikel.lief) &&
                Objects.equals(ekpreis, artikel.ekpreis) &&
                Objects.equals(lieferzeit, artikel.lieferzeit) &&
                Objects.equals(mindbestand, artikel.mindbestand) &&
                Objects.equals(hinweis, artikel.hinweis) &&
                Objects.equals(mengebestellt, artikel.mengebestellt) &&
                Objects.equals(mwst, artikel.mwst) &&
                Objects.equals(aktiv, artikel.aktiv) &&
                Objects.equals(inaktivam, artikel.inaktivam) &&
                Objects.equals(inaktivvon, artikel.inaktivvon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(artnr, bezeichnung, gruppe, vkpreis, lief, ekpreis, lieferzeit, mindbestand, hinweis, mengebestellt, mwst, aktiv, inaktivam, inaktivvon);
    }

    @Override
    public String toString() {
        return "Artikel{" +
                "artnr=" + artnr +
                ", bezeichnung='" + bezeichnung + '\'' +
                ", gruppe='" + gruppe + '\'' +
                ", vkpreis='" + vkpreis + '\'' +
                ", lief='" + lief + '\'' +
                ", ekpreis='" + ekpreis + '\'' +
                ", lieferzeit='" + lieferzeit + '\'' +
                ", mindbestand='" + mindbestand + '\'' +
                ", hinweis='" + hinweis + '\'' +
                ", mengebestellt='" + mengebestellt + '\'' +
                ", mwst='" + mwst + '\'' +
                ", aktiv='" + aktiv + '\'' +
                ", inaktivam='" + inaktivam + '\'' +
                ", inaktivvon='" + inaktivvon + '\'' +
                '}';
    }
}
