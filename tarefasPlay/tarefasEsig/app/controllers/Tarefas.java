package controllers;

import play.*;
import play.mvc.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import models.*;

public class Tarefas extends Controller {

	// Create //

    // Por algum motivo estranho, a data não é passada corretamente, então eu
    // recebo ela em String, e no método setDeadline() é feita a conversão para Date
	public static void salvarTarefa(Tarefa tarefa, String deadline) {
		tarefa.setDeadline(deadline);
		tarefa.save();
		listarTarefas();
	}
	
    // Read //
    public static void index() {
        render();
    }
    
    public static void listarTarefas() {
		List<Tarefa> tarefas = Tarefa.findAll();
		render(tarefas);
    }
    
    public static void buscaGeral(Long id, String tituloOuDesc, String responsavel, Boolean status) {
            // Caso o ID seja fornecido, não é necessário checar os outros campos
    		if(id != null) {
    			Tarefa tarefas = Tarefa.findById(id);
    			renderTemplate("Tarefas/listarTarefas.html", tarefas);
    			return;
    		}
    		
			// Devido a natureza do "LIKE", se não for passado nada nos 'tituloOuDesc' ou 'responsavel'
    		// amobos os campos ficariam com '%%', o que retornaria "todos os elementos que tem qualquer coisa no título, 
    		// descrição ou responsável".
    		
    		if(!tituloOuDesc.equals(null) || !tituloOuDesc.isEmpty()) {
    			tituloOuDesc = "%"+tituloOuDesc+"%";
    		}
    		if(!responsavel.equals(null) || !responsavel.isEmpty()) {
    			responsavel = "%"+responsavel+"%";
    		}
    		List<Tarefa> tarefas = Tarefa.find("(titulo LIKE ?1 OR descricao LIKE ?1 OR responsavel = ?2) AND status = ?3", tituloOuDesc, responsavel, status).fetch();
    		renderTemplate("Tarefas/listarTarefas.html", tarefas);
    }

    // Update //

    public static void editarTarefa(Long id) { 
    	Tarefa tarefa = Tarefa.findById(id);
    	renderTemplate("Tarefas/index.html", tarefa);
    }

    public static void concluirTarefa(Long id) { 
    	Tarefa tarefa = Tarefa.findById(id);
    	tarefa.setStatus(true);
    	tarefa.save();
    	listarTarefas();
    }

    // Delete //
    public static void excluirTarefa(Long id) { 
    	Tarefa tarefa = Tarefa.findById(id);
    	tarefa.delete();
    	listarTarefas();
    }
}
