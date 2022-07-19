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
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import LoginDataSource.LoginParams;

public class ParamDataTestPlus {
    @Test
    @Parameters({"name","pwd","result"})
    public void LoginTestFuntion1(String Login_name,String Login_pwd,String Login_result){
        ParamData login = new ParamData();
        String results = login.UserLogin(Login_name, Login_pwd);
        Assert.assertEquals(results, Login_result);
    }

    @Test(dataProvider = "getUsers",dataProviderClass = LoginParams.class)
    public void LoginTestFuntion2(String Login_name,String Login_pwd,String Login_result){
        ParamData login = new ParamData();
        String results = login.UserLogin(Login_name, Login_pwd);
        Assert.assertEquals(results, Login_result);
    }
}
