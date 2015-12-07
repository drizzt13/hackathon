package com.expedia.derbysoft.hackathon.webservice;

import com.expedia.derbysoft.hackathon.webservice.client.ClientHotelSearchWebService;
import com.expedia.derbysoft.hackathon.webservice.dto.HotelSearchRS;
import org.junit.Test;

public class ClientHotelSearchWebServiceTest {

    private String url = "http://localhost:8080/dpaladin/hotelsearch";

    @Test
    public void test() {
        ClientHotelSearchWebService client = new ClientHotelSearchWebService(url);
        HotelSearchRS rs = client.search();
        System.out.println(rs);
    }

}
