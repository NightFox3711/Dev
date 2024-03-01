package com.prueba1.controller;

import com.prueba1.domain.cleta;
import com.prueba1.service.cletaService;
import com.prueba1.service.impl.FirebaseStorageServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@Slf4j
@RequestMapping("/cleta")
public class indexController {
    
    @Autowired
    private cletaService cletaService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var cletas = cletaService.getcletas(false);
        model.addAttribute("cletas", cletas);
        model.addAttribute("totalcletas", cletas.size());
        return "/cleta/listado";
    }
    
    @GetMapping("/nuevo")
    public String cletaNuevo(cleta cleta) {
        return "/cleta/modifica";
    }

    @Autowired
    private FirebaseStorageServiceImpl firebaseStorageService;
    
    @PostMapping("/guardar")
    public String cletaGuardar(cleta cleta,
            @RequestParam("imagenFile") MultipartFile imagenFile) {        
        if (!imagenFile.isEmpty()) {
            cletaService.save(cleta);
            cleta.setRutaImagen(
                    firebaseStorageService.cargaImagen(
                            imagenFile, 
                            "cleta", 
                            cleta.getIdcleta()));
        }
        cletaService.save(cleta);
        return "redirect:/cleta/listado";
    }

    @GetMapping("/eliminar/{idcleta}")
    public String cletaEliminar(cleta cleta) {
        cletaService.delete(cleta);
        return "redirect:/cleta/listado";
    }

    @GetMapping("/modifica/{idcleta}")
    public String cletaModifica(cleta cleta, Model model) {
        cleta = cletaService.getcleta(cleta);
        model.addAttribute("cleta", cleta);
        return "/cleta/modifica";
    }
    
    
}



