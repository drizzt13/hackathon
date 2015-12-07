package com.expedia.derbysoft.hackathon.webservice;

import com.expedia.derbysoft.hackathon.webservice.client.DPaladinWebServiceClient;
import com.expedia.derbysoft.hackathon.webservice.dto.HotelSearchRS;
import com.thoughtworks.xstream.XStream;
import org.junit.Test;

public class ClientHotelSearchWebServiceTest {

    private String url = "http://localhost:8080/dpaladin/hotelsearch?location=47.6063889,-122.3308333&radius=5km&dates=2016-05-19,2016-05-22";

    @Test
    public void test() {
        DPaladinWebServiceClient client = new DPaladinWebServiceClient(url);
        HotelSearchRS rs = client.search();
        System.out.println(new XStream().toXML(rs));
    }

}
