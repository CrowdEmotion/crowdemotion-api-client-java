/**
 * CloudEmotion API v1
 * CrowdEmotion API
 *
 * OpenAPI spec version: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package co.uk.crowdemotion;

import co.uk.crowdemotion.ApiException;
import io.swagger.client.model.Timeseries;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TimeseriesApi
 */
public class TimeseriesApiTest {

    private final TimeseriesApi api = new TimeseriesApi();

    
    /**
     * Delete a Timeseries
     *
     * &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✗ Respondent ✗ Customer ✓ Manager&lt;/p&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void timeseriesDeleteTest() throws ApiException {
        Integer responseId = null;
        Integer metricId = null;
        // String response = api.timeseriesDelete(responseId, metricId);

        // TODO: test validations
    }
    
    /**
     * Get all recorded timeseries for a Response
     *
     * &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✗ Customer ✓ Manager&lt;/p&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void timeseriesGetTest() throws ApiException {
        Integer responseId = null;
        Integer metricId = null;
        Boolean normalize = null;
        String format = null;
        // List<Timeseries> response = api.timeseriesGet(responseId, metricId, normalize, format);

        // TODO: test validations
    }
    
}