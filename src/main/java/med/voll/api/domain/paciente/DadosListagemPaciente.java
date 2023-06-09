package med.voll.api.domain.paciente;

import med.voll.api.domain.medico.Especialidade;

public record DadosListagemPaciente(Long id, String nome, String email) {
	public DadosListagemPaciente(Paciente paciente){
		this(paciente.getId(), paciente.getNome(), paciente.getEmail());
	}
}
