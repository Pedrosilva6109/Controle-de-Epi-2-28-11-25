package br.com.infob.controle_epi.controle_epi.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.infob.controle_epi.controle_epi.models.Emprestimo;
import br.com.infob.controle_epi.controle_epi.services.EmprestimoService;

@RestController
@RequestMapping("/emprestimo")
public class EmprestimoController {
    
    @Autowired
    public EmprestimoService emprestimoService;

    @GetMapping("/count")
    public long count() {
        return emprestimoService.count();
    }

    @PostMapping("/salvar")
    public Emprestimo salvar(@RequestBody Emprestimo epi) {
        return emprestimoService.salvar(epi);

    }

    @DeleteMapping("/deletar/{id}")
    public String deletar(@PathVariable Integer id) {
        boolean deletou = emprestimoService.deletar(id);
        if (deletou) {
            return "emprestimo removido com sucesso";
    }
        return "Falha ao remover o emprestimo";
    }

    @GetMapping("/buscar/{id}")
    public Emprestimo buscar(@PathVariable Integer id) {
        return emprestimoService.buscar(id);
    }
    
    @GetMapping("/listar")
    public List<Emprestimo> listar() {
        return emprestimoService.listar();
    }

    @PutMapping("/atualizar/{id}")
    public boolean atualizar( @RequestBody Emprestimo epi, @PathVariable Integer id) {
        return emprestimoService.atualizarBoolean(epi, id);
    }
    }


