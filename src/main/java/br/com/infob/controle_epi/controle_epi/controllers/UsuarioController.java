package br.com.infob.controle_epi.controle_epi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.infob.controle_epi.controle_epi.models.Usuario;
import br.com.infob.controle_epi.controle_epi.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    public UsuarioService usuarioService;

    @PostMapping("/cadastrar")
    public Usuario cadastrar(@RequestBody Usuario usuario, @RequestParam String confSenha){
        if(usuario.getSenha().equals(confSenha)){
            return usuarioService.salvar(usuario);
        }
        return null;
    }

    @PostMapping("/login")
    public Usuario login(@RequestParam String email, @RequestParam String senha){
        Usuario u = new Usuario();
        u.setEmail(email);
        u.setSenha(senha);
        return usuarioService.login(u);
    }
}
