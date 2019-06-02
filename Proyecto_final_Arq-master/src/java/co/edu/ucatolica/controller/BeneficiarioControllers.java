/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucatolica.controller;

/**
 *
 * @author sala7
 */


import co.edu.ucatolica.DAOs.BeneficiarioDAO;
import co.edu.ucatolica.DTOs.Beneficiario;
import co.edu.ucatolica.bds.MySqlDataSource;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
 
@Controller
@RequestMapping("/")
public class BeneficiarioControllers {
    
 /*
    @RequestMapping(method = RequestMethod.GET)
    public String helloWorld(ModelMap modelMap) {
        System.out.println("beneficiarioCrear");
        modelMap.put("mensajebeneficiario", "Pase por el controller de beneficiario");
        return "beneficiario_crear";
    }
    */
@RequestMapping(method = RequestMethod.GET, value = "beneficiarioCrear.htm")
    public String processSubmit(HttpServletRequest req, SessionStatus status,ModelMap model) 
    {

        System.out.println("beneficiarioCrear");
        model.put("mensajebeneficiario", "Pase por el controller de beneficiario:::"+req.getParameter("nombre"));
        return "beneficiario_crear";
    }    
    
@RequestMapping(method = RequestMethod.POST, value = "beneficiarioRegistrar.htm")
    public String processSubmit1(HttpServletRequest req, SessionStatus status,ModelMap model) 
    {

        BeneficiarioDAO pDao = new BeneficiarioDAO();
            
        Logger.getLogger(BeneficiarioControllers.class.getName()).log(Level.INFO, "Ejecutando processSubmit1...");

        int id = pDao.obtenerId(MySqlDataSource.getConexionBD());
        String ident = req.getParameter("identificacion");
        String nombre1 = req.getParameter("nombre1");
        String nombre2 = req.getParameter("nombre2");
        String apellido1 = req.getParameter("apellido1");
        String apellido2 = req.getParameter("apellido2");
        String genero = req.getParameter("genero");
        String tipoP = req.getParameter("tipop");
        String fNacimiento = req.getParameter("fecha");
        String telef = req.getParameter("telefono");
        String email = req.getParameter("email");
        
        Beneficiario p = new Beneficiario();
        /*p.setId(id);
        p.setIdentificacion(ident);
        p.setNombre1(nombre1);
        p.setNombre2(nombre2);
        p.setApellido1(apellido1);
        p.setApellido2(apellido2);
        p.setGenero(genero);
        p.setTipoP(tipoP);
        p.setfNacimiento(fNacimiento);
        p.setTelef(telef);
        p.setEmail(email);                                    
            
        boolean insert = pDao.crearBeneficiario(p, MySqlDataSource.getConexionBD());

        Logger.getLogger(BeneficiarioControllers.class.getName()).log(Level.SEVERE, null, "Registrar + " + ident + "-" + insert);
        
        if (insert)
            model.put("mensaje", "El registro fue creado satisfactoriamente!!!");
        else
            model.put("mensaje", "El registro NO fue creado, consulte con el administrador...");
        */
        return "beneficiario_crear";
        
    }     
    
@RequestMapping(method = RequestMethod.GET, value = "beneficiarioConsultar.htm")
    public String processSubmit2(HttpServletRequest req, SessionStatus status,ModelMap model) 
    {      
        Logger.getLogger(BeneficiarioControllers.class.getName()).log(Level.INFO, "Ejecutando processSubmit2...");
        return "beneficiario_consultar";
    } 
    
@RequestMapping(method = RequestMethod.POST, value = "beneficiarioConsultarForm.htm")
    public String processSubmit3(HttpServletRequest req, SessionStatus status,ModelMap model) 
    {

        BeneficiarioDAO pDao = new BeneficiarioDAO();
            
        Logger.getLogger(BeneficiarioDAO.class.getName()).log(Level.INFO, "Ejecutando processSubmit3...");

        int id = pDao.obtenerId(MySqlDataSource.getConexionBD());
        String ident = req.getParameter("identificacion");
        String nombre1 = req.getParameter("nombre1");
        /*
        Beneficiario p = new Beneficiario();
        p.setId(id);
        p.setIdentificacion(ident);
        p.setNombre1(nombre1);
            
        List<Beneficiario> datos = pDao.consultarBeneficiario(p, MySqlDataSource.getConexionBD());

        Logger.getLogger(BeneficiarioControllers.class.getName()).log(Level.SEVERE, null, "Consultar + " + ident + "-" + datos.size());
        
        model.put("listaBeneficiarios", datos);
        if (datos.size() > 0)
            model.put("mensaje", "La consulta se realizo satisfactoriamente!!!" + datos.size());
        else
            model.put("mensaje", "La consulta NO tiene resultados...");
        */
        return "beneficiario_consultar";
    }     
    
