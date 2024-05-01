package br.com.descompila.api.paciente;

public record DadosListagemPaciente(
        String nome,
        String email,
        String cpf,
        String telefone
) {
    public DadosListagemPaciente(Paciente paciente) {
        this(paciente.getNome(), paciente.getCpf(), paciente.getCpf(), paciente.getTelefone());
    }
}
