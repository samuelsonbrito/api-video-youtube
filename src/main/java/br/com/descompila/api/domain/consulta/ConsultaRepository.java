package br.com.descompila.api.domain.consulta;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

    boolean existsByPacienteIdAndDataBetween(Long pacienteId, LocalDateTime dataInicial, LocalDateTime dataFinal);
    boolean existsByMedicoIdAndData(Long medicoId, LocalDateTime data);
    boolean existsByMedicoIdAndDataAndMotivoCancelamentoIsNull(Long idMedico, LocalDateTime data);
}
