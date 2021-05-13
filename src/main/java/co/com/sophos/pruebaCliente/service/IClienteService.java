/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sophos.pruebaCliente.service;

import co.com.sophos.pruebaCliente.model.Cliente;
import java.util.List;

/**
 *
 * @author sala305
 */
public interface IClienteService {

    List<Cliente> getCliente();

    List<Cliente> getClienteAndTopic(long idCliente, long idTipoDoc);
    
    String addCliente(Cliente model);
}
