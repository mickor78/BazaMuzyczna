import com.sun.xml.internal.ws.util.StreamUtils;

import java.util.*;

public class Utwor {
    String direction; //katalog
    String titlle = "NULL";
    String author = "NULL";
    String alubum = "NULL";

    public Utwor(String direction, String titlle, String author, String alubum) {
        this.direction = direction;
        this.titlle = titlle;
        this.author = author;
        this.alubum = alubum;
    }

    public Utwor(String direction, String titlle, String author) {
        this.direction = direction;
        this.titlle = titlle;
        this.author = author;
    }

    public Utwor(String direction, String titlle) {
        this.direction = direction;
        this.titlle = titlle;
    }

    public Utwor(String direction) {
        this.direction = direction;
    }


    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getTitlle() {
        return titlle;
    }

    public void setTitlle(String titlle) {
        this.titlle = titlle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAlubum() {
        return alubum;
    }

    public void setAlubum(String alubum) {
        this.alubum = alubum;
    }
}
