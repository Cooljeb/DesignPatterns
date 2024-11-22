package org.digi.adapter;

import java.math.BigInteger;

public class FinalManagerImpl extends FileManagerUtil implements FileManager{


    public FinalManagerImpl() {
        super();
    }

    @Override
    public String open(String files) {
        if (FileManagerUtil.openFile(files)) {
            return files;
        }else{
            return ("Erreur d'ouverture du fichier " + files).trim();
        }
    }

    @Override
    public String close() {
        if (FileManagerUtil.closeFile()){
            return ("Fichier fermé avec succès").trim();
        }else{
            return ("Erreur lors de fermeture du fichier").trim();
        }
    }

    @Override
    public String read(int i, int b, byte[] c) {
        long value = new BigInteger(c).longValue();
        if(FileManagerUtil.readFromFile(i,b)){
            return "Lecture réussie";
        }else{
            return ("Erreur lors de la lecture du fichier").trim();
        }
    }

    @Override
    public String write(int i, int b, byte[] c) {

        String retour = "";
        long value = new BigInteger(c).longValue();
        if(FileManagerUtil.writeToFile(Integer.toString(i),b,value)) {
            if (value != 0) {
                retour= "Ecriture réussie";
            }
        }else{
            retour= "Erreur lors de l'écriture dans le fichier";
        }
        return retour.trim();
    }
}
