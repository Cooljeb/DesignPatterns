package org.digi.adapter;

public interface FileManager {

    String open(String files);
    String close();
    String read(int i, int b, byte[] c);
    String write(int i, int b, byte[] c);
}
