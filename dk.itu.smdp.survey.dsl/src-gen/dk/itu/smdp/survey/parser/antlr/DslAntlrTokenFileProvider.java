/*
* generated by Xtext
*/
package dk.itu.smdp.survey.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DslAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.tokens");
	}
}
