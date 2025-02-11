---
Gerenciador de Tarefas

Este projeto é um Gerenciador de Tarefas desenvolvido com JavaServer Faces (JSF), Hibernate (JPA) e MySQL. Ele permite criar, listar e gerenciar tarefas de forma simples.

📌 Funcionalidades

✅ Criar uma nova tarefa
✅ Listar tarefas cadastradas
✅ Editar e excluir tarefas
✅ Persistência de dados com MySQL e Hibernate

🛠️ Tecnologias Utilizadas

Java 17

Jakarta EE 9.1

JSF (PrimeFaces 12.0.0)

Hibernate (JPA - ORM)

MySQL 8.0.33

Maven

Servidor Jetty (para testes)

🚀 Como Executar o Projeto

1️⃣ Configurar o Banco de Dados

1. Certifique-se de ter o MySQL instalado e rodando.

2. Crie o banco de dados com o seguinte comando:

CREATE DATABASE 20221164010005_sistema_tarefas;

3. Atualize as credenciais do banco no arquivo src/main/resources/META-INF/persistence.xml, caso necessário:

<property name="jakarta.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/20221164010005_sistema_tarefas?useTimezone=true serverTimezone=UTC"/>
<property name="jakarta.persistence.jdbc.user" value="SEU_USUARIO"/>
<property name="jakarta.persistence.jdbc.password" value="SUA_SENHA"/>



2️⃣ Compilar e Rodar

1. Certifique-se de ter o Maven instalado e execute os comandos abaixo:

mvn clean install
mvn jetty:run

Se preferir rodar no Tomcat, gere o arquivo .war e coloque na pasta webapps do Tomcat.



3️⃣ Acessar a Aplicação

Após iniciar o servidor, abra um navegador e acesse:

http://localhost:8080/gerenciador_tarefas/

📂 Estrutura do Projeto

├── src/main/java/sistemaTarefas
│   ├── Tarefa.java            # Classe de entidade JPA
│   ├── TarefaDAO.java         # Classe de acesso ao banco de dados
│   └── TarefaBean.java        # Managed Bean para JSF
│
├── src/main/resources/META-INF
│   └── persistence.xml        # Configuração da persistência JPA
│
├── src/main/webapp
│   ├── index.xhtml            # Página principal
│   ├── WEB-INF/web.xml        # Configuração do servidor web
│
├── pom.xml                    # Configuração do Maven

🛠️ Possíveis Problemas e Soluções

🔴 A aplicação não inicia

✅ Possível causa: Banco de dados não configurado corretamente.
✔ Solução: Verifique se o MySQL está rodando e se as credenciais no persistence.xml estão corretas.

🔴 Erro ao acessar a página

✅ Possível causa: O web.xml pode estar mal configurado.
✔ Solução: Certifique-se de que o arquivo contém a configuração correta do FacesServlet:

<servlet>
    <servlet-name>FacesServlet</servlet-name>
    <servlet-class>jakarta.faces.webapp.FacesServlet</servlet-class>
    <load-on-startup>1</load-on-startup>
</servlet>

<servlet-mapping>
    <servlet-name>FacesServlet</servlet-name>
    <url-pattern>*.xhtml</url-pattern>
</servlet-mapping>

🔴 Problema com dependências do Maven

✅ Possível causa: Dependências não foram resolvidas corretamente.
✔ Solução: Rode o seguinte comando para limpar e baixar novamente as dependências:

mvn clean install -U

📌 Melhorias Futuras

🔹 Criar um CRUD completo com mais funcionalidades
🔹 Implementar autenticação de usuários
🔹 Melhorar a interface com PrimeFaces
🔹 Migrar para um servidor de aplicação mais robusto como WildFly
---
