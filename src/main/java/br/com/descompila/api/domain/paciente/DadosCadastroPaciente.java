package br.com.descompila.api.domain.paciente;

import br.com.descompila.api.domain.endereco.DadosEndereco;

public record DadosCadastroPaciente(String nome, String email, String telefone, String cpf, DadosEndereco endereco) {
}
