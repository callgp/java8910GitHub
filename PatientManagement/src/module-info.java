module patientmanagement {
	exports com.gp.pr;
	
	//exports com.gp.pr to patientbilling;//restrict to on this one and see error in patient clinicals
	//requires patientbilling;//error alsready cyclal there earlier
}

/*
 * Multiple markers at this line - Cycle exists in module dependencies, Module
 * patientmanagement requires itself via patientbilling - patientbilling cannot
 * be resolved to a module
 */