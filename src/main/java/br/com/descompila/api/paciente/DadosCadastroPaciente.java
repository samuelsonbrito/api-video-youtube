package br.com.descompila.api.paciente;

import br.com.descompila.api.endereco.DadosEndereco;

public record DadosCadastroPaciente(String nome, String email, String telefone, String cpf, DadosEndereco endereco) {
}
