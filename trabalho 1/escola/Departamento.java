package escola;

import java.util.ArrayList;

public class Departamento {
	private String nomeDpto;
	private String localDpto;
	private int quantidadeProf;
	private Date dataCriacaoDpto;
	private ArrayList<Professor> professores = new ArrayList<Professor>();
	private Professor coordenador;
	
	
	public Departamento(String nomeDpto, String localDpto, int quantidadeProf, Professor coordenador) {
		super();
		this.nomeDpto = nomeDpto;
		this.localDpto = localDpto;
		this.quantidadeProf = quantidadeProf;
		this.dataCriacaoDpto = new Date("13","10","2021");
		this.coordenador = coordenador;
		this.coordenador.setDept(this);
	}

	public String getNomeDpto() {
		return nomeDpto;
	}

	public void setNomeDpto(String nomeDpto) {
		this.nomeDpto = nomeDpto;
	}

	public String getLocalDpto() {
		return localDpto;
	}

	public void setLocalDpto(String localDpto) {
		this.localDpto = localDpto;
	}

	public int getQuantidadeProf() {
		return quantidadeProf;
	}

	public void setQuantidadeProf(int quantidadeProf) {
		this.quantidadeProf = quantidadeProf;
	}

	public Date getDataCriacaoDpto() {
		return this.dataCriacaoDpto;
	}

	public void setDataCriacaoDpto(String dia, String mes, String ano) {
		this.dataCriacaoDpto.setDia(dia);
		this.dataCriacaoDpto.setMes(mes);
		this.dataCriacaoDpto.setAno(ano);
	}
	
	public void addProfessor(Professor prof) {
		this.professores.add(prof);
	}
	
}
