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

package LoginDataSource;

import org.testng.annotations.DataProvider;

public class LoginParams {
    /**
     * @DataProvider 代表下面这个函数是提供测试数据的
     * 提供用户登录测试数据
     * @return
     */
    @DataProvider
    public Object[][] getUsers(){
        return new Object[][]{
                {"","","用户名或密码不能为空"},
                {"Project","","用户名或密码不能为空"},
                {"", "Project","用户名或密码不能为空"},
                {"","admin","用户名或密码不能为空"},
                {"admin","","用户名或密码不能为空"},
                {"admin","admin","欢迎管理员"},
                {"zhangsan","zhangsan","欢迎zhangsan"}
        };
    }
}
