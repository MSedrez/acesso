package com.senai.acesso.services;

import com.senai.acesso.dtos.UsuarioDto;
import com.senai.acesso.models.UsuarioEntity;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    //--Metodo para cadastrar o usuário que recebe os dados do usuário no DTO!!!
    public boolean cadastrar(UsuarioDto usuario){

        //--Converter os dados do DTO para o ENTITY
        UsuarioEntity usuarioEntity = new UsuarioEntity();
        usuarioEntity.setCpf(usuario.getCpf());
        usuarioEntity.setNome(usuarioEntity.getNome());
        usuarioEntity.setLogin(usuario.getLogin());
        usuarioEntity.setSenha(usuario.getSenha());

        //--Preciso verificar se o usuário já foi cadastrado

        //--Se o usuário já esta cadastrado eu retorno false

        //-Valida dados preenchidos ( campos obrigatórios )

        // -- se não tiver algum dado preenchido obrigatório retorna false

        //---Se não foi cadastrado preciso então cadatrar o usuário

        //--Se deu certo cadatrar o usuário eu retrorno verdadeiro (true)
        return true;
    }

}
