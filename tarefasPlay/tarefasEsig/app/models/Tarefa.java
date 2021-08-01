package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import play.db.jpa.Model;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Tarefa extends Model{
	private String titulo;
	private String descricao;
	private int prioridade;
	private String responsavel;

	@Temporal(TemporalType.TIMESTAMP)
	private Date deadline;
	private boolean status;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public Date getDeadline() {
		return deadline;
	}

    // Setter modificado para converter String de data para Date
	public void setDeadline(String deadline) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.deadline = sdf.parse(deadline);
		} catch (ParseException e) {
            Date datanull = new Date();
            this.deadline = datanull;
		}
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
