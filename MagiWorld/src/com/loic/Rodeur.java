package com.loic;

class Rodeur extends Personnage {

    public Rodeur(String name, int niveau, int force, int agilite, int intelligence) {
        super(name, niveau, force, agilite, intelligence);
    }

    @Override
    public void attaqueBasique(Personnage j2) {
        System.out.println(getName() + " utilise Tir à l'Arc et inflige " + getAgilite() + " dommages.");
        System.out.println(j2.getName() + " perd " + getAgilite() + " points de vie.");
        j2.setVie(j2.getVie()-getAgilite());
        if(j2.getVie() <= 0){
            System.out.println(j2.getName() + " est mort");
        }
    }

    @Override
    public void attaqueSpeciale(Personnage j2) {
        System.out.println(getName() + " utilise Concentration et gagne " + (Math.round(getNiveau()/2)) + " d'agilité.");
        setAgilite(getAgilite()+(Math.round(getNiveau()/2)));
    }

}

