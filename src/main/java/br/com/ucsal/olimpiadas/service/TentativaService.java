package br.com.ucsal.olimpiadas.service;

import br.com.ucsal.olimpiadas.model.Tentativa;

public class TentativaService {
    public Tentativa criarTentativa(long proximaTentativaId, long participanteId, Long provaId) {
        var tentativa = new Tentativa();
        tentativa.setId(proximaTentativaId);
        tentativa.setParticipanteId(participanteId);
        tentativa.setProvaId(provaId);
        return tentativa;
    }
}
