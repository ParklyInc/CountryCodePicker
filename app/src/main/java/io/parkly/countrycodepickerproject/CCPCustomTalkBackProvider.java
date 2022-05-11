package io.parkly.countrycodepickerproject;

import io.parkly.CCPCountry;
import io.parkly.CCPTalkBackTextProvider;

class CCPCustomTalkBackProvider implements CCPTalkBackTextProvider {
    @Override
    public String getTalkBackTextForCountry(CCPCountry country) {
        if (country != null) {
            return "Country code is +" + country.getPhoneCode();
        } else {
            return null;
        }
    }
}
