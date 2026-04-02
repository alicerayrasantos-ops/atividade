package br.com.ucsal.olimpiadas.service;

import br.com.ucsal.olimpiadas.model.Participante;

import java.util.List;

public class ParticipanteService {

    public Participante CadastrarParticipante(String nome, String email, List<Participante> participantes, long proximoParticipanteId){
        if (nome == null || nome.isBlank()) {
            System.out.println("nome inválido");
            return null;
        }
        var p =  new Participante();
        p.setNome(nome);
        p.setEmail(email);
        p.setId(proximoParticipanteId);
        participantes.add(p);
        return p;
    }
}
