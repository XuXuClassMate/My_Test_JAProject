/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package BaseFunction;
import groovy.util.logging.Slf4j;
import okhttp3.*;
import java.io.IOException;
@Slf4j
public class ApiBaseFun {
    final OkHttpClient client = new OkHttpClient();
    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    public static final MediaType From = MediaType.get("application/x-www-form-urlencoded");
    public static String SessionId = null;
    public static String Base_Url = null;
    /*
    Base Demo:http://www.xuxuclassmate.xyz:12345/dolphinscheduler
     */
    public String login(String Base_url, String userName, String Password) throws IOException {
        //login is gettoken;
        Base_Url =Base_url;
        String path = "/login";
        String form = "userName=" + userName + "&userPassword=" + Password;
        RequestBody form1 = RequestBody.create(form, From);
        Request request = new Request.Builder()
                .url(Base_Url+path).addHeader("Connection", "keep-alive")
                .addHeader("Accept", " application/json, text/plain, */*")
                .addHeader("language","zh_CN")
                .post(form1)
                .build();
        Response result =client.newCall(request).execute();
        String message = result.body().string();
        return message;
    }

    public Response Get(String path) throws IOException {
        Request request = new Request.Builder()
                .url(Base_Url+path)
                .addHeader("Connection", "keep-alive")
                .addHeader("Content-Type", "application/json;charset=UTF-8")
                .addHeader("sessionId",SessionId)
                .addHeader("language","zh_CN")
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response;
        }
    }
    public Response Post_json(String path, String json) throws IOException {
        RequestBody body = RequestBody.create(json, JSON);
        Request request = new Request.Builder()
                .url(Base_Url+path)
                .addHeader("Connection", "keep-alive")
                .addHeader("Content-Type", "application/json;charset=UTF-8")
                .addHeader("sessionId",SessionId)
                .addHeader("language","zh_CN")
                .post(body)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response;
        }
    }
    public Response Post_form(String path, String form) throws IOException {
        RequestBody form1 = RequestBody.create(form, From);
        Request request = new Request.Builder()
                .url(Base_Url+path).addHeader("Connection", "keep-alive")
                .addHeader("Accept", " application/json, text/plain, */*")
                .addHeader("sessionId",SessionId)
                .addHeader("language","zh_CN")
                .post(form1)
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response;
        }
    }
}


