package com.maytech.lc.formator;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.maytech.lc.api.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {
		System.out.println("inside the parse method of PhoneFormatter");

		// Whether number consist of '-'
		int index = completePhoneNumber.indexOf('-');
		Phone phone = new Phone();
		String[] phoneNumber = completePhoneNumber.split("-");

		if (index == -1 || completePhoneNumber.startsWith("-")) {
			phone.setCountryCode("91");
			if (completePhoneNumber.startsWith("-")) {
				phone.setPhoneNumber(phoneNumber[1]);
			} else {
				phone.setPhoneNumber(phoneNumber[0]);

			}

		} // If number does not consist '-' inset bydefault '91-'

		else {

			// Split the string received from user

			// Extract the countryCode and store it into phone class countryCodePoetry

			phone.setCountryCode(phoneNumber[0]);
			phone.setPhoneNumber(phoneNumber[1]);

		}
		return phone;
	}

}
