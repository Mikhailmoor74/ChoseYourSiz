package moor.foundation.choseyoursiz.data;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class Respirators {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public String title;
    public String classOfDefend;
    public String clapan;
    public String construction;
    public String description;
    public int imageResource;


    public Respirators() {
    }

    public Respirators(String title, String classOfDefend, String clapan, String construction, String description) {

        this.classOfDefend = classOfDefend;
        this.clapan = clapan;
        this.construction = construction;
        this.description = description;
    }

    public Respirators(String title, String classOfDefend, String clapan, String construction) {
        this.title = title;
        this.classOfDefend = classOfDefend;
        this.clapan = clapan;
        this.construction = construction;
    }

    public Respirators(int id, String title, String classOfDefend, String clapan, String construction, String description, int imageResource) {
        this.id = id;
        this.title = title;
        this.classOfDefend = classOfDefend;
        this.clapan = clapan;
        this.construction = construction;
        this.description = description;
        this.imageResource = imageResource;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassOfDefend() {
        return classOfDefend;
    }

    public void setClassOfDefend(String classOfDefend) {
        this.classOfDefend = classOfDefend;
    }

    public String getClapan() {
        return clapan;
    }

    public void setClapan(String clapan) {
        this.clapan = clapan;
    }

    public String getConstruction() {
        return construction;
    }

    public void setConstruction(String construction) {
        this.construction = construction;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
