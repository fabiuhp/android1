package com.fabiopereira.agenda.dao;

import com.fabiopereira.agenda.ItemLista;

import java.util.ArrayList;
import java.util.List;

public class ItemDao {

    private final static List<ItemLista> itens = new ArrayList<>();

    public void salva(ItemLista item) {
        itens.add(item);
    }

    public List<ItemLista> todos() {
        return new ArrayList<>(itens);
    }
}
