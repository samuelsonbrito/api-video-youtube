package br.com.descompila.api.domain.consulta.validacoes;

import br.com.descompila.api.domain.ValidacaoException;
import br.com.descompila.api.domain.consulta.DadosAgendamentoConsulta;

import java.time.Duration;
import java.time.LocalDateTime;

public class ValidadorHorarioAntecedencia {

    public void validar(DadosAgendamentoConsulta dados){
        var dataConsulta = dados.data();
        var agora = LocalDateTime.now();
        var diferencaEntreMinutos = Duration.between(agora, dataConsulta).toMinutes();
        if(diferencaEntreMinutos < 30){
            throw new ValidacaoException("Consulta deve ser agendada com antecendência mínima de 30 minutos");
        }
    }
}
