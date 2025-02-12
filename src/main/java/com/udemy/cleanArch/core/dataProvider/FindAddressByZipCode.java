package com.udemy.cleanArch.core.dataProvider;

import com.udemy.cleanArch.core.domain.Address;

public interface FindAddressByZipCode {

    Address find(final String zipCode);
}
