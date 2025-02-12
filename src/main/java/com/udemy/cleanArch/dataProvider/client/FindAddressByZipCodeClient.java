package com.udemy.cleanArch.dataProvider.client;

import com.udemy.cleanArch.dataProvider.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "FindAddressByZipCodeClient",
        url = "${ribeiro.client.address.url}"
)
public interface FindAddressByZipCodeClient {

    @GetMapping("{zipCode}")
    AddressResponse find(@PathVariable String zipCode);
}
