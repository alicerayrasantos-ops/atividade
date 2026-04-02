package br.com.ucsal.olimpiadas.service;

import br.com.ucsal.olimpiadas.model.Prova;
import br.com.ucsal.olimpiadas.model.Questao;

import java.util.List;

public class QuestaoService {
    public Questao cadastrarQuestao(List<Prova> provas,
                                    Long provaId, String[] alternativas,
                                    Long proximaQuestaoId,
                                    String enunciado,
                                    Character correta,
                                    List<Questao> questoes){
        if (provas.isEmpty()) {
            System.out.println("não há provas cadastradas");
            return null;
        }
        if (provaId == null)
            return null;

        if (correta == null)
            return null;

        var q = new Questao();
        q.setId(proximaQuestaoId);
        q.setProvaId(provaId);
        q.setEnunciado(enunciado);
        q.setAlternativas(alternativas);
        q.setAlternativaCorreta(correta);

        questoes.add(q);
        return q;
    }
}
