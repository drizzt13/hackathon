package com.expedia.derbysoft.hackathon.webservice.client.expedia.dto;

import com.alibaba.fastjson.JSONObject;
import com.expedia.derbysoft.hackathon.utils.JsonUtils;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class HotelSearchSummaryTest {

    @Test
    public void test() {
        Object parse = JSONObject.parseObject(request, HotelSearchSummary.class);
        HotelSearchSummary object = (HotelSearchSummary) parse;
        String values = JsonUtils.marshal(object);
        assertNotNull(values);
        System.out.println(values);
    }

    private String request = "{\n" +
            "    \"MatchingHotelCount\": \"74\",\n" +
            "    \"HotelCount\": \"74\",\n" +
            "    \"StayDates\": {\n" +
            "        \"CheckInDate\": \"2016-05-19\",\n" +
            "        \"CheckOutDate\": \"2016-05-22\"\n" +
            "    },\n" +
            "    \"HotelInfoList\": {\n" +
            "        \"HotelInfo\": [\n" +
            "{\n" +
            "                \"HotelID\": \"2163007\",\n" +
            "                \"Name\": \"Four Seasons Hotel Seattle\",\n" +
            "                \"Location\": {\n" +
            "                    \"StreetAddress\": \"99 Union St\",\n" +
            "                    \"City\": \"Seattle\",\n" +
            "                    \"Province\": \"WA\",\n" +
            "                    \"Country\": \"USA\",\n" +
            "                    \"GeoLocation\": {\n" +
            "                        \"Latitude\": \"47.60772\",\n" +
            "                        \"Longitude\": \"-122.33936\"\n" +
            "                    }\n" +
            "                },\n" +
            "                \"Description\": \"Offering modern luxury in an ideal downtown setting, Four Seasons Hotel Seattle is across from the Seattle Art Museum, 1 block from the Pike Place Market, and a five-minute walk from the waterfront.\",\n" +
            "                \"StatusCode\": \"0\",\n" +
            "                \"Price\": {\n" +
            "                    \"BaseRate\": {\n" +
            "                        \"Value\": \"1101.60\",\n" +
            "                        \"Currency\": \"USD\"\n" +
            "                    },\n" +
            "                    \"TaxRcAndFees\": {\n" +
            "                        \"Value\": \"177.84\",\n" +
            "                        \"Currency\": \"USD\"\n" +
            "                    },\n" +
            "                    \"TotalRate\": {\n" +
            "                        \"Value\": \"1279.44\",\n" +
            "                        \"Currency\": \"USD\"\n" +
            "                    }\n" +
            "                },\n" +
            "                \"DetailsUrl\": \"http://www.expedia.com/go/hotel/info/2163007/2016-05-19/2016-05-22?NumRooms=1&NumAdult-Room1=2&tpid=1&eapid=0&langid=1033\",\n" +
            "                \"StarRating\": \"5.0\",\n" +
            "                \"ThumbnailUrl\": \"https://images.trvl-media.com/hotels/3000000/2170000/2163100/2163007/2163007_15_t.jpg\",\n" +
            "                \"GuestRating\": \"4.8\",\n" +
            "                \"GuestReviewCount\": \"264\",\n" +
            "                \"RoomTypeList\": {\n" +
            "                    \"RoomType\": {\n" +
            "                        \"Description\": \"One King Bed, City View, Accessible - 20% OFF\",\n" +
            "                        \"RemainingCount\": \"1\",\n" +
            "                        \"Price\": {\n" +
            "                            \"BaseRate\": {\n" +
            "                                \"Value\": \"1101.60\",\n" +
            "                                \"Currency\": \"USD\"\n" +
            "                            },\n" +
            "                            \"TaxRcAndFees\": {\n" +
            "                                \"Value\": \"177.84\",\n" +
            "                                \"Currency\": \"USD\"\n" +
            "                            },\n" +
            "                            \"TotalRate\": {\n" +
            "                                \"Value\": \"1279.44\",\n" +
            "                                \"Currency\": \"USD\"\n" +
            "                            }\n" +
            "                        },\n" +
            "                        \"Refundable\": \"false\",\n" +
            "                        \"FreeCancellation\": \"false\",\n" +
            "                        \"FreeInternet\": \"true\",\n" +
            "                        \"FreeInternetAmenityDetails\": {\n" +
            "                            \"Amenity\": \"Free WiFi\"\n" +
            "                        },\n" +
            "                        \"FreeParking\": \"false\",\n" +
            "                        \"FreeBreakfast\": \"false\",\n" +
            "                        \"PaymentMethod\": \"Online\",\n" +
            "                        \"SmokingAvailable\": {\n" +
            "                            \"HasNonSmoking\": \"true\",\n" +
            "                            \"HasSmoking\": \"false\"\n" +
            "                        }\n" +
            "                    }\n" +
            "                },\n" +
            "                \"AmenityList\": {\n" +
            "                    \"Amenity\": [\n" +
            "                        \"High-speed Internet\",\n" +
            "                        \"Swimming pool\"\n" +
            "                    ]\n" +
            "                }\n" +
            "            }," +
            "        ]\n" +
            "    }\n" +
            "}";

}
