package com.expedia.derbysoft.hackathon.hotel;

import com.alibaba.fastjson.JSONObject;
import com.expedia.derbysoft.hackathon.utils.JsonUtils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;

public class HotelTest {

    @Test
    public void test() {
        List<Hotel> objects = JSONObject.parseArray(request, Hotel.class);
        String values = JsonUtils.marshal(objects);
        assertNotNull(values);
        System.out.println(values);
    }

    private String request = "[" +
            "  {\n" +
            "    \"id\": \"6065755\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Lotta's Fountain\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6065755\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.403333,\n" +
            "        37.787929\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155606\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Mechanics Monument, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155606\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.39928,\n" +
            "        37.79124\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"502551\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"U.S. Mint\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"502551\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.427336,\n" +
            "        37.77063\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6065741\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Cartoon Art Museum\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6065741\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.400779,\n" +
            "        37.787068\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6065743\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Chinese Culture Center, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6065743\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.404776,\n" +
            "        37.794987\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6065737\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"St. Mary Square, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6065737\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.405312,\n" +
            "        37.791939\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6068427\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"TransAmerica Redwood Forest\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6068427\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.40234,\n" +
            "        37.795339\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155076\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Saint John Coltrane Church, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155076\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.43231,\n" +
            "        37.78132\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"502557\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Lombard Street\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"502557\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.41874,\n" +
            "        37.80217\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155462\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"San Francisco African American Historical and Cultural Society, San Francisco, California, USA\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155462\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.42918,\n" +
            "        37.7781\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6065735\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"555 California Street\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6065735\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.403992,\n" +
            "        37.792524\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"502555\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Mission Dolores, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"502555\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.425364,\n" +
            "        37.764256\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"502553\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Moscone Convention Center, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"502553\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.40155,\n" +
            "        37.78418\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155459\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Russian Center of San Francisco\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155459\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.44081,\n" +
            "        37.78513\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6065731\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Fillmore Auditorium\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6065731\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.432933,\n" +
            "        37.784147\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6177663\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Sundance Kabuki Cinemas\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6177663\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.432682,\n" +
            "        37.785191\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"502562\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Cable Car Museum, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"502562\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.411465,\n" +
            "        37.794673\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6177656\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Kaiser Permanente Medical Center\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6177656\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.442217,\n" +
            "        37.782066\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"502560\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Twin Peaks, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"502560\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.448764,\n" +
            "        37.750833\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"502569\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"TransAmerica Pyramid, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"502569\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.403274,\n" +
            "        37.795373\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155372\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Marsh Theater, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155372\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.42101,\n" +
            "        37.7558\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6063213\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Randall Museum, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6063213\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.438566,\n" +
            "        37.764231\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6177642\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Yerba Buena Center for the Arts\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6177642\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.400873,\n" +
            "        37.784691\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6063201\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"San Francisco Museum of Modern Art\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6063201\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.401165,\n" +
            "        37.785639\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155488\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Society of California Pioneers, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155488\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.401,\n" +
            "        37.78189\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"502586\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"University of San Francisco\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"502586\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.449332,\n" +
            "        37.778517\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6151906\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Academy of Art University, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6151906\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.400828,\n" +
            "        37.787721\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6227871\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Full House House\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6227871\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.441808,\n" +
            "        37.786351\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"507468\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Washington Square\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"507468\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.409657,\n" +
            "        37.801197\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"507466\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Buena Vista Park, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"507466\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.441533,\n" +
            "        37.76778\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"507476\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Alamo Square\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"507476\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.433357,\n" +
            "        37.776498\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6176778\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Fishermans Wharf Cable Car Turnaround\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6176778\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.421199,\n" +
            "        37.807111\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155657\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Yerba Buena Ice Skating Center\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155657\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.40042,\n" +
            "        37.78261\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155400\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Painted Ladies, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155400\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.43296,\n" +
            "        37.77623\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"507473\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Lafayette Park, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"507473\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.4276,\n" +
            "        37.79161\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155397\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"San Francisco Zen Center\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155397\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.42596,\n" +
            "        37.77363\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155068\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Castro Theatre\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155068\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.43509,\n" +
            "        37.76201\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6199613\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Crocker Galleria, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6199613\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.40284,\n" +
            "        37.789056\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155064\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"California Historical Society\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155064\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.40153,\n" +
            "        37.78664\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155192\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"GLBT History Museum, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155192\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.43563,\n" +
            "        37.76085\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155572\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Telephone Pioneers Communication Museum, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155572\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.39983,\n" +
            "        37.78688\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155319\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Museum of the African Diaspora\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155319\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.40158,\n" +
            "        37.78658\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155695\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Balmy Alley\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155695\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.41239,\n" +
            "        37.75186\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6151470\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Ripley's Believe It Or Not Museum\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6151470\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.41548,\n" +
            "        37.8083\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6069417\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Harvey Milk Plaza\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6069417\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.429109,\n" +
            "        37.767594\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155562\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Sutro Tower\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155562\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.45265,\n" +
            "        37.75534\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6069415\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Yerba Buena Center for the Performing Arts\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6069415\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.401616,\n" +
            "        37.78274\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6069409\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Old St. Mary's Cathedral, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6069409\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.405489,\n" +
            "        37.792367\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155299\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Konko Church of San Francisco, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155299\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.42904,\n" +
            "        37.78759\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6069411\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"San Francisco Art Institute, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6069411\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.417114,\n" +
            "        37.803291\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6192733\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"The Cannery at Del Monte Square, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6192733\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.419597,\n" +
            "        37.806838\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155486\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Balclutha, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155486\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.41502,\n" +
            "        37.80878\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"508803\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Golden Gate Bridge, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"508803\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.477388,\n" +
            "        37.808835\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155610\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"National Shrine of Saint Francis of Assisi\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155610\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.40765,\n" +
            "        37.79872\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6065749\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Musee Mecanique\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6065749\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.41779,\n" +
            "        37.810106\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155596\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"The Beat Museum\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155596\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.40611,\n" +
            "        37.79796\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155214\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Kong Chow Temple, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155214\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.40785,\n" +
            "        37.79381\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155208\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Jefferson Airplane House\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155208\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.45651,\n" +
            "        37.77452\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6227786\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Ride the Ducks San Francisco\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6227786\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.415773,\n" +
            "        37.808098\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6209483\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Red and White Fleet at Pier 43 and a Half\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6209483\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.415066,\n" +
            "        37.809171\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"502558\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Presidio of San Francisco\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"502558\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.46724,\n" +
            "        37.79965\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155204\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Holy Virgin Cathedral\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155204\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.48619,\n" +
            "        37.78005\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155206\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Hyde Street Pier\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155206\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.42074,\n" +
            "        37.80767\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6065729\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Baker Beach\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6065729\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.48271,\n" +
            "        37.795475\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155072\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"China Beach\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155072\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.49074,\n" +
            "        37.78715\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155712\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Walter S. Johnson Park, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155712\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.44693,\n" +
            "        37.80329\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155074\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Chinese Historical Society of America, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155074\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.40891,\n" +
            "        37.79393\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155647\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Wells Fargo History Museum\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155647\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.4028,\n" +
            "        37.79312\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"502564\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Palace of Fine Arts, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"502564\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.450062,\n" +
            "        37.803706\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155640\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Walt Disney Family Museum\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155640\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.45831,\n" +
            "        37.80117\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155637\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"USS Pampanito, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155637\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.41502,\n" +
            "        37.80878\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155380\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Pacific Heritage Museum of San Francisco\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155380\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.40332,\n" +
            "        37.79418\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155761\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Winery Collective\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155761\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.42035,\n" +
            "        37.80765\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6151539\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"San Francisco Botanical Garden, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6151539\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.46643,\n" +
            "        37.76593\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6063219\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"California Palace of the Legion of Honor\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6063219\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.500123,\n" +
            "        37.784987\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155629\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Tin How Temple\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155629\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.40674,\n" +
            "        37.79382\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6151535\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"California Academy of Sciences\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6151535\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.46678,\n" +
            "        37.77027\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6063211\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Natural World Museum\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6063211\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.461081,\n" +
            "        37.798709\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155492\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Saints Peter and Paul Church\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155492\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.41013,\n" +
            "        37.80129\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6063205\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Japanese Tea Garden, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6063205\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.46941,\n" +
            "        37.77005\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155622\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Wax Museum at Fisherman's Wharf, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155622\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.41479,\n" +
            "        37.80834\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6151904\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"University of California San Francisco\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6151904\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.45855,\n" +
            "        37.76329\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155490\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"SS Jeremiah O'Brien\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155490\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.41502,\n" +
            "        37.80878\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6063203\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"De Young Museum, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6063203\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.468097,\n" +
            "        37.771325\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155154\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Crissy Field\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155154\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.45042,\n" +
            "        37.80609\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"507464\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Golden Gate Park, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"507464\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.47735,\n" +
            "        37.76549\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155150\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Club Fugazi, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155150\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.41022,\n" +
            "        37.79944\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"507483\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Lincoln Park\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"507483\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.50028,\n" +
            "        37.78567\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155138\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"City Lights Booksellers\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155138\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.4064,\n" +
            "        37.79771\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155325\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Norras Temple\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155325\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.40686,\n" +
            "        37.79441\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155327\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"North Beach Museum\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155327\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.40892,\n" +
            "        37.79913\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155198\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Grateful Dead House, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155198\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.44671,\n" +
            "        37.76887\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155707\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"San Francisco National Cemetary\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155707\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.46166,\n" +
            "        37.80111\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6176694\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Presidio Theater, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6176694\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.44188,\n" +
            "        37.800097\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155062\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Buddha's Universal Church\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155062\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.40531,\n" +
            "        37.79535\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155184\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Ferryboat Eureka, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155184\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.42139,\n" +
            "        37.80921\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155565\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Tattoo Art Museum, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155565\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.41324,\n" +
            "        37.80239\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6069421\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Fort Point National Historical Site, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6069421\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.475114,\n" +
            "        37.807733\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6069423\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Gould Theater, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6069423\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.500021,\n" +
            "        37.785046\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6069419\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Conservatory of Flowers\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6069419\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.460222,\n" +
            "        37.772335\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155484\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"SF Playhouse, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155484\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.40915,\n" +
            "        37.78918\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6065751\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Cathedral of Saint Mary of the Assumption\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6065751\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.425547,\n" +
            "        37.784783\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155212\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Kezar Stadium\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155212\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.45424,\n" +
            "        37.76695\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"502549\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"San Francisco City Hall\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"502549\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.419887,\n" +
            "        37.779225\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155598\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Flood Building\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155598\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.40723,\n" +
            "        37.78464\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6065733\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"American Conservatory Theater\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6065733\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.410226,\n" +
            "        37.787085\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155591\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Alcove Theater\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155591\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.4099,\n" +
            "        37.78742\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6151549\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Westfield Metreon\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6151549\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.40423,\n" +
            "        37.78456\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6132601\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Civic Center Plaza, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6132601\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.41841,\n" +
            "        37.77939\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155642\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Warfield Theater\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155642\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.41004,\n" +
            "        37.78244\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6177654\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"California State Building\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6177654\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.420401,\n" +
            "        37.780095\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6132597\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"San Francisco Federal Building\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6132597\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.41109,\n" +
            "        37.77936\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6177652\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Orpheum Theater, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6177652\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.414516,\n" +
            "        37.77899\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"502573\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"War Memorial Opera House\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"502573\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.420236,\n" +
            "        37.778652\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155633\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Un-Scripted Theater Company\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155633\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.40919,\n" +
            "        37.78917\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155376\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"San Francisco Mint, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155376\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.40683,\n" +
            "        37.78302\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6176750\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Powell and Market Cable Car Turnaround\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6176750\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.407684,\n" +
            "        37.784803\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6132591\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Westfield San Francisco Center Shopping Mall\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6132591\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.4077,\n" +
            "        37.78431\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155368\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Marines Memorial Theater\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155368\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.41058,\n" +
            "        37.78897\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155370\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Marrakech Magic Theater, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155370\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.41182,\n" +
            "        37.78597\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6063207\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Asian Art Museum of San Francisco, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6063207\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.418627,\n" +
            "        37.780781\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155544\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"San Francisco Public Library, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155544\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.41666,\n" +
            "        37.77898\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155412\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Presidio Golf Course, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155412\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.459641,\n" +
            "        37.79062\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155156\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Defenestration Building\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155156\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.40718,\n" +
            "        37.77975\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155536\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Intersection for the Arts\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155536\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.40658,\n" +
            "        37.78265\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6177680\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"United Nations Plaza, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6177680\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.415094,\n" +
            "        37.7798\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6203150\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"77 Geary Galleries, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6203150\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.40473,\n" +
            "        37.78785\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155406\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Pioneer's Monument, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155406\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.41592,\n" +
            "        37.77971\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155530\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"International Art Museum of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155530\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.41091,\n" +
            "        37.78174\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"507472\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Union Square, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"507472\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.407509,\n" +
            "        37.787872\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155654\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Yerba Buena Gardens\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155654\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.402985,\n" +
            "        37.785406\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155651\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Xanadu Gallery\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155651\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.40585,\n" +
            "        37.78814\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155709\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"San Francisco Visitor's Center\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155709\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.408,\n" +
            "        37.78405\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155196\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Golden Gate Theatre\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155196\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.41059,\n" +
            "        37.78245\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155070\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Children's Creativity Museum, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155070\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.40232,\n" +
            "        37.78304\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155321\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Kimball Natural History Museum\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155321\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.4668,\n" +
            "        37.77027\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155704\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"National AIDS Memorial Grove\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155704\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.46034,\n" +
            "        37.7697\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155323\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Neptune Society Columbarium, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155323\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.45705,\n" +
            "        37.78036\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155194\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Glide Memorial United Methodist Church\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155194\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.41146,\n" +
            "        37.78504\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6227896\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Circus Center\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6227896\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.457022,\n" +
            "        37.765861\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155317\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Museum of Craft and Folk Art, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155317\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.40405,\n" +
            "        37.78555\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155574\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Congregation Emanu-El, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155574\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.45965,\n" +
            "        37.78691\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155057\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Bill Graham Civic Auditorium, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155057\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.41752,\n" +
            "        37.77858\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155313\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Morrison Planetarium, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155313\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.46672,\n" +
            "        37.77031\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155052\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Audium\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155052\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.42394,\n" +
            "        37.78824\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155305\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Lorraine Hansberry Theatre\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155305\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.41349,\n" +
            "        37.78838\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6069413\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Grace Cathedral\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6069413\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.412871,\n" +
            "        37.791897\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155303\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Lincoln Park Golf Club, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155303\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.49463,\n" +
            "        37.78172\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155559\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Steinhart Aquarium\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155559\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.46678,\n" +
            "        37.77029\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155169\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"San Francisco Magic Parlor\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155169\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.40847,\n" +
            "        37.78863\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155612\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Wave Organ\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155612\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.44026,\n" +
            "        37.80856\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6151545\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Ghirardelli Square\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6151545\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.42204,\n" +
            "        37.80561\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6227863\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Mission Dolores Park, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6227863\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.426024,\n" +
            "        37.759821\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155188\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Fort Mason\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155188\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.42681,\n" +
            "        37.80427\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155409\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Presidio Army Museum\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155409\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.43131,\n" +
            "        37.80654\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6065745\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Mexican Museum, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6065745\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.432794,\n" +
            "        37.80004\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6063217\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Louise Davies Symphony Hall, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6063217\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.4198,\n" +
            "        37.77788\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155539\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"San Francisco Maritime National Historical Park\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155539\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.42155,\n" +
            "        37.80659\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155315\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Museo Italo Americano, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155315\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.43067,\n" +
            "        37.80652\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155055\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Bay Area Theatresports, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155055\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.43159,\n" +
            "        37.80633\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155374\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Feusier Octagon House\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155374\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.42721,\n" +
            "        37.79782\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155465\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"San Francisco Maritime Museum\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155465\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.42385,\n" +
            "        37.80629\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155048\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Anchor Brewing Company\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155048\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.401,\n" +
            "        37.76359\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155307\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Magic Theatre\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155307\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.43061,\n" +
            "        37.80652\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6132613\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Concourse Exhibit Center\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6132613\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.40509,\n" +
            "        37.77105\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6227847\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"St. Patrick Catholic Church, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6227847\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.403311,\n" +
            "        37.785305\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6265863\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"SFJAZZ Center\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6265863\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.421234,\n" +
            "        37.776159\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6227910\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"SHN Curran Theatre, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6227910\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.410585,\n" +
            "        37.787077\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155364\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Marina Green\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155364\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.43914,\n" +
            "        37.80695\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6227876\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Mrs. Doubtfire House\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6227876\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.436576,\n" +
            "        37.79411\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6151552\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"New Conservatory Theater Center\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6151552\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.4193,\n" +
            "        37.77544\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6176707\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Aquatic Park\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6176707\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.425931,\n" +
            "        37.806919\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155200\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Haas-Lilienthal House, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155200\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.4246,\n" +
            "        37.79332\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"6155042\",\n" +
            "    \"type\": \"point_of_interest\",\n" +
            "    \"name\": \"Allyne Park, San Francisco, California, United States of America\",\n" +
            "    \"source\": {\n" +
            "      \"srcId\": \"6155042\",\n" +
            "      \"systemId\": 300\n" +
            "    },\n" +
            "    \"position\": {\n" +
            "      \"type\": \"Point\",\n" +
            "      \"coordinates\": [\n" +
            "        -122.42715,\n" +
            "        37.79751\n" +
            "      ]\n" +
            "    },\n" +
            "    \"status\": \"active\"\n" +
            "  }\n" +
            "]";

}
