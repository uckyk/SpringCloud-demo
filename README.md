# SpringCloud-demo
Spring Cloud Sleuth 方式接入zipkin


http2zipkin分支   sleuth方式 对接zipkin以Http 方式上报 demo
kafka2zipkin分支  sleuth方式 对接zipkin以kafka方式上报 demo
操作步骤：

1、启动本地zipkin, 对应url+端口： http://localhost:9411

3、启动 web-1, 对应位置为：com.provider.test.ProviderTest 的 main 方法

4、启动 web-2, 对应位置为：com.consumer.test.ConsumerTest 的 main 方法

5、完成

（如果要是kafka 需要先对zipkin 做好配置）

(web-1 调用 web-1 再调用web-2)
