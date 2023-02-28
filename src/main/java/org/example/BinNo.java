package org.example;

public class BinNo<T extends Comparable<T>> {

    private T conteudo;
    private BinNo<T> noEsq;
    private BinNo<T> noDir;

    public BinNo(T conteudo){
        this.conteudo = conteudo;
        this.noEsq = this.noDir = null;
    }
}
