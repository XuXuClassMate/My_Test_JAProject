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

package com.work.weixin;

public class WeworkConfig {
    public static String corpid="ww2ef8a1f13d444dfd";
    public static String corpsecret="0FzKHtapsva-Uyk8WCURTXE3sXhq6zGsFCg6Yx0BGlU";


    private static WeworkConfig weworkConfig;

    static WeworkConfig getInstance() {
        if (weworkConfig == null) {
            weworkConfig = new WeworkConfig();
        }
        return weworkConfig;
    }

    public static void load(String path) {
        //todo: read from yaml or json
    }
}
