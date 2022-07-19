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

package TestNgStudy;

public class ParamDataTest {
    public static boolean isLogin=false;

    /**
     * 模拟用户登录校验方法
     * @param name 用户名
     * @param pwd 密码
     * @return 登录返回信息
     */
    public String UserLogin(String name, String pwd) {
        if (name == null || name.equals("") || pwd == null || pwd.equals("")) {
            System.out.println("用户名或密码为空");
            isLogin = false;
            return "用户名或密码不能为空";
        } else if (name == "admin" || name.equals("admin")) {
            System.out.println("管理员");
            isLogin = true;
            return "欢迎管理员";
        } else {
            System.out.println("正常用户");
            isLogin = true;
            return "欢迎" + name;
        }

    }

    public static void main(String[] args) {
        ParamDataTest login=new ParamDataTest();
        login.UserLogin("admin"," ");
    }

}
