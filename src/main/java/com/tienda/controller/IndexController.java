package com.tienda.controller;

import com.tienda.domain.Cliente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.tienda.service.ClienteService;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author KArly
 */
@Controller
@Slf4j
public class IndexController {
    @Autowired
    private ClienteService clienteService;
    @GetMapping("/")
    public String Inicio(Model model) {
        log.info("Ahora utilizamos MVC");

//        Cliente cliente = new Cliente("Karly", "Paniagua Madrigal", "Karlypm29@gmail.com", "8822-4212");
//        Cliente cliente2 = new Cliente("Juan", "Lopez Rojas", "jbrenesbl@gmail.com", "8820-2655");
//        Cliente cliente3 = new Cliente("Pedro", "Fernadez Mora", "PedroM@gmail.com", "8550-8665");
//        
//        var clientes = Arrays.asList(cliente, cliente2, cliente3);
//        
//        model.addAttribute("cliente", cliente);
//        model.addAttribute("clientes", clientes);
        
        var clientes = clienteService.getClientes();
        model.addAttribute("clientes", clientes);
        
        
        return "index";
    }
    
    @GetMapping("/nuevoCliente")
    public String nuevoCliente(Cliente cliente){
        return "modificarCliente";
    }
    
    @PostMapping("/guardarCliente")
    public String guardarCliente(Cliente cliente){
        clienteService.save(cliente);
        return "redirect:/";
    }
    
    @GetMapping("/modificarCliente/{idCliente}")
    public String modificarCliente(Cliente cliente, Model model){
        cliente = clienteService.getCliente(cliente);
        model.addAttribute("cliente", cliente);
        return "modificarCliente";
    }
    
    @GetMapping("/eliminarCliente/{idCliente}")
    public String eliminarCliente(Cliente cliente){
        clienteService.delete(cliente);
        return "redirect:/";
    }
}
