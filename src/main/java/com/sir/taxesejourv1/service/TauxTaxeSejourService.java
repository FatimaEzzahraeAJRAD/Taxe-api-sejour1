/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.service;

import com.sir.taxesejourv1.bean.TauxTaxeSejour;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jawadoo
 */

public interface TauxTaxeSejourService {
   // public TauxTaxeSejour findByRefCategorie(String refCategorie);
    public int saveTauxTaxeSejour(TauxTaxeSejour tauxTaxeSejour);
     public TauxTaxeSejour findByRefCategorie(String refCategorie);
        public List<TauxTaxeSejour> findByCriteria(String dateDebut,String dateFin);
     public List<TauxTaxeSejour> findAll();
         public void deleteByRefCategorie(String refCategorie);
}
