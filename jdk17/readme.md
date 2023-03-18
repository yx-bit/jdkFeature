#改进的NullPointerExceptions（jdk14）
https://openjdk.org/jeps/358
准确描述哪个变量为空
更明显的错误提示

#文字块（jdk15）
https://openjdk.org/jeps/378
避免大多数转义、换行、拼接操作
在需要的时候让开发人员控制格式
使用方式
"""
0 \s保持原格式
"""

#instanceof模式匹配（jdk16）
https://openjdk.org/jeps/394
解决了强壮新能的无意义匹配
jdk16 之前
if（apple instanceof Apple）
{
Apple a=(Apple)apple;
a.exec();
}
jdk16
if（apple instanceof Apple a）{
 a.exec();
}


#档案类（jdk16）
https://openjdk.org/jeps/395

使用record关键字解决get set equals toString的问题

被record修饰的字节码类会被final修饰（注意）

#封闭类（jdk16）
https://openjdk.org/jeps/397
在可扩展性上实现更细粒度的控制

sealed 指定哪个类为封闭类
必须配合permits使用，指定允许哪个类来继承
子类需为final的才满足sealed的使用条件，或者再次sealed或者使用non-sealed


#switch表达式优化（jdk16）
https://openjdk.org/jeps/361

switch多case
升级为
switch(level)
case 1-> name="1"
case 2,3-> name="2"
default->name="1"
或者
var name=switch(level){
case 1->{
 yield "1";
}
default->"2";
}
去掉无意义的break语句

#简单的web服务器（jdk16）
https://openjdk.org/jeps/408
原型设计、临时编码、测试目的、简单文件服务器
jwebserver命令
-d 指定目录 默认当前目录
-p 指定端口
-o 日志级别

#JVM的升级
统一的JVM日志
并行全垃圾回收期G1取代CMS设置为默认垃圾收集器
统一的垃圾回收接口
基于Java的实验性JIT编译期
Epsilon：低开销垃圾回收器
低开销的Heap Profiling
ZGC：可伸缩低延迟垃圾收集器
MIcrobenchmark测试套件
G1的可终端mixed GC
Shenandoah：低暂停时间垃圾收集器

