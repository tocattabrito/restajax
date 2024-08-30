package com.example.springajax.service;

import com.example.springajax.dto.Soldado;
import org.springframework.stereotype.Service;

@Service
public class SoldadoService {

    public static void criarSoldado(Soldado soldado) {
    }

    public Soldado buscarSoldado(String cpf) {
        Soldado soldado = new Soldado();
        soldado.setCpf(cpf);
        soldado.setNome("Legolas");
        soldado.setRaca("Elfo");
        soldado.setArma("Arco e Flexa");
        return soldado;
    }


}
