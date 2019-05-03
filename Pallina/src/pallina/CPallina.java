/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pallina;

import static java.lang.Math.sin;

/**
 *
 * @author PRICOP
 */
public class CPallina {
    
    private int rag;
    private float x;
    private float y;
    //private DatiCondivisi dati;
    
    //contruttore
    public CPallina(int rag,float x,float y){
        this.rag= rag;
        this.x = x;
        this.y=y;
    }
    // metodo per aggiornare la posizion della pallina considerando l'inclinazione e la velocità di quest'ultima 
    public void aggiornaInformazioni(){
        //x=x+(float)(9.8*sin(dati.getInclinazioneXScatola())); 
    }
    
    //set e get
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public float getRag() {
        return rag;
    }
}

    

