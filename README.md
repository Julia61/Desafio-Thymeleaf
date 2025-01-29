## 📌 Front-End - Gerenciamento de Cursos
### 📖 Sobre o projeto
Este projeto é a interface front-end para o desafio de gerenciamento de cursos de programação. Ele foi desenvolvido utilizando Thymeleaf para renderização dinâmica, Tailwind CSS para estilização e Spring Security para autenticação e controle de acesso.

A aplicação consome a API criada no desafio anterior e permite a gestão completa dos cursos, incluindo cadastro, listagem, edição e exclusão.

## 🛠 Tecnologias utilizadas
- Java 17
- Spring Boot 3
- Thymeleaf
- Tailwind CSS
- Maven
📂 Estrutura do projeto

```plaintext
📦 front-cursos-programacao  
├── 📂 src  
│   ├── 📂 main  
│   │   ├── 📂 java/br/com/julia/front_cursos_programacao  
│   │   │   ├── 📂 cursos  
│   │   │   │   ├── 📂 controller
│   │   │   │   │   ├── ProgrammingCoursesController.java  
│   │   │   │   ├── 📂 dto 
│   │   │   │   │   ├── CreateNewCourseDTO.java  
│   │   │   │   ├── 📂 service
│   │   │   │   │   ├── CreateCourseService.java  
│   │   │   │   │   ├── ListAllCoursesService.java  
│   │   │   ├── FrontCursosProgramacaoApplication.java 
│   │   │   ├── WebConfig.java 
│   │   ├── 📂 resources  
│   │   │   ├── 📂 static 
│   │   │   ├── 📂 templates/courses 
│   │   │   │   ├── criarCurso.html
│   │   │   │   ├── detalhesCurso.html
│   │   │   │   ├── lista.html
│   │   │   ├── application.properties 
├── pom.xml

```
## 🚀 Funcionalidades
- Cadastro de cursos 📝
- Criar um novo curso informando nome, categoria e professor.
- Listagem de cursos 📋
- Exibir todos os cursos cadastrados na API.
- Permitir a busca de cursos por nome e categoria.
- Detalhes e edição de curso 🔍
- Exibir os detalhes do curso.
- Permitir a edição do nome, categoria e professor.
- Possibilitar a exclusão de um curso.
- Consumo da API 🌍
- Comunicação com o back-end para manipulação dos dados.
## 📌 Como rodar o projeto
1. **Clone o repositório:**
 ```bash
   git clone https://github.com/seu-usuario/front-cursos-programacao.git
   ```

2. **Navegue até a pasta do projeto:**
   ```bash
   cd front-cursos-programacao
   ```

3. **Configure o banco de dados no application.properties:**
   ```bash
   server.port=8082
   ```

4. **Execute o projeto com Maven:**
   ```bash
   mvn spring-boot:run
   ```

5. **Acesse a aplicação:**
   - **Back-end:** [http://localhost:8080](http://localhost:8080)
   - **Front-end:** [http://localhost:8082](http://localhost:8082) (ajuste conforme o ambiente local)

arduino
Copiar
Editar
http://localhost:8080
🎨 Layout da aplicação
O layout base foi inspirado no design disponível no Figma:
🔗 Edição de cursos | Figma

📌 Considerações finais
Este projeto faz parte de um desafio para desenvolver um sistema completo de gerenciamento de cursos, integrando front-end e back-end. 🚀
