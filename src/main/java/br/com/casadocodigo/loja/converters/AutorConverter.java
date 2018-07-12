package br.com.casadocodigo.loja.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.casadocodigo.loja.models.Autor;

@FacesConverter("autorConverter")
public class AutorConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String texto) {
		if(texto==null||texto.trim().isEmpty()) return null;
		Autor autor = new Autor();
		autor.setId(Integer.valueOf(texto));
		return autor;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object obj) {
		if(obj ==null) return null;
		
		Autor autor = (Autor) obj;
		return autor.getId().toString();
	}

}
