/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.logic;

import modelo.beans.Usuario;
import modelo.dao.UsuarioDAO;

/**
 *
 * @author Trabajo
 */
public class Usuariologic {
    private static final UsuarioDAO usuariodao= new UsuarioDAO();
        private static Object usuarioconsulta;
    public static boolean autentificar(String usuario, String Contraseña){
      if (obtener(usuario !=null) {
          Usuario usuarioConsulta=obtener(usuario);
          
       if (usuarioConsulta).getNombres().equals(usuario)&&usuarioconsulta.getContraseña().equals(contraseña)) {
         return true;

}

}else{
  return false;
}

  }

    
    public static boolean insertar(Usuario usuario){
       
       return usuariodao.insertar(usuario);

}

        private static Object getNombres() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    
    
    }
    
    public static boolean modificar(Usuario usuario){
        
        return usuariodao.modificar(usuario);

    }
    
     public static Usuario eliminar(String usuario){
        
         return usuariodao.eliminar(usuario);

    }
      public static Usuario obtener(String usuario){
           return usuariodao.obtener(usuario);
      }
