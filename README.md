📌 Front-End - Gerenciamento de Cursos
📖 Sobre o projeto
Este projeto é a interface front-end para o desafio de gerenciamento de cursos de programação. Ele foi desenvolvido utilizando Thymeleaf para renderização dinâmica, Tailwind CSS para estilização e Spring Security para autenticação e controle de acesso.

A aplicação consome a API criada no desafio anterior e permite a gestão completa dos cursos, incluindo cadastro, listagem, edição e exclusão.

🛠 Tecnologias utilizadas
Java 17
Spring Boot 3
Thymeleaf
Tailwind CSS
Spring Security
Maven
📂 Estrutura do projeto
arduino
Copiar
Editar
📦 front-cursos-programacao  
├── 📂 src  
│   ├── 📂 main  
│   │   ├── 📂 java/br/com/julia/front_cursos_programacao  
│   │   │   ├── 📂 cursos  
│   │   │   │   ├── 📂 controller → Lida com as requisições HTTP  
│   │   │   │   │   ├── ProgrammingCoursesController.java  
│   │   │   │   ├── 📂 dto → Objetos de transferência de dados  
│   │   │   │   │   ├── CreateNewCourseDTO.java  
│   │   │   │   ├── 📂 service → Lógica de negócio  
│   │   │   │   │   ├── CreateCourseService.java  
│   │   │   │   │   ├── ListAllCoursesService.java  
│   │   │   ├── FrontCursosProgramacaoApplication.java → Classe principal  
│   │   │   ├── WebConfig.java → Configuração do Spring Security  
│   │   ├── 📂 resources  
│   │   │   ├── 📂 static → Arquivos estáticos (CSS, JS, imagens)  
│   │   │   ├── 📂 templates/courses → Templates Thymeleaf  
│   │   │   │   ├── criarCurso.html → Página para criação de curso  
│   │   │   │   ├── detalhesCurso.html → Página de detalhes do curso  
│   │   │   │   ├── lista.html → Página de listagem de cursos  
│   │   │   ├── application.properties → Configuração da aplicação  
├── pom.xml → Dependências do Maven  
🚀 Funcionalidades
Cadastro de cursos 📝
Criar um novo curso informando nome, categoria e professor.
Listagem de cursos 📋
Exibir todos os cursos cadastrados na API.
Permitir a busca de cursos por nome e categoria.
Detalhes e edição de curso 🔍
Exibir os detalhes do curso.
Permitir a edição do nome, categoria e professor.
Possibilitar a exclusão de um curso.
Segurança com Spring Security 🔐
Autenticação e controle de acesso.
Consumo da API 🌍
Comunicação com o back-end para manipulação dos dados.
📌 Como rodar o projeto
1️⃣ Clone o repositório:

bash
Copiar
Editar
git clone https://github.com/seu-usuario/front-cursos-programacao.git
2️⃣ Acesse o diretório do projeto:

bash
Copiar
Editar
cd front-cursos-programacao
3️⃣ Configure o banco de dados no application.properties

4️⃣ Execute o projeto:

bash
Copiar
Editar
./mvnw spring-boot:run
5️⃣ Acesse a aplicação no navegador:

arduino
Copiar
Editar
http://localhost:8080
🎨 Layout da aplicação
O layout base foi inspirado no design disponível no Figma:
🔗 Edição de cursos | Figma

📌 Considerações finais
Este projeto faz parte de um desafio para desenvolver um sistema completo de gerenciamento de cursos, integrando front-end e back-end. 🚀
