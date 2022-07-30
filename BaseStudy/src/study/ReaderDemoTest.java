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

package study;
import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class ReaderDemoTest {
    /**
     * fileReaderfun.txt start
     * @throws Exception
     * fileReader clone
     */
    @Test
    public void fileReaderfun() throws Exception {
        FileReader files;
        files = new FileReader("/Users/xuxudemac/Desktop/my/Test_Coding_Project/Java/My_Test_JAProject/BaseStudy/source/fileReaderfun.txt");
        System.out.println(files.read());
        files.close();

    }

    /**
     * fileWriterfun.txt start
     * @throws RuntimeException
     *fileWriterfun clone
     */
    @Test
    public void fileWriterfun() throws RuntimeException {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("/Users/xuxudemac/Desktop/my/Test_Coding_Project/Java/My_Test_JAProject/BaseStudy/study/source/fileWriterfun.txt",true);
            // 重写
            fileWriter.write("function writer see~~~");
            // 新增
            fileWriter.append(  "我爱吃火锅、烧烤、凉皮、都爱吃");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }

}
