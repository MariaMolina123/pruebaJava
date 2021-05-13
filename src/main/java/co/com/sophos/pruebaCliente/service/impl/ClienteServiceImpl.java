/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.pdsdemo.service.impl;

import co.com.sophos.pruebaCliente.dao.IClienteDao;
import co.com.sophos.pruebaCliente.model.Cliente;
import co.com.sophos.pruebaCliente.service.IClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sala305
 */
@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private IClienteDao clienteDao;

    @Override
    public List<Cliente> getCliente() {
        return clienteDao.getCliente();
    }

    @Override
    public List<Cliente> getClienteAndTopic(long idCliente, long idTipoDoc) {
        return clienteDao.getClienteAndTopic(idCliente, idTipoDoc);
    }

    @Override
    public String addCliente(Cliente model) {

        String result = "Se ha guardado con exito";

        List<Cliente> clienteList = clienteDao.getClientendTopic(model.getidCliente(), model.getidTipoDoc());

        long limitPercent = model.getPercent();

        for (Cliente cliente : clienteList) {
            limitPercent += cliente.getPercent();
        }
        if (model.getPercent() < 0 || model.getPercent() > 100) {
            result = "El porcentaje no esta dentro del rango permitido";
        } else if (model.getValue() < 0 || model.getValue() > 5) {
            result = "El valor de la nota no esta dentro del rango permitido";
        } else if (limitPercent > 100) {
            result = "El porcentaje supera el 100%";
        } else {
            clienteDao.addCliente(model);
        }

        return result;
    }

}
