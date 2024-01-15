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
