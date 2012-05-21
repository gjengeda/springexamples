package no.gjengeda;

import org.springframework.beans.factory.annotation.Autowired;

import no.gjengeda.model.AddressBuilder;
import no.gjengeda.model.ExternalAddress;
import no.gjengeda.model.InternalAddress;
import no.gjengeda.model.ZipCodeMapper;

public class AddressManipulator {

	@Autowired
	AddressBuilder addressBuilder;
	
	public void createInternalAddressAndDoSomethingWithIt(ExternalAddress externalAddress, ZipCodeMapper zipCodeMapper) {
		addressBuilder.populateFrom(externalAddress);
		addressBuilder.populateFrom(zipCodeMapper);
		InternalAddress myAddress = addressBuilder.build();

		if(myAddress.isInOslo()) {
			// Do something 
		} else {
			// Do something else
		}
	}
}
