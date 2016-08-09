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
import io.swagger.client.model.Research;
import io.swagger.client.model.ResearchCreation;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ResearchApi
 */
public class ResearchApiTest {

    private final ResearchApi api = new ResearchApi();

    
    /**
     * Find all Research
     *
     * &lt;p&gt;Returns all the Research created by an admin user.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✗ Customer ✓ Manager&lt;/p&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void researchGetTest() throws ApiException {
        Integer skip = null;
        Integer limit = null;
        String where = null;
        String sort = null;
        // List<Research> response = api.researchGet(skip, limit, where, sort);

        // TODO: test validations
    }
    
    /**
     * Create a Research Project
     *
     * &lt;p&gt;New research projects can only be created with an admin account.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✗ Respondent ✗ Customer ✓ Manager&lt;/p&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void researchPostTest() throws ApiException {
        ResearchCreation body = null;
        // Research response = api.researchPost(body);

        // TODO: test validations
    }
    
    /**
     * Delete Research Project
     *
     * &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✗ Respondent ✗ Customer ✓ Manager&lt;/p&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void researchResearchIdDeleteTest() throws ApiException {
        Integer researchId = null;
        // String response = api.researchResearchIdDelete(researchId);

        // TODO: test validations
    }
    
    /**
     * Find a Research Project
     *
     * &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✗ Respondent ✗ Customer ✓ Manager&lt;/p&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void researchResearchIdGetTest() throws ApiException {
        Integer researchId = null;
        // Research response = api.researchResearchIdGet(researchId);

        // TODO: test validations
    }
    
    /**
     * Edit Research Project details
     *
     * &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✗ Respondent ✗ Customer ✓ Manager&lt;/p&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void researchResearchIdPutTest() throws ApiException {
        Integer researchId = null;
        ResearchCreation body = null;
        // Research response = api.researchResearchIdPut(researchId, body);

        // TODO: test validations
    }
    
}
