/*
 * generated by Xtext 2.25.0
 */
package nl.esi.comma.behavior.scl;

import com.google.inject.Guice;
import com.google.inject.Injector;
import nl.esi.comma.behavior.scl.scl.SclPackage;
import nl.esi.comma.expressions.ExpressionsStandaloneSetup;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;

@SuppressWarnings("all")
public class SclStandaloneSetupGenerated implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		ExpressionsStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new SclRuntimeModule());
	}
	
	public void register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.esi.nl/comma/behavior/scl/Scl")) {
			EPackage.Registry.INSTANCE.put("http://www.esi.nl/comma/behavior/scl/Scl", SclPackage.eINSTANCE);
		}
		IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
		IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider.class);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("scl", resourceFactory);
		IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("scl", serviceProvider);
	}
}