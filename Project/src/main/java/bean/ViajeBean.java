package bean;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ViajeBean {

	
	
	
	public String RedireccionarNuevoViaje(){
		return "registrarViaje";
	}
}
