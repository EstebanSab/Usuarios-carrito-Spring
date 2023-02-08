package com.example.restservice.usuario;

import java.util.List;




import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class UsuarioService{
    private UsuarioRepositorio uRepositorio;

    @Autowired
    public UsuarioService(UsuarioRepositorio uRepositorio){
        this.uRepositorio = uRepositorio;
    }



    public List<Usuario> getAllUsuarios(){
        return this.uRepositorio.findAll();
    }

    public  Usuario getUsuarioById(long id){
        return this.uRepositorio.getReferenceById(id);
        
    }

    //Guardar nuevo usuario
    public void crearUsuario(Usuario nuevoUsuario){
       this.uRepositorio.save(nuevoUsuario);
    }
    
    @Transactional
    public void modificarUsuario(Long id,Usuario usuario){
        Usuario miUser = this.uRepositorio.getReferenceById(id);


        if(usuario.getApellido()!=null){
            miUser.setApellido(usuario.getApellido());
        }
        if(usuario.getNombre()!=null){
           miUser.setApellido(usuario.getApellido());
        }
        if(usuario.getTrabajo()!=null){
            miUser.setApellido(usuario.getApellido());
        }
    }

    public void eliminarUsuario(Long usuarioId){
        this.uRepositorio.deleteById(usuarioId);
    }
}