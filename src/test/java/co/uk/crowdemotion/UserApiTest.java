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
import io.swagger.client.model.User;
import io.swagger.client.model.UserUpdateBody;
import io.swagger.client.model.LoginResponse;
import io.swagger.client.model.Login;
import io.swagger.client.model.UserMetadataResponse;
import io.swagger.client.model.UserMetadata;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
public class UserApiTest {

    private final UserApi api = new UserApi();

    
    /**
     * Get User information
     *
     * &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✗ Customer ✓ Manager&lt;/p&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userIdGetTest() throws ApiException {
        Integer id = null;
        // User response = api.userIdGet(id);

        // TODO: test validations
    }
    
    /**
     * Edit User information
     *
     * &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✗ Respondent ✗ Customer ✓ Manager&lt;/p&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userIdPutTest() throws ApiException {
        String id = null;
        UserUpdateBody body = null;
        // User response = api.userIdPut(id, body);

        // TODO: test validations
    }
    
    /**
     * User Login
     *
     * &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; No authorization is required&lt;/p&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userLoginPostTest() throws ApiException {
        Login body = null;
        // LoginResponse response = api.userLoginPost(body);

        // TODO: test validations
    }
    
    /**
     * Find User metadata
     *
     * &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✗ Customer ✓ Manager&lt;/p&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userUserIdMetadataGetTest() throws ApiException {
        Integer userId = null;
        // UserMetadataResponse response = api.userUserIdMetadataGet(userId);

        // TODO: test validations
    }
    
    /**
     * Add user metadata
     *
     * &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✗ Customer ✓ Manager&lt;/p&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userUserIdMetadataPostTest() throws ApiException {
        Integer userId = null;
        UserMetadata body = null;
        // UserMetadataResponse response = api.userUserIdMetadataPost(userId, body);

        // TODO: test validations
    }
    
}
