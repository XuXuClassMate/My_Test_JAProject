package basefunction;/*
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

import cn.hutool.core.collection.CollUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import groovy.util.logging.Slf4j;
import okhttp3.*;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Slf4j
public class apibasefun {
    final OkHttpClient client = new OkHttpClient();
    public static final MediaType JSONType = MediaType.get("application/json; charset=utf-8");
    public static final MediaType FromType = MediaType.get("application/x-www-form-urlencoded");
    public static String SessionId = "1e813093-9bea-4052-bfd6-7573497f9d2e";
    public String Base_Url = "http://www.xuxuclassmate.xyz:12345/dolphinscheduler";

    /*
    Base Demo:http://www.xuxuclassmate.xyz:12345/dolphinscheduler
     */
    public String login(String Base_url, String userName, String Password) throws IOException {
        //login is gettoken;
        Base_Url = Base_url;
        String path = "/login";
        String form = "userName=" + userName + "&userPassword=" + Password;
        RequestBody form1 = RequestBody.create(form, FromType);
        Request request = new Request.Builder()
                .url(Base_Url + path).addHeader("Connection", "keep-alive")
                .addHeader("Accept", " application/json, text/plain, */*")
                .addHeader("language", "zh_CN")
                .post(form1)
                .build();
        Response result = client.newCall(request).execute();

        String message = result.body().string();
        SessionId = getJsonValue(message, "data", "sessionId", String.class);
        return SessionId;
    }

    public Response Get(String path) throws IOException {
        Request request = new Request.Builder()
                .url(Base_Url + path)
                .addHeader("Connection", "keep-alive")
                .addHeader("Content-Type", "application/json;charset=UTF-8")
                .addHeader("sessionId", SessionId)
                .addHeader("language", "zh_CN")
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response;
        }
    }

    public Response Post_json(String path, String json) throws IOException {
        RequestBody body = RequestBody.create(json, JSONType);
        Request request = new Request.Builder()
                .url(Base_Url + path)
                .addHeader("Connection", "keep-alive")
                .addHeader("Content-Type", "application/json;charset=UTF-8")
                .addHeader("sessionId", SessionId)
                .addHeader("language", "zh_CN")
                .post(body)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response;
        }
    }

    public Response Post_form(String path, String form) throws IOException {
        RequestBody form1 = RequestBody.create(form, FromType);
        Request request = new Request.Builder()
                .url(Base_Url + path).addHeader("Connection", "keep-alive")
                .addHeader("Accept", " application/json, text/plain, */*")
                .addHeader("sessionId", SessionId)
                .addHeader("language", "zh_CN")
                .post(form1)
                .build();
        System.out.println(request);
        try (Response response = client.newCall(request).execute()) {
            return response;
        }
    }

    public   String postRequest(boolean postMethod, String urlPath, Map<String, String> formMap) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request.Builder requestBuild = new Request.Builder().url(Base_Url + urlPath).addHeader("sessionId", SessionId);
        if (postMethod) {
            FormBody.Builder builder = new FormBody.Builder();
            formMap.forEach(builder::add);
            requestBuild.post(builder.build());
        } else {
            requestBuild.get();
        }
        okhttp3.Request request = requestBuild.build();
        return Objects.requireNonNull(client.newCall(request).execute().body()).string();
    }

//    private static final String RESPONSE_CODE = "code";
//
//    private static final String ROOT_DATA = "data";
//
//    public static final String aaa =  "{\n" +
//            "  \"code\": 0,\n" +
//            "  \"msg\": \"登录成功\",\n" +
//            "  \"failed\": false,\n" +
//            "  \"success\": true,\n" +
//            "  \"data\": {\n" +
//            "    \"sessionId\": \"5749eb19-3cb1-4858-b9f2-336e23b713d8\",\n" +
//            "    \"collect\": [\n" +
//            "      {\n" +
//            "        \"code\": 111,\n" +
//            "        \"name\": \"AAA\"\n" +
//            "      },\n" +
//            "      {\n" +
//            "        \"code\": 222,\n" +
//            "        \"name\": \"BBB\"\n" +
//            "      }\n" +
//            "    ]\n" +
//            "  }\n" +
//            "}";
//
//    public static final String ccc ="{\"code\":0,\"msg\":\"成功\",\"data\":[7494336332608,7494336332609],\"failed\":false,\"success\":true}";
//
//    public static final String ddd="{\n" +
//            "  \"code\": 0,\n" +
//            "  \"msg\": \"登录成功\",\n" +
//            "  \"failed\": false,\n" +
//            "  \"success\": true,\n" +
//            "  \"data\": 111111\n" +
//            "}";
//    public static void main(String[] args) {
//        List<CollectInfo> collectInfos = getJsonList(getJsonValue(aaa, "data","collect", List.class), CollectInfo.class);
//        collectInfos.forEach(info -> System.out.println(info.getName()));
//
//        String sessionId = getJsonValue(aaa, "data","sessionId", String.class);
//        System.out.println(sessionId);
//
//        List codes = getJsonValue(ccc, "data",null, List.class);
//        System.out.println(JSONObject.toJSONString(codes));
//
//        Integer code1 = getJsonValue(ddd, "data",null, Integer.class);
//        System.out.println(code1);
//
//        Integer code2 = getJsonValue(ddd, "code",null, Integer.class);
//        System.out.println(code2);
//
//        Boolean code3 = getJsonValue(ddd, "success",null, Boolean.class);
//        System.out.println(code3);
//
//    }
//

    // get dataInfo from getSpecial()
    private static <T> List<T> getJsonList(List list, Class<T> aClass) {
        return JSONObject.parseArray(JSON.toJSONString(list), aClass);
    }

    private static <T> T getJsonValue(String response, String rootFiled, String dataFiled, Class<T> filedClass) {
        Map<String, Object> baseResponseMap = JSON.parseObject(response, new TypeReference<Map<String, Object>>() {
        });
        if (Objects.isNull(baseResponseMap)) {
            return null;
        }
        if (StringUtils.isEmpty(dataFiled)) {
            return JSON.parseObject(JSON.toJSONString(baseResponseMap.get(rootFiled)), filedClass);
        }
        Map<String, Object> dataMap = JSON.parseObject(JSON.toJSONString(baseResponseMap.get(rootFiled)), new TypeReference<Map<String, Object>>() {
        });
        if (CollUtil.isEmpty(dataMap)) {
            return null;
        }
        return JSON.parseObject(JSON.toJSONString(dataMap.get(dataFiled)), filedClass);
    }

}


