# Projeto ESIG - Gerenciador de Tarefas
![JDK Version](https://img.shields.io/badge/JDK->=1.7-blue)
![Play! Version](https://img.shields.io/badge/Play!%20Framework-1.6.0-blue)
![JSF Version](https://img.shields.io/badge/JSF-2.0-blue)

## Introdução
O projeto consiste em um aplicativo web para gerenciar tarefas e afazeres. Uma tarefa consiste em:

 - Número (Único, para identificar a tarefa)
 - Título
 - Descrição
 - Responsável
 - Prioridade
 - Data Limite
 - Andamento(Em andamento/Concluída)

O aplicativo deve ser capaz de criar tarefas, assim como também deve ser possível listá-las. Na parte da listagem, deverá ser possível buscar tarefas pelo seu **número**, **conteúdo no titulo ou na descrição**, **responsável** e pelo seu **andamento**(Tarefas Concluídas/Tarefas em Andamento), Também, na mesma parte da listagem, deverá ser possível **marcar como concluída**, **editar** ou **excluir** uma tarefa.

## Desenvolvimento

*Tentei* fazer o projeto utilizando as tecnologias propostas (`JSF`, seguindo [este tutorial fornecido pelo IMD](https://materialpublic.imd.ufrn.br/curso/disciplina/3/54) e `Posgresql`), porém ~~depois de apanhar bastante~~ após algumas tentativas, acabei ~~desistindo~~ decidindo fazer um segundo projeto, utilizando o ``Play! Framework 1.6.0``, que se aproxima do que eu realmente queria fazer.

Neste repositório há dois projetos, o `Tarefas` e o `tarefasPlay`, feitos respectivamente com ``JSF`` e `Play! Framework`, além de uma framework CSS chamada [`mini.css`](https://minicss.org).

#### Projeto `Tarefas`:

 - [X] Criar Tarefa
 - [ ] Listar Tarefa(s)
 - [ ] Modificar Tarefas
 - [ ] Apagar Tarefa
 - [ ] Marcar Tarefa como concluída
 - [ ] Persistir Tarefas em um Banco de Dados (Postgresql)

#### Projeto `tarefasPlay`:

 - [x] Criar Tarefa
 - [x] Listar Tarefa(s)
 - [x] Modificar Tarefas
 - [x] Apagar Tarefa
 - [x] Marcar Tarefa como concluída
 - [x] Persistir Tarefas em um Banco de Dados (Postgresql)

## Pré-requisitos

#### Para ambos:
- JDK 1.7/Java 7 ou superior;

#### Projeto ``Tarefas``:
 - Eclipse IDE 4.7.2 (Oxygen);
 - Apache Tomcat 7 ou superior.

#### Projeto ``tarefasPlay``:
- Postgresql, com um usuário chamado *"esig"* e um banco de dados chamado *"tarefasDB"*;
- Python 2.

## Iniciando os projetos
### Projeto ``Tarefas`` :

 1. Abra o Eclipse
 2. Adicione o projeto ao Workspace clicando em `File` > `Import...` > `Projects From Folder or Archive` > `Directory...` , encontre a pasta  `Tarefas`, `Finish`.
 3.  Procure a aba `Servers` na região inferior do Eclipse, ou indo no menu `Window`>`Show View` > `Servers`.
 4. Caso você não tenha nenhum servidor Apache Tomcat 7 ou superior já configurado, Clique em *"No servers are avaliable. Click this link to create a new server..."*, mas caso você já tenha outros, clique com o botão direito do mouse em algum espaço vazio da aba Servers e clique em `New` > `Server`.
 5. Procure por `Apache Tomcat 7.0` e clique em `Next`.
 6. Caso você tenha baixado o `Tomcat` anteriormente, especifique a pasta na qual você extraiu apertando no botão `Browse...`, ou você pode apenas clicar em `Download and Install...`, e o `Eclipse` irá baixá-lo automaticamente. 
 7. Clique no `Tarefas` e em `Add >` caso ele esteja do lado esquerdo da janela.
 8. Clique em `Finish`.
 9. Na aba esquerda, em Project Explorer (Caso não esteja a vendo, `Window`> `Show View`>`Project Explorer`) clique com o botão direito em cima da pasta do projeto `Tarefas`, `Run As`>`Run on Server`.
 10. Clique em `Next` na janela de seleção de servidores e em `Finish`.
 
 Pronto, o projeto rodará no endereço [http://localhost:8080/Tarefas/](http://localhost:8080/Tarefas/) .

### Projeto ``tarefasPlay`` :

#### Windows:
 1. Abra o prompt de comando e navegue até a pasta na qual o projeto foi extraído(Exemplo: `cd C:\Users\(seu nome de usuário)\Downloads\projetoesig-master\tarefasPlay\`).
 2. Digite `play.bat run tarefasEsig`

Pronto, o projeto rodará no endereço [http://localhost:9000/](http://localhost:9000/) .

#### Linux:
1. Abra um terminal e navegue até a pasta na qual o projeto foi extraído(Exemplo: `cd ~/Downloads/projetoesig-master/tarefasPlay`).
2. Digite `python2 play run tarefasEsig`

Pronto, o projeto rodará no endereço [http://localhost:9000/](http://localhost:9000/) .
