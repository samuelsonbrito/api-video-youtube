package br.com.descompila.api.domain.consulta.validacoes;

import br.com.descompila.api.domain.consulta.ConsultaRepository;
import br.com.descompila.api.domain.consulta.DadosAgendamentoConsulta;

public class ValidadorMedicoComOutraConsultaNoMesmoHorario {

    private ConsultaRepository repository;

    public void validar(DadosAgendamentoConsulta dados){
        var medicoPossuiOutraConsultaMesmoHorario = repository.existsByMedicoIdAndData(dados.idMedico(), dados.data());
    }
}
