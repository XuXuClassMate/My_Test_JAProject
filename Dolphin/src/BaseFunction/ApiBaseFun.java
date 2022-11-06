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
import okhttp3.*;
import java.io.IOException;

public class ApiBaseFun {
    final OkHttpClient client = new OkHttpClient();
    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    public static final MediaType From = MediaType.get("application/x-www-form-urlencoded");
    public String Get(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }
//    header
//    Connection:keep-alive
//    Content-Type:application/json;charset=UTF-8
//    Cookie:sessionId={{session_id}}; JSESSIONID={{JSESSIONID}}; language=zh_CN
    public String Post_json(String url,String json) throws IOException {
        RequestBody body = RequestBody.create(json, JSON);

        Request request = new Request.Builder()
                .url(url).addHeader("Connection","keep-alive")
                .addHeader("Content-Type","application/json;charset=UTF-8").post(body)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }
    public String Post_form(String url,String form) throws IOException {
        RequestBody form1 = RequestBody.create(form,From);
        Request request = new Request.Builder()
                .url(url).addHeader("Connection","keep-alive")
                .addHeader("Accept"," application/json, text/plain, */*")
                .post(form1)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }
}


