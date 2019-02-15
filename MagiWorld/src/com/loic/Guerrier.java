package com.loic;

class Guerrier extends Personnage {

    public Guerrier(String name, int niveau, int force, int agilite, int intelligence) {
        super(name, niveau, force, agilite, intelligence);
    }


    @Override
    public void attaqueBasique(Personnage j2) {
        System.out.println(getName() + " utilise coup d'Epée et inflige " + getForce() + " dommages.");
        System.out.println(j2.getName() + " perd " + getForce() + " points de vie.");
        j2.setVie(j2.getVie()-getForce());
        if(j2.getVie() <= 0){
            System.out.println(j2.getName() + " est mort");
        }
    }

    @Override
    public void attaqueSpeciale(Personnage j2) {
        System.out.println(getName() + " utilise Coup de Rage et inflige " + (getForce()*2) + " dommages.");
        System.out.println(j2.getName() + " perd " + (getForce()*2) + " points de vie.");
        j2.setVie(j2.getVie()-(getForce()*2));
        if(j2.getVie() <= 0){
            System.out.println(j2.getName() + " est mort");
        }
        System.out.println(getName() + " perd " + (Math.round(getForce()/2)) + " dommages.");
        setVie(getVie()-(Math.round(getForce()/2)));
        if(getVie() <= 0){
            System.out.println(getName() + " est mort");
        }
    }
}

