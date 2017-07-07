1,网络编程：

TCP: 传输控制协议的缩写，它保障两个应用程序之间的可靠通信，像电话一个打一个接，用于互联网协议
UDP :用户数据报协议，一个无连接的 协议，像广播，发射信号后，不一定会有人接受到了，提供程序之间的发送 的数据包

Socket 编程 ： 例子： http://www.cnblogs.com/lichenwei/p/4069432.html

  socket 编程过程：(两台计算机建立通信机制时，连接会出现的情况)
  1，服务器实例化一个 ServerSocket 对象，表示通过服务器端口通信；
  2，服务器调用 ServerSocket.accept() 方法 ，该方法一直等待直到客服端连接欸到服务器上的端口；
  3，服务器等待时，一个客服端实例化 一个 socket 对象，指定服务器的名称与端口来请求连接；
  4，Socket 类的构造器视图将客服端连接到指定的服务器与端口号，如果通信被建立，则在客服端创建一个
    socket 对象与服务器通信；
  5，在服务器段 accept() 方法返回一个新的 socket 引用，该 socket 连接到客服端的 socket 

URL 处理 ： http://www.runoob.com/java/java-url-processing.html
