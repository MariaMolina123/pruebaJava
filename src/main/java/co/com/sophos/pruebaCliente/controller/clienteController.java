/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.pdsdemo.controller;

import co.com.sophos.pruebaCliente.model.Cliente;
import co.com.sophos.pruebaCliente.service.IClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sala305
 */
@RestController
public class clienteController {

    @Autowired
    private IClienteService clienteService;
    
    @GetMapping("/getCliente")
    public List<Cliente> getCliente()
    {
        return clienteService.getCliente();
    }
    
     @PostMapping("/addCliente")
    public String addCliente(@RequestBody Cliente model)
    {
        return clienteService.addCliente(model);
    }
}
