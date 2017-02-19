package net.mypieceofthe.osgi.application;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import net.mypieceofthe.osgi.upper.api.Upper;
import osgi.enroute.configurer.api.RequireConfigurerExtender;
import osgi.enroute.google.angular.capabilities.RequireAngularWebResource;
import osgi.enroute.rest.api.REST;
import osgi.enroute.twitter.bootstrap.capabilities.RequireBootstrapWebResource;
import osgi.enroute.webserver.capabilities.RequireWebServerExtender;

@RequireAngularWebResource(resource={"angular.js","angular-resource.js", "angular-route.js"}, priority=1000)
@RequireBootstrapWebResource(resource="css/bootstrap.css")
@RequireWebServerExtender
@RequireConfigurerExtender
@Component(name="net.mypieceofthe.osgi")
public class UpperApplication implements REST {
	
	@Reference
	Upper upper;

	public String getUpper(String string) {
		return upper.upper(string);
	}

}
