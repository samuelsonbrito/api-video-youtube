package br.com.descompila.api.domain.medico;

public record DadosDetalhamentoMedico(
        Long id,
        String nome,
        String telefone
) {

    public DadosDetalhamentoMedico (Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getTelefone());
    }
}
