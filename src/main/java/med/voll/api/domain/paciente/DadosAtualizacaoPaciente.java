package med.voll.api.domain.paciente;

import jakarta.validation.constraints.NotBlank;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
		@NotBlank
		Long id,
		String nome,
		String telefone,
		DadosEndereco endereco
) {
}
