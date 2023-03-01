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

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class issues extends baseRequest {
    static issues issues = new issues();
    static String dateNowStr = null;
    public String getIuessList(){
        String response = baseRequest.get(baseurl+"/issues")
                .then().statusCode(200).extract().asString();
        api_init();
        return response;
    }

    public static void writefile() throws IOException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd|HH:mm:ss");
        dateNowStr = sdf.format(date);
        String issuesList = issues.getIuessList().toString();
        File file = new File("Github/org.api.github.src/main/resources/" +dateNowStr +".json");
        try (FileWriter fileWriter = new FileWriter(file)) {
            System.out.println(issuesList);
            fileWriter.append(issuesList);
        }
    }
    public static void main(String[] args) throws IOException {
        issues.writefile();
    }
}


