package org.digi.factory;

import org.digi.factory.entites.CommandantHumain;
import org.digi.factory.entites.SoldatHumain;
import org.digi.factory.entites.TypeUnite;
import org.digi.factory.entites.Unite;

public class SimpleFabrique {



    public SimpleFabrique() {

    }

    public static Unite creerUnite(TypeUnite t) {

        Unite unite = null;

        switch (t) {
            case SOLDAT:
                unite = new SoldatHumain();
                break;
            case COMMANDANT:
                unite = new CommandantHumain();
                break;
            default:
                throw new IllegalArgumentException("Type d'unité inconnu");
        }
        return unite;
    }
}
