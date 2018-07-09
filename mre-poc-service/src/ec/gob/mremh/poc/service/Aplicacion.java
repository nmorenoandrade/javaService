package ec.gob.mremh.poc.service;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.jboss.resteasy.plugins.interceptors.CorsFilter;

@ApplicationPath(value = "/")
public class Aplicacion extends Application {

	Set<Object> singletons;
	
	@Override
	public Set<Class<?>> getClasses() {

		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(DataPersonalServicio.class);

		return classes;
	}
	
	@Override
    public Set<Object> getSingletons() {
        if (singletons == null) {
            CorsFilter corsFilter = new CorsFilter();
            corsFilter.getAllowedOrigins().add("*");
            corsFilter.setAllowedMethods("OPTIONS, GET, POST, DELETE, PUT, PATCH");

            singletons = new LinkedHashSet<Object>();
            singletons.add(corsFilter);
        }
        return singletons;
    }

}
