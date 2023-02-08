package com.example.restservice.producto;

import java.util.List;




import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class ProductoService{
    private ProductoRepositorio pRepositorio;

    @Autowired
    public ProductoService(ProductoRepositorio pRepositorio){
        this.pRepositorio = pRepositorio;
    }



    public List<Producto> getAllProductos(){
        return this.pRepositorio.findAll();
    }

    public  Producto getProductoById(long id){
        return this.pRepositorio.getReferenceById(id);
        
    }

    //Guardar nuevo usuario
    public void crearProducto(Producto nuevoUsuario){
       this.pRepositorio.save(nuevoUsuario);
    }
    
    @Transactional
    public void modificarProducto(Long id,Producto producto){
        Producto miProducto = this.pRepositorio.getReferenceById(id);


        if(producto.getTipo()!=null){
            miProducto.setTipo(producto.getTipo());
        }
        if(producto.getNombre()!=null){
            miProducto.setNombre(producto.getNombre());
        }
        if(producto.getCalidad()!=null){
            miProducto.setCalidad(producto.getCalidad());
        }
    }

    public void eliminarProducto(Long id){
        this.pRepositorio.deleteById(id);
    }
}