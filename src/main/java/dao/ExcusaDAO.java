/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;


import modelo.ExcusaEntrega;
import java.util.List;
//interfaz con los metodos
public interface ExcusaDAO {
    //Obtener drama descendente
    List<ExcusaEntrega> obtenerConsulta1_DramaDesc();
    //Obtener mascotas y retrasos
    List<ExcusaEntrega> obtenerConsulta2_MascotasYRetraso();
    //Obtener sin fecha y condiciones
    List<ExcusaEntrega> obtenerConsulta3_SinFechaYCondiciones();
    //Obtener consulta avanzada
    List<ExcusaEntrega> obtenerConsulta4_Avanzada();
    
}
