package com.fabiopereira.agenda;

public class ItemLista {
    private final String nome;
    private final String telefone;
    private final String email;

    public ItemLista(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public String toString() {
        return nome;
    }
}

