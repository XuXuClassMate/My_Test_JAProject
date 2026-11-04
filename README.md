# My_Test_JAProject
我的测试项目JAVA版

[学习地址](./Introductory_learn/src/study)

- [这是一个可执行的计算器jar包](./Introductory_learn/src/study/Calculator/v1/My_Test_JAProject.jar)

  - [macos系统双击运行文件](./Introductory_learn/src/study/Calculator/v1/macos.command)

  - [windows系统双击运行文件](./Introductory_learn/src/study/Calculator/v1/windows.bat)
- 学习完成后UI界面同步修改

- [UI界面预览](https://xuxuclassmate.github.io/My_Test_JAProject)

## 构建

根目录 `pom.xml` 是 Maven 聚合工程，语言级别是 Java 8，当前纳入构建的模块是 `dolphinscheduler-test-case`。

```bash
mvn -pl dolphinscheduler-test-case test
```

这个模块里的接口测试会访问外部服务。本机没有对应环境时，测试失败不代表工程无法编译。计算器示例不走这条 Maven 构建，按上面的脚本直接运行附带的 jar。
