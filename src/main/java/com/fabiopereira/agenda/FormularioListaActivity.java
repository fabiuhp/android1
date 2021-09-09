package com.fabiopereira.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.fabiopereira.agenda.dao.ItemDao;

public class FormularioListaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_lista);

        ItemDao itemDao = new ItemDao();

        final EditText campoNome = findViewById(R.id.activity_formulario_lista_nome);
        final EditText campoTelefone = findViewById(R.id.activity_formulario_lista_telefone);
        final EditText campoEmail = findViewById(R.id.activity_formulario_lista_email);
        Button botaoSalvar = findViewById(R.id.activity_formulario_salvar);

        botaoSalvar.setOnClickListener(view -> {
            String nome = campoNome.getText().toString();
            String telefone = campoTelefone.getText().toString();
            String email = campoEmail.getText().toString();

            ItemLista itemCriado = new ItemLista(nome, telefone, email);
            itemDao.salva(itemCriado);

            finish();
        });
    }
}