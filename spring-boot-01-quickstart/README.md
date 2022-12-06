# springboot 入门程序

- 项目搭建
    - 在启动类上加上`@RestController`注解
    - 添加web请求映射的方法（`@RequestMapping`）,输出 Hello World
- 属性配置文件
    - Spring Boot中多环境配置文件名需要满足application-{profile}.properties的格式，
       {profile}对应环境标识
    - 自定义属性加载
        - 使用@PropertySource注解属性文件的位置
        - 使用@Component注解将类注册到容器

# 延伸阅读

