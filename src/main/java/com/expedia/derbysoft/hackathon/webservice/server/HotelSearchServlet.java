package com.expedia.derbysoft.hackathon.webservice.server;

import com.expedia.derbysoft.hackathon.webservice.dto.HotelSearchRQ;
import com.expedia.derbysoft.hackathon.webservice.dto.HotelSearchRS;
import com.expedia.derbysoft.hackathon.utils.JsonUtils;
import com.expedia.derbysoft.hackathon.webservice.HotelSearchWebService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * Created by zhupan on 12/8/15.
 */
public class HotelSearchServlet extends HttpServlet {

    private HotelSearchWebService hotelSearchWebService = new HotelSearchWebServiceImpl();

    private Log logger = LogFactory.getLog(this.getClass());

    @Override
    protected void doGet(HttpServletRequest httpRequest, HttpServletResponse httpResponse) throws IOException {
        httpResponse.setStatus(HttpServletResponse.SC_OK);
        Map<String, String[]> parameterMap = httpRequest.getParameterMap();
        String responseContent = "Un supported action. Please check your request json data.";
        logger.debug("request parameters:" + parameterMap);
        try {
            if (RequestHelper.isHotelSearchRQ(httpRequest.getRequestURI())) {
                HotelSearchRQ request = new HotelSearchRQ();
                request.setParameterMap(parameterMap);
                HotelSearchRS response = hotelSearchWebService.search(request);
                responseContent = JsonUtils.marshal(response);
            }

        } catch (Exception e) {
            logger.error(e);
            Object response = ResponseHelper.response(e);
            httpResponse.getWriter().println(JsonUtils.marshal(response));
        }
        httpResponse.getWriter().println(responseContent);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}