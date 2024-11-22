package org.digi.factory.entites;

public class CommandantHumain extends Unite{

    TypeUnite type;

    public CommandantHumain(){
        super();
        type = TypeUnite.COMMANDANT;

    }

    /**
     * Renvoie la valeur de {@link #type}.
     *
     * @return la valeur actuelle de type.
     */
    public TypeUnite getType() {
        return type;
    }

    public void equiper(){
        System.out.println("je suis un commandant équipé d'un portevoix");
    }

    public String toString() {
        return "Je suis un commandant humain";
    }
}
