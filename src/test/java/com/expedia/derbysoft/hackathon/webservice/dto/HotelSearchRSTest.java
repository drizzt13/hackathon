package com.expedia.derbysoft.hackathon.webservice.dto;

import com.expedia.derbysoft.hackathon.utils.JsonUtils;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;

/**
 * Created by zhupan on 12/8/15.
 */
public class HotelSearchRSTest {

    @Test
    public void test() {
        List<HotelDTO> objects = createHotels();
        HotelSearchRS rs = new HotelSearchRS();
        rs.setHotels(objects);
        rs.setError(new ErrorDTO("System", "ErrorMsg"));
        String values = JsonUtils.marshal(rs);
        assertNotNull(values);
        System.out.println(values);
    }

    private List<HotelDTO> createHotels() {
        List<HotelDTO> hotels = new ArrayList<HotelDTO>();
        hotels.add(createHotel("2163007", "Four Seasons Hotel Seattle"));
        hotels.add(createHotel("2163008", "Four Seasons Hotel Seattle"));
        return hotels;
    }

    private HotelDTO createHotel(String hoteID, String hotelName) {
        HotelDTO hotelDTO = new HotelDTO();
        hotelDTO.setHotelID(hoteID);
        hotelDTO.setHotelName(hotelName);
        hotelDTO.setBaseRate(new BigDecimal("120"));
        hotelDTO.setDetailsUrl("http://www.expedia.com/go/hotel/info/2163007/2016-05-19/2016-05-22?NumRooms=1&NumAdult-Room1=2&tpid=1&eapid=0&langid=1033");
        hotelDTO.setDistance(new BigDecimal("1.2"));
        hotelDTO.setMatchedRating(new BigDecimal("4.2"));
        hotelDTO.setLocation(new GeoLocation(new BigDecimal("47.60772"), new BigDecimal("-122.33936")));
        hotelDTO.setThumbnailUrl("https://images.trvl-media.com/hotels/3000000/2170000/2163100/2163007/2163007_15_t.jpg");
        return hotelDTO;
    }

}
