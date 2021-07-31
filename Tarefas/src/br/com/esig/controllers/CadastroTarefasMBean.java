package br.com.esig.controllers;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.sql.*;
import java.util.List;

import br.com.esig.models.Tarefa;

@ManagedBean
@SessionScoped 
public class CadastroTarefasMBean {
 
	List<Tarefa> tarefas;
	Tarefa tarefa;

	public CadastroTarefasMBean() {
		tarefa = new Tarefa();
	}
	
	
	public List<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}

	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
		this.tarefas.add(tarefa);
	}
	

	public String cadastrar() { 
		this.tarefas.add(tarefa);
		return "/listarTarefas.jsf"; 
	} 

}
