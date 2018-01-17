package br.com.xti.refinado;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/*Especifica que esta class deve ser documentada pelo javadoc*/
@Documented

/*Especifica que sera declarada apenas em class, interfaces e enums*/
@Target(ElementType.TYPE)
public @interface Cabecalho {

	String intituição();
	String projeto();
	String dataCriacao();
	String criador();
	int revisao() default 1;



}
