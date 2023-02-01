package com.example.restservice.usuario;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;



@Service
public class UsuarioService{
    private List<Usuario> usuarios;

    public UsuarioService(){
        this.usuarios = new ArrayList<Usuario>();
    }



    public List<Usuario> getAllUsuarios(){
        return this.usuarios;
    }

    public Usuario getUsuarioById(int id){
        return this.usuarios.get(id);
    }

    public void crearUsuario(Usuario nuevoUsuario){
        this.usuarios.add(nuevoUsuario);
    }
    
    public Usuario modificarUsuario(int usuarioId,Usuario usuario){
        if(usuario.getApellido()!=null){
            this.usuarios.get(usuarioId).setApellido(usuario.getApellido());
        }
        if(usuario.getNombre()!=null){
            this.usuarios.get(usuarioId).setNombre(usuario.getNombre());
        }
        if(usuario.getTrabajo()!=null){
            this.usuarios.get(usuarioId).setTrabajo(usuario.getTrabajo());
        }
       return  this.usuarios.get(usuarioId);
    }

    public void eliminarUsuario(int usuarioId){
        this.usuarios.remove(usuarioId);
    }

    public void agregarAmigo(int usuarioId,int amigoId){
        if( this.usuarios.get(usuarioId)!=null
        && this.usuarios.get(amigoId)!=null){

            this.usuarios.get(usuarioId).agregarAmigo(amigoId);
            this.usuarios.get(amigoId).agregarAmigo(usuarioId);
        }
    
    }
}