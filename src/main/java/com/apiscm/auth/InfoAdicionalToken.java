package com.apiscm.auth;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import com.apiscm.entitys.Usuario;
import com.apiscm.services.IUsuarioService;

@Component
public class InfoAdicionalToken implements TokenEnhancer {

	// agregando mas informacion al token

	@Autowired
	private IUsuarioService usuarioService;

	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {

		Usuario usuario = usuarioService.findByUsername(authentication.getName());
		System.out.println("...>>>>>>>>>>>>>><<<<............... .   " + authentication.getName());
		Map<String, Object> info = new HashMap<>();
		info.put("id", usuario.getId());
//		info.put("tipo_usuario", usuario.getRol().getNombre());

		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
		return accessToken;
	}

}