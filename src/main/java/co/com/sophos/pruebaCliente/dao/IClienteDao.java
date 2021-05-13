/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sophos.pruebaCliente.dao;

import co.com.sophos.pruebaCliente.model.Cliente;
import java.util.List;

/**
 *
 * @author sala305
 */
public interface IClienteDao {

    List<Cliente> getCliente();

    List<Cliente> getClienteAndTopic(long idCliente, long idTipoDoc);

    void addCliente(Cliente model);
}
