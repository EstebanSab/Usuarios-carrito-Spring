package com.example.restservice.producto;

import java.util.List;


import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


//http://localhost:8080/api/productos
@RestController
@RequestMapping("api/productos")
public class ProductoController {
    private ProductoService productoService;    

    @Autowired
    public ProductoController(ProductoService productoService){
        this.productoService=productoService;
    }
                  

    @GetMapping
    public List<Producto> getAllProducto() {
        return this.productoService.getAllProductos();
    }

    @GetMapping("/producto/{id}")
     public Producto getOneProductoId(@PathVariable Long id) {
        return this.productoService.getProductoById(id);
    }

    @GetMapping("/producto")
	public Producto getOneProductoRequest(@RequestParam(value = "producto", defaultValue = "0") int idProducto) {
		return this.productoService.getProductoById((Integer)idProducto);
	}

    @PostMapping
    public void agregarNuevoProducto(@RequestBody Producto nuevoProducto) {
      this.productoService.crearProducto(nuevoProducto);
    }

    
    @PutMapping(path = "/producto/{productoId}")
    public void modificarProducto(
        @PathVariable("productoId") Long productoIdIdVariable,
        @RequestBody Producto producto) {
        this.productoService.modificarProducto(productoIdIdVariable,producto);
    }

    @DeleteMapping(path = "{productoId}")
    public void eliminarProducto(@PathVariable("productoId") Long productoId){
        this.productoService.eliminarProducto(productoId);
    }       

}