/*
 * generated by Xtext 2.25.0
 */
package nl.esi.comma.behavior.scl.ui;

import com.google.inject.Injector;
import nl.esi.comma.behavior.scl.ui.internal.SclActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SclExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(SclActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		SclActivator activator = SclActivator.getInstance();
		return activator != null ? activator.getInjector(SclActivator.NL_ESI_COMMA_BEHAVIOR_SCL_SCL) : null;
	}

}
