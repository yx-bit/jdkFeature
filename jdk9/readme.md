#模块化的概念
module是在package和jar中间的一层
模块化的优势
1.重构了jre将rt.jar进行了拆分
2.更好的访问控制
3.开发效率的提升（
jre已经没有了，使用jmods分成了多个jmod）也可以把jar打包为jmod文件
4.提升了加载速度（提供了模块化的索引）

maven管理的jar级别的
module管理的是模块级别的


#字符串空间利用率提升（对字符串采用更节省空间的内部表示）
见https://openjdk.org/jeps/254
java8之前使用char数组对数据进行存储
java9使用byte数组对数据进行存储
coder=1 UTF-16  使用两个字节
coder=0 Latin-1字符  使用1个字节

#多版本兼容jar
扩展jar文件格式以允许多个特定于Java发行版的类文件在单个存档中共存
示例操作：
javac --release 8 .\java8\*.java
javac --release 9 .\java9\*.java
jar -c -f test.jar -C java8. --release 9 -C java9 .
java9 jdk运行
java --class-path .\test.jar Test
java8 jdk运行
java --classpath .\test.jar Test

变化
.MF 文件内新加了一个 MULTI-RELEASE = true 字段
jar包文件默认低版本文件，找不到再去找高版本目录的文件

#接口私有方法

java8之前
字段
方法
java8
静态方法 static
默认方法 default（只能实现类访问）
java9
私有方法 private（本类使用）
私有静态方法 private static （static方法使用）

# JShell（交互式脚本语言）
/help 帮助
/list 代码展示
/vars 定义的变量
/methods 定义的方法
/edit n 编辑
/drop n 删除
/save path 导出文件
/open path 导入文件
/history 历史记录（包含命令）
/reload 重新执行
/reset 重置记录
/imports 默认导入的包
/env --class-path path 引入jar包

#增强的try-with-resources

java7之前
try-catch-finally
java7
try-with-resource
java9
可以在外面定义了（变量未变更，等效为final才可以在外面定义）

#语法改进
java9起 _是关键字，不可以作为变量

#Stream & Optional增强 & 集合增强
List.of();创建不可变的集合
Stream.of().takeWhile().toList();等效于filter，匹配变量
Stream.of().dropWhile().toList();删除变量


#G1取代CMS设置为默认垃圾收集器





