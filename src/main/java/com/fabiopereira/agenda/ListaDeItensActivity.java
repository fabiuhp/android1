package com.fabiopereira.agenda;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.fabiopereira.agenda.dao.ItemDao;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ListaDeItensActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_itens);

        setTitle("Lista da Nilva");

        FloatingActionButton botaoNovoAluno = findViewById(R.id.activity_main_fab_novo_item);
        botaoNovoAluno.setOnClickListener(view -> startActivity(new Intent(ListaDeItensActivity.this, FormularioListaActivity.class)));
    }

    @Override
    protected void onResume() {
        super.onResume();
        ItemDao itemDao = new ItemDao();

        ListView viewItens = findViewById(R.id.activity_main_listaAlunos);
        viewItens.setAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                itemDao.todos()));
    }
}

