/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author braya
 */
public abstract class ControladorAbstracto<T> {


    public ControladorAbstracto() {
    }
    
    public abstract boolean create(T objeto);
    
    public abstract T readNombre(String objeto);

}
