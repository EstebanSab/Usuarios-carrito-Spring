package com.example.restservice.usuario;

import java.util.List;


import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


//http://localhost:8080/api/usuarios
@RestController
@RequestMapping("api/usuarios")
public class UsuarioController {
    private UsuarioService usuarioService;    

    @Autowired
    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService=usuarioService;
    }
                  

    @GetMapping
    public List<Usuario> getAllUsuarios() {
        return this.usuarioService.getAllUsuarios();
    }

    @GetMapping("/usuario/{id}")
     public Usuario getOneUsuario(@PathVariable int id) {
        return this.usuarioService.getUsuarioById(id);
    }

    @GetMapping("/usuario")
	public Usuario getOneUsuarioRequest(@RequestParam(value = "usuario", defaultValue = "0") int idUsuario) {
		return this.usuarioService.getUsuarioById((Integer)idUsuario);
	}

    @PostMapping
    public void agregarNuevoUsuarios(@RequestBody Usuario nuevoUsuario) {
      this.usuarioService.crearUsuario(nuevoUsuario);
    }

    @PutMapping(path = "/usuario/{usuarioId}")
    public Usuario modificarUsuario(
        @PathVariable("usuarioId") int usuarioIdVariable,
        @RequestBody Usuario usuario) {
        return this.usuarioService.modificarUsuario(usuarioIdVariable,usuario);
    }

    @DeleteMapping(path = "{usuarioId}")
    public void eliminarUsuario(@PathVariable("usuarioId") int usuarioId){
        this.usuarioService.eliminarUsuario(usuarioId);
    }       

    @PutMapping(path = "/usuario/{usuarioId}/amigo/{amigoId}")
    public void agregarAmigo(
        @PathVariable("usuarioId") int usuarioIdVariable,
        @PathVariable("amigoId") int amigoId) {
        this.usuarioService.agregarAmigo(usuarioIdVariable,amigoId);
    }
}