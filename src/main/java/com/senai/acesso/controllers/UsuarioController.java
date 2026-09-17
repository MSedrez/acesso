package com.senai.acesso.controllers;

import com.senai.acesso.dtos.UsuarioDto;
import com.senai.acesso.dtos.UsuarioRespostaDto;
import com.senai.acesso.services.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioController {

    //-- A injeção de dependencia sempre ocorre a nível de classe e nunca a nível de método.
    //--Declaro a classe UsuarioService com o objeto service para instanciar no contrutor do controller
    private final UsuarioService service;

    //--No construtur do controller instancio um novo objeto do tipo UsuarioService
    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    //-- método que será executado quando POST em http://localhost:8080/api/usuario
    // --> body (json com os dados do usuário)
    @PostMapping("/usuario")
    public ResponseEntity<String> criarUsuario(@RequestBody UsuarioDto usuario){

        //-- chamar método para cadastrar usuário lá do service
        boolean retorno = service.cadastrar(usuario);

        //-- realizar o retorno de cadastro com sucesso ou erro ao cadastrar.
        if (retorno) {
            return ResponseEntity.ok().body("sucesso");
        } else {
            return ResponseEntity.badRequest().body("erro ao inserir usário");
        }

    }


    @GetMapping("/usuarios")
    public ResponseEntity<List<UsuarioRespostaDto>> listarUsuarios(){

        List<UsuarioRespostaDto> lista = service.listarUsuarios();
        return ResponseEntity.ok().body(lista);

    }





}
