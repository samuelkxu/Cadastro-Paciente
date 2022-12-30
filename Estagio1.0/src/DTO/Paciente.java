package DTO;

/**
 *
 * @author samue
 */
public class Paciente {
    
    private String nomeEspecialidade, nomePaciente, nomePlano;
    private int IdEspecialidade, IdPaciente, nmrCarteira, IdPlano;

    public String getNomeEspecialidade() {
        return nomeEspecialidade;
    }

    public void setNomeEspecialidade(String nomeEspecialidade) {
        this.nomeEspecialidade = nomeEspecialidade;
    }


    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public int getIdEspecialidade() {
        return IdEspecialidade;
    }

    public void setIdEspecialidade(int IdEspecialidade) {
        this.IdEspecialidade = IdEspecialidade;
    }

    public int getIdPaciente() {
        return IdPaciente;
    }


    public void setIdPaciente(int IdPaciente) {
        this.IdPaciente = IdPaciente;
    }

    public int getNmrCarteira() {
        return nmrCarteira;
    }

    public void setNmrCarteira(int nmrCarteira) {
        this.nmrCarteira = nmrCarteira;
    }

    public int getIdPlano() {
        return IdPlano;
    }

    public void setIdPlano(int IdPlano) {
        this.IdPlano = IdPlano;
    }
    
}