    @RequestMapping(method = RequestMethod.GET, value = "beneficiarioEliminar.htm")
    public String processSubmit7(HttpServletRequest req, SessionStatus status,ModelMap model) 
    {      
        Logger.getLogger(BeneficiarioControllers.class.getName()).log(Level.INFO, "Ejecutando processSubmit7...");
        return "beneficiario_eliminar";
    } 
    
@RequestMapping(method = RequestMethod.POST, value = "beneficiarioConsultarForm.htm")
    public String processSubmit8(HttpServletRequest req, SessionStatus status,ModelMap model) 
    {

        BeneficiarioDAO pDao = new BeneficiarioDAO();
            
        Logger.getLogger(BeneficiarioDAO.class.getName()).log(Level.INFO, "Ejecutando processSubmit8...");

        int id = pDao.obtenerId(MySqlDataSource.getConexionBD());
        String ident = req.getParameter("identificacion");
        String nombre1 = req.getParameter("nombre1");
        /*
        Beneficiario p = new Beneficiario();
        p.setId(id);
        p.setIdentificacion(ident);
        p.setNombre1(nombre1);
            
        List<Beneficiario> datos = pDao.eliminarBeneficiario(p, MySqlDataSource.getConexionBD());

        Logger.getLogger(BeneficiarioControllers.class.getName()).log(Level.SEVERE, null, "Consultar + " + ident + "-" + datos.size());
        
        model.put("listaBeneficiarios", datos);
        if (datos.size() > 0)
            model.put("mensaje", "El beneficiario ha sido eliminado satisfactoriamente!!!" + datos.size());
        else
            model.put("mensaje", "La eliminacion NO tiene resultados...");
        */
        return "beneficiario_eliminar";
    }
    
@RequestMapping(method = RequestMethod.GET, value = "beneficiarioEditar.htm")
    public String processSubmit4(HttpServletRequest req, SessionStatus status,ModelMap model) 
    {      
        Logger.getLogger(BeneficiarioControllers.class.getName()).log(Level.INFO, "Ejecutando processSubmit4...");
        return "beneficiario_editar";
    } 
    
@RequestMapping(method = RequestMethod.POST, value = "beneficiarioEditarForm1.htm")
    public String processSubmit5(HttpServletRequest req, SessionStatus status,ModelMap model) 
    {

        BeneficiarioDAO pDao = new BeneficiarioDAO();
            
        Logger.getLogger(BeneficiarioDAO.class.getName()).log(Level.INFO, "Ejecutando processSubmit5...");

        int id = pDao.obtenerId(MySqlDataSource.getConexionBD());
        String ident = req.getParameter("identificacion");
        String nombre1 = req.getParameter("nombre1");
        /*
        Beneficiario p = new Beneficiario();
        p.setId(id);
        p.setIdentificacion(ident);
        p.setNombre1(nombre1);
            
        List<Beneficiario> datos = pDao.consultarBeneficiario(p, MySqlDataSource.getConexionBD());

        Logger.getLogger(BeneficiarioControllers.class.getName()).log(Level.SEVERE, null, "Consultar + " + ident + "-" + datos.size());
        
        model.put("listaBeneficiarios", datos);
        
        */
        return "beneficiario_editar";
        
    }    
    
@RequestMapping(method = RequestMethod.POST, value = "beneficiarioEditarForm2.htm")
    public String processSubmit6(HttpServletRequest req, SessionStatus status,ModelMap model) 
    {

       BeneficiarioDAO pDao = new BeneficiarioDAO();
            
        Logger.getLogger(BeneficiarioDAO.class.getName()).log(Level.INFO, "Ejecutando processSubmit6...");

        int id = Integer.parseInt(req.getParameter("id"));
        String ident = req.getParameter("identificacion");
        String nombre1 = req.getParameter("nombre1");
        String nombre2 = req.getParameter("nombre2");
        String apellido1 = req.getParameter("apellido1");
        String apellido2 = req.getParameter("apellido2");
        String genero = req.getParameter("genero");
        String tipoP = req.getParameter("tipop");
        String fNacimiento = req.getParameter("fecha");
        String telef = req.getParameter("telefono");
        String email = req.getParameter("email");
        
        Logger.getLogger(BeneficiarioDAO.class.getName()).log(Level.INFO, "Id beneficiario: " + id);
        /*
        Beneficiario p = new Beneficiario();
        p.setId(id);
        p.setIdentificacion(ident);
        p.setNombre1(nombre1);
        p.setNombre2(nombre2);
        p.setApellido1(apellido1);
        p.setApellido2(apellido2);
        p.setGenero(genero);
        p.setTipoP(tipoP);
        p.setfNacimiento(fNacimiento);
        p.setTelef(telef);
        p.setEmail(email);
            
        boolean res = pDao.editarbeneficiario(p, MySqlDataSource.getConexionBD());                         
        
        if (res)
            model.put("mensaje", "Se edito satisfactoriamente!!!");
        else
            model.put("mensaje", "NO se guardaron los cambios...");
        */
        return "beneficiario_editar";
        
    }    
}
