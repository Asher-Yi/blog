# 01
JDK17 LTS 下载地址：sun.oracle.com 

[JShell](https://docs.oracle.com/en/java/javase/17/jshell/introduction-jshell.html#GUID-DA9FA090-7015-4F30-BBD0-5F6ED0EBDF91") since JDK9
  ```shell
  jshell
  /help intro
  /help
  /list
  /list all
  /list start
  /vars
  /exit
```

向上溢出 向下溢出
- overflow MAX_VALUE + 1
- underflow MIN_VALUE - 1

字面整数默认为int类型
+ `int num = Integer.MAX_VALUE + 1` ok
+ `int num = 2147483647 + 1` ok
+ `int num = 2147483648` error
前两个虽然溢出，但int = int + int 合法。
2147483648 超过int最大值，应该声明为long,2147483648L。可以以下划线分开数字:`2_147_483_648`。
此时强转int有问题。
- 赋值给较小范围的数据类型的变量时，需要强转过去，但如果表达式右侧如果都是字面量，编译器会计算值，如果在小范围中，会帮你强转。(不适用于long)
- 如果有变量，则需要运行时才知道值，所以直接报错。

# 02
复合赋值隐含强转`int i = 0; i += 1.5; //(i = (int)(i + 1.5))`

# 03
网站：
- 语言语法规则
- 代码规约

# 04
Java10 var类型变量 自动类型推导

# 05
try(resource){} 带资源关闭的try语句，需要resource实现AutoClose接口

# 06
- jdk /bin下有javac，jre /bin中没有，应该没有jdk是编译不了代码的
- jvm:运行java程序，不同平台有不同的jvm
- jre：jvm+核心类库，可运行开发好的java程序
- jdk：jre+开发工具，包括javac，jar

- ctrl+space 提示 ctrl+shift+enter 补全括号和分号 shift+F6 rename 快捷键可以到help里面，提供pdf
- live templates 缩写->代码块 sout, psvm, fori
- Postfix Completion .sout .var
- Project中包含了java文件，jar包等文件，而module则是功能逻辑上的模块

# 07
- ideavim进入编辑模式后，可以使用idea本来的快捷键
- 多思考，以前一带而过的简单内容现在还能提出很多答不上来的问题，而那些“简单内容”是重要的基础。你不自知，还以为自己想出来的那些就是全部，代码都没敲过几行就以为掌握了，哈哈。
