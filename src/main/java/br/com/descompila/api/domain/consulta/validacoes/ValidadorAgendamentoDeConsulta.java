package br.com.descompila.api.domain.consulta.validacoes;

import br.com.descompila.api.domain.consulta.DadosAgendamentoConsulta;

public interface ValidadorAgendamentoDeConsulta {
    void validar(DadosAgendamentoConsulta dados);
}
