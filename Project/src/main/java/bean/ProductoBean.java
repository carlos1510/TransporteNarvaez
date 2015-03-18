package bean;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;

@ManagedBean
public class ProductoBean {

	private List<SelectItem> marcas;
	public String selection;
	@PostConstruct
	public void init(){
		marcas = new ArrayList<SelectItem>();
		SelectItemGroup group1 = new SelectItemGroup("E.M.");
        SelectItemGroup group2 = new SelectItemGroup("Group 2");
        SelectItemGroup group3 = new SelectItemGroup("Group 3");
        SelectItemGroup group4 = new SelectItemGroup("Group 4");
         
        SelectItemGroup group11 = new SelectItemGroup("Rocoto");
        SelectItemGroup group12 = new SelectItemGroup("Cayhua");
         
        SelectItemGroup group21 = new SelectItemGroup("Group 2.1");
         
        SelectItem option31 = new SelectItem("Option 3.1", "Option 3.1");
        SelectItem option32 = new SelectItem("Option 3.2", "Option 3.2");
        SelectItem option33 = new SelectItem("Option 3.3", "Option 3.3");
        SelectItem option34 = new SelectItem("Option 3.4", "Option 3.4");
         
        SelectItem option41 = new SelectItem("Option 4.1", "Option 4.1");
         
        SelectItem option111 = new SelectItem("Option 1.1.1");
        SelectItem option112 = new SelectItem("Option 1.1.2");
        group11.setSelectItems(new SelectItem[]{option111, option112});
         
        SelectItem option121 = new SelectItem("Baja", "Baja");
        SelectItem option122 = new SelectItem("Primera", "Primera");
        SelectItem option123 = new SelectItem("Superior", "Superior");
        SelectItem option124 = new SelectItem("Extra Superior", "Extra Superior");
        group12.setSelectItems(new SelectItem[]{option121, option122, option123,option124});
         
        SelectItem option211 = new SelectItem("Option 2.1.1", "Option 2.1.1");
        group21.setSelectItems(new SelectItem[]{option211});
         
        group1.setSelectItems(new SelectItem[]{group11, group12});
        group2.setSelectItems(new SelectItem[]{group21});
        group3.setSelectItems(new SelectItem[]{option31, option32, option33, option34});
        group4.setSelectItems(new SelectItem[]{option41});
        
        marcas.add(group1);
        marcas.add(group2);
        marcas.add(group3);
        marcas.add(group4);
	}
	
	public List<SelectItem> getMarcas(){
		return marcas;
	}
	
	public String getSelection() {
		return selection;
	}
	
	public void setSelection(String selection){
		this.selection = selection;
	}
}
