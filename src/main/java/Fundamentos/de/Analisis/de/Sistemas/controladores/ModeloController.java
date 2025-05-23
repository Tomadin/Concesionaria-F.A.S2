
package Fundamentos.de.Analisis.de.Sistemas.controladores;

import Fundamentos.de.Analisis.de.Sistemas.modelos.Modelo;
import Fundamentos.de.Analisis.de.Sistemas.servicios.ModeloServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/modelos")
public class ModeloController {
    
    @Autowired
    private ModeloServicio servicio;
    
    @PostMapping("/crear")
    public Modelo crearModelo(@RequestBody Modelo modelo){
        return servicio.modeloGuardar(modelo);
    }
    
    @GetMapping("")
    public List<Modelo> obtenerModelos(){
        return servicio.listarTodos();
    }
    
    
}
