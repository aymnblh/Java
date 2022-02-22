/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tc;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author pc
 */
public class Prfe implements Serializable {

    public Prfe() {
    }
  private int id;
  private String titre;
  private String description;

    public void setId(int id) {
        this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }
}
