package br.com.ucsal.olimpiadas.service;

import br.com.ucsal.olimpiadas.model.Prova;

import java.util.List;

public class ProvaService {
    public Prova cadastrarPergunta(String titulo, List<Prova> provas, long proximaProvaId){
        if (titulo == null || titulo.isBlank()) {
            System.out.println("título inválido");
            return null;
        }

        var prova = new Prova();
        prova.setId(proximaProvaId);
        prova.setTitulo(titulo);
        provas.add(prova);
        return prova;
    }
}
