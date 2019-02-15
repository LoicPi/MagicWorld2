package com.loic;

class Magicien extends Personnage {

    public Magicien(String name, int niveau, int force, int agilite, int intelligence) {
        super(name, niveau, force, agilite, intelligence);
    }

    @Override
    public void attaqueBasique(Personnage j2) {
        System.out.println(getName() + " utilise Boule de Feu et inflige " + getIntelligence() + " dommages.");
        System.out.println(j2.getName() + " perd " + getIntelligence() + " points de vie.");
        j2.setVie(j2.getVie()-getIntelligence());
        if(j2.getVie() <= 0){
            System.out.println(j2.getName() + " est mort");
        }
    }

    @Override
    public void attaqueSpeciale(Personnage j2) {
        System.out.println(getName() + " utilise Soin et gagne " + (getIntelligence()*2) + " de vitalité.");
        setVie(getVie()+(getIntelligence()*2));
    }
}
