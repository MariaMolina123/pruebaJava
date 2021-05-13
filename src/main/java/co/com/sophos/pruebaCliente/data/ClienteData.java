/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.pdsdemo.data;

import co.com.sophos.pruebaCliente.model.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sala305
 */
public class ClienteData {

    private static List<Cliente> list;

    static {
        list = new ArrayList<Cliente>() {
            {
                add(new Cliente(1, 10, 3, 5, 25));                
                add(new Cliente(2, 10, 3, 3, 50));                
                add(new Cliente(1, 10, 4, 5, 25));
            }
        };
        
    }

    public static List<Cliente> getList() {
        return list;
    }

    public static void setList(List<Cliente> list) {
        ClienteData.list = list;
    }   
}
