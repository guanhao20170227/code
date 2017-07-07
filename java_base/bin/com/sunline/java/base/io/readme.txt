
java io 主要有 5 个重要的类库 ：

1,File 新建文件与文件夹 ，删除文件域文件夹,修改名字
2,Reader 字符流 读入
3,Writer 字符流 输出
4,InputStream 字节流 输入流
5,OutputStream 字节流输出流  

总结的有： 
1,InputStreamReader ,OutputStreamWriter 可以用于指定编码格式，用于处理乱码问题
2,文件读取时，相对路径的写法：FileWriter fw = new FileWriter("config/txt/abcd_bak.txt");
(Config 是 source folder)

实例：

代码路径 ： I:\develop\gongsi_changliang\workSpace\justForTest\java_base\src\com\sunline\java\base\io
github 上代码路径：
1,5个文件分别测试，

2，导出 Excel