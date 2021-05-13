/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sophos.pruebaCliente.dao.impl;

import co.com.sophos.pruebaCliente.dao.IClienteDao;
import co.com.sophos.pruebaCliente.ClienteData;
import co.com.sophos.pruebaCliente.model.Cliente;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sala305
 */
@Repository
public class ClienteDaoImplList implements IClienteDao {

    @Override
    public List<Cliente> getCliente() {
        return ClienteData.getList();
    }

    @Override
    public List<Cliente> getClienteAndTopic(long idCliente, long idTipoDoc) {
        List<Cliente> clienteList = this.getCliente().stream().filter(x->x.getIdCliente()==idClientet&& x.getidTipoDocc()==idTipoDoc).collect(Collectors.toList());
        return clienteList;
    }

    @Override
    public void addCliente(Cliente model) {
        List<Cliente> clienteList = this.getCliente();
       clienteList.add(model);
        ClienteData.setList(clienteList);
    }
    
}
