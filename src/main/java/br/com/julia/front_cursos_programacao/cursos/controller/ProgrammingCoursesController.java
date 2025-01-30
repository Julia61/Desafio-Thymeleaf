package br.com.julia.front_cursos_programacao.cursos.controller;

import br.com.julia.front_cursos_programacao.cursos.dto.CreateNewCourseDTO;
import br.com.julia.front_cursos_programacao.cursos.service.CreateCourseService;
import br.com.julia.front_cursos_programacao.cursos.service.ListAllCoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;


import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/programacao")
public class  ProgrammingCoursesController {

    @Autowired
    private CreateCourseService createCourseService;

    @Autowired
    private ListAllCoursesService listAllCoursesService;

    @GetMapping("/cursos")
    public String novo(Model model){
        model.addAttribute("curso",new CreateNewCourseDTO());
        return "courses/criarCurso";
    }

    @PostMapping("/cursos")
    public String save(CreateNewCourseDTO curso, Model model){

        try {
            // Criação do curso
            this.createCourseService.execute(curso);
        } catch (HttpClientErrorException ex){
            model.addAttribute("error", "Erro ao salvar o curso. Tente novamente.");
            return "courses/criarCurso"; // Caso haja erro, retorne para a página de criação.
        }

        // Redireciona para a página de listas com os cursos atualizados
        return "redirect:/programacao/listas";
    }

    @GetMapping("/listas")
    public String listAllCourses(Model model){
        List<CreateNewCourseDTO> courses = listAllCoursesService.execute();

        model.addAttribute("courses", courses);

        return "courses/lista";
    }

    @GetMapping("/detalhe")
    public String login(){
        return "courses/detalhesCurso";
    }

    @GetMapping("/cursos/{id}")
    public String courseDetails(@PathVariable UUID id, Model model) {
        // Chama o serviço para pegar os detalhes do curso com o ID
        CreateNewCourseDTO course = listAllCoursesService.getCourseDetailsById(id);
        model.addAttribute("course", course);
        return "courses/detalhesCurso"; // Exibe a página de detalhes
    }

    @PutMapping("/{id}")
    public String atualizarCurso(@PathVariable UUID id, @ModelAttribute  CreateNewCourseDTO createNewCourseDTO,Model model){
        CreateNewCourseDTO cursoAtualiza = listAllCoursesService.atualizaCurso(id,createNewCourseDTO);

        model.addAttribute("cursoAtualiza", cursoAtualiza);
        return "redirect:/programacao/listas";

    }

    @DeleteMapping("/deletando/{id}")
    public String deletaCurso(@PathVariable UUID id){
        listAllCoursesService.deletaCurso(id);
        return "redirect:/programacao/listas";
    }





}
