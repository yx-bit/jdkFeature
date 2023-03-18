#局部变量推导（jdk10）
https://openjdk.org/jeps/286
var 代替局部变量声明
省略不必要的局部变量类型声明

#简化启动单个源代码文件的方法(jdk11)
只能编译单个文件，作为脚本使用(shebang机制)
https://openjdk.org/jeps/330
jdk11之前
javac
java
或者
jar -c -f test.jat .\Test.class
jdk11
java .\Test.java

作为脚本使用时
头为 #!/usr/local/java --source 17
./Test


