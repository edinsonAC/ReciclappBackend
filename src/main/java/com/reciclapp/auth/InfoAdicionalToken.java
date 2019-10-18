package com.reciclapp.auth;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import com.reciclapp.entitys.Usuario;
import com.reciclapp.services.IUsuarioService;

@Component
public class InfoAdicionalToken implements TokenEnhancer {

	// agregando mas informacion al token

	@Autowired
	private IUsuarioService usuarioService;

	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {

		Usuario usuario = usuarioService.findByEmail(authentication.getName());
		System.out.println("...>>>>>>>>>>>>>><<<<............... .   " + authentication.getName());
		Map<String, Object> info = new HashMap<>();
		info.put("id", usuario.getUsuaId());
//		info.put("tipo_usuario", usuario.getRol().getNombre());

		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
		return accessToken;
	}

}