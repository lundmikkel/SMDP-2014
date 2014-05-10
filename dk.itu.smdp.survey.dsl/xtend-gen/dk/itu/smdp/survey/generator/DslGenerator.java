/**
 * generated by Xtext
 */
package dk.itu.smdp.survey.generator;

import dk.itu.smdp.survey.generator.LatexTemplate;
import dk.itu.smdp.survey.generator.PhpTemplate;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import survey.Survey;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class DslGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    Survey survey = ((Survey) _head);
    PhpTemplate _phpTemplate = new PhpTemplate(survey, fsa);
    _phpTemplate.Generate();
    LatexTemplate _latexTemplate = new LatexTemplate(survey, fsa);
    _latexTemplate.Generate();
  }
}
