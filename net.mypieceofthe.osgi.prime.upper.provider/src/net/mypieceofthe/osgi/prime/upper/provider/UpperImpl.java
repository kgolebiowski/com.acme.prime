package net.mypieceofthe.osgi.prime.upper.provider;

import org.osgi.service.component.annotations.Component;

import net.mypieceofthe.osgi.upper.api.Upper;

/**
 * 
 */
@Component(name = "net.mypieceofthe.osgi.prime.upper")
public class UpperImpl implements Upper {

	@Override
	public String upper(String input) {
		return input.toUpperCase();
	}

}
