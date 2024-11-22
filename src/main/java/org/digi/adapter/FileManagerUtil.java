package org.digi.adapter;

import java.io.RandomAccessFile;

public class FileManagerUtil {

    private RandomAccessFile f;

    protected FileManagerUtil() {

    }

    /**
     * Renvoie la valeur de {@link #f}.
     *
     * @return la valeur actuelle de f.
     */
    public RandomAccessFile getF() {
        return f;
    }

    public static boolean openFile(String f) {

            if (FileManagerUtil.openFile(f)){
                return true;
            } else {
                return false;
            }
    }

    public static boolean closeFile() {
        return FileManagerUtil.closeFile();
    }

    public static boolean writeToFile(String f,long l, long l2){
        if (FileManagerUtil.writeToFile(f, l, l2)){
            return true;
        }else{
            return false;
        }
    }

    public static boolean readFromFile(long l, long l2){

        return FileManagerUtil.readFromFile(l, l2);
    }
}
