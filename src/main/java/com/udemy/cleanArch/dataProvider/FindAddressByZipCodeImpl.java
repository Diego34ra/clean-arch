package com.udemy.cleanArch.dataProvider;

import com.udemy.cleanArch.core.dataProvider.FindAddressByZipCode;
import com.udemy.cleanArch.core.domain.Address;
import com.udemy.cleanArch.dataProvider.client.FindAddressByZipCodeClient;
import com.udemy.cleanArch.dataProvider.client.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;


    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
