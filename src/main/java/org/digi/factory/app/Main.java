package org.digi.factory.app;

import org.digi.factory.SimpleFabrique;
import org.digi.factory.entites.SoldatHumain;
import org.digi.factory.entites.TypeUnite;

public class Main {
    public static void main(String[] args) {

        SoldatHumain soldatHumain = SimpleFabrique.creerUnite(TypeUnite.SOLDAT);
    }
}