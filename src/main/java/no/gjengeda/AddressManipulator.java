package no.gjengeda;

import no.gjengeda.model.ExternalAddress;
import no.gjengeda.model.InternalAddress;
import no.gjengeda.model.ZipCodeMapper;

public class AddressManipulator {

	public void createInternalAddressAndDoSomethingWithIt(ExternalAddress externalAddress, ZipCodeMapper zipCodeMapper) {
		InternalAddress myAddress = new InternalAddress();
		myAddress.setStreet(externalAddress.getStreet());
		myAddress.setZipCode(externalAddress.getZipCode());
		myAddress.setCity(zipCodeMapper.mapCityFromZipCode(myAddress.getZipCode()));

		if(myAddress.isInOslo()) {
			// Do something 
		} else {
			// Do something else
		}
	}
}
