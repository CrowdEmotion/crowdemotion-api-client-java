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
import io.swagger.client.model.Metric;
import io.swagger.client.model.MetricCreation;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MetricApi
 */
public class MetricApiTest {

    private final MetricApi api = new MetricApi();

    
    /**
     * List all registered metrics
     *
     * &lt;p&gt;Metrics are linked to time-series and define their meaning.&lt;/p&gt; &lt;p&gt;Common metric ID are listed below:&lt;/p&gt; &lt;table&gt;   &lt;tr&gt;&lt;td&gt;id&lt;/td&gt;&lt;td&gt;Value&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;1&lt;/td&gt;&lt;td&gt;Timestamp&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;2&lt;/td&gt;&lt;td&gt;Neutral&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;3&lt;/td&gt;&lt;td&gt;Happiness&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;4&lt;/td&gt;&lt;td&gt;Surprise&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;5&lt;/td&gt;&lt;td&gt;Puzzlement&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;6&lt;/td&gt;&lt;td&gt;Disgust&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;7&lt;/td&gt;&lt;td&gt;Fear&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;8&lt;/td&gt;&lt;td&gt;Sadness&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✗ Respondent ✗ Customer ✓ Manager&lt;/p&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void metricGetTest() throws ApiException {
        Integer skip = null;
        Integer limit = null;
        String where = null;
        String sort = null;
        // List<Metric> response = api.metricGet(skip, limit, where, sort);

        // TODO: test validations
    }
    
    /**
     * Delete a Metric
     *
     * &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✗ Respondent ✗ Customer ✓ Manager&lt;/p&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void metricMetricIdDeleteTest() throws ApiException {
        Integer metricId = null;
        // Metric response = api.metricMetricIdDelete(metricId);

        // TODO: test validations
    }
    
    /**
     * Find a Metric
     *
     * &lt;p&gt;Metrics are linked to time-series and define their meaning.&lt;/p&gt; &lt;p&gt;Common metric ID are listed below:&lt;/p&gt; &lt;table&gt;   &lt;tr&gt;&lt;td&gt;id&lt;/td&gt;&lt;td&gt;Value&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;1&lt;/td&gt;&lt;td&gt;Timestamp&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;2&lt;/td&gt;&lt;td&gt;Neutral&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;3&lt;/td&gt;&lt;td&gt;Happiness&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;4&lt;/td&gt;&lt;td&gt;Surprise&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;5&lt;/td&gt;&lt;td&gt;Puzzlement&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;6&lt;/td&gt;&lt;td&gt;Disgust&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;7&lt;/td&gt;&lt;td&gt;Fear&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;8&lt;/td&gt;&lt;td&gt;Sadness&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✗ Respondent ✗ Customer ✓ Manager&lt;/p&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void metricMetricIdGetTest() throws ApiException {
        Integer metricId = null;
        // Metric response = api.metricMetricIdGet(metricId);

        // TODO: test validations
    }
    
    /**
     * Create Metric
     *
     * &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✗ Respondent ✗ Customer ✓ Manager&lt;/p&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void metricPostTest() throws ApiException {
        MetricCreation body = null;
        // Metric response = api.metricPost(body);

        // TODO: test validations
    }
    
}
