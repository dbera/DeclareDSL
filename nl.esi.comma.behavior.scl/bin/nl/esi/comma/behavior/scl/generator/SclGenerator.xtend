/*
 * generated by Xtext 2.25.0
 */
package nl.esi.comma.behavior.scl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import nl.esi.comma.behavior.scl.scl.Model
import org.eclipse.core.resources.ResourcesPlugin
import java.util.Map
import org.eclipse.core.runtime.Path

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SclGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		if(resource.allContents.head instanceof Model) {
			val constraints = resource.allContents.head as Model
			var uri = fsa.getURI("./")
			var file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toPlatformString(true)));
			var srcGenPath = file.getLocation().toOSString;	
			val String path = "\\Constraints\\"
			var Map<String, ConstraintStateMachine> mapContraintToAutomata = (new ConstraintsStateMachineGenerator()).generateStateMachine(constraints, srcGenPath, "spec") // + path
			(new ScenarioGenerator).generateTestScenarios(mapContraintToAutomata, constraints.actions, constraints, 1, fsa, path, "task-name", "dfs")
		}
	}
}
