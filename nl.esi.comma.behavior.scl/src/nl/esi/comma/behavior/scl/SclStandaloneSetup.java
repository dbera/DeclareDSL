/*
 * generated by Xtext 2.25.0
 */
package nl.esi.comma.behavior.scl;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class SclStandaloneSetup extends SclStandaloneSetupGenerated {

	public static void doSetup() {
		new SclStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
