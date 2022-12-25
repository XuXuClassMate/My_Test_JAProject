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

package base;

public class dolphinConfig {
    public String userName= "admin";
    public String passWord = "dolphinscheduler123";
    public String baseUrl = "http://150.158.189.11:12345/dolphinscheduler";

    private static  dolphinConfig dolphinConfig;
    public static  dolphinConfig getInstance(){
        if (dolphinConfig==null){
            dolphinConfig=new dolphinConfig();
        }
        return dolphinConfig;
    }

    public static void load(String path){
        //todo:read from yaml or json
    }

}
