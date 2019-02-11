package com.mkyong;

import lombok.Data;

/*
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
*/
@Data
public class Email {

	private final String usuario;
	private final String dominio;

	@Override
	public String toString() {
		return getUsuario() + "@" + getDominio();
	}
}