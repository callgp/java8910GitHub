module atientclinicals {
	//requires patientmanagement;
	
	requires transitive patientmanagement;//if make transitive then PatientManagement is also accessed by whoever is calling Patient Clinicals(here ex. patientbilling)

	//requires static patientmanagement;//only at copile time not needed at runtime like servlet.api
}