package br.com.descompila.api.domain.consulta.validacoes.cancelamento;

import br.com.descompila.api.domain.consulta.DadosCancelamentoConsulta;

public interface ValidadorCancelamentoDeConsulta {

    void validar(DadosCancelamentoConsulta dados);
}
