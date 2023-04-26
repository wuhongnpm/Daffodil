### 技术栈
* 标准的前后端分离开发模式, 后端技术栈: Spring Boot .前端技术栈: Vue3.2 + Vue-Router4 + Pinia + Vant4 + Less + Vite4 + Axios
* 项目开发流程: 环境搭建(前后端) --> Vue脚手架创建模板 --> 登录模块设计 --> 首页功能实现 -->搜索功能实现(关键字+分类) -->商品模块页面实现 -->购物车页面实现 -->收货地址功能 -->订单确认模块 -->订单流程功能 -->项目打包部署上线
* 线上商城项目，功能模块包括：登录认证模块、首页商品推荐模块、商品分类模块、商品搜索模块、购物车模块、下单模块、收货地址管理模块、订单管理模块等。
* Angular和Vue通过模板的形式开发页面,需解析模板,React使用JSX语法,无需解析模板,解析JS更快一些.
* 注意最新的 Vite 4.x 构建项目、通过 postcss-px-to-viewport 实现移动端不同分辨率的适配、集成 Vant 移动端 UI 组件库、引进阿里妈妈的 iconfont 创建属于自己的字体图标库、 axios 网络请求库二次封装、 Vue-Router 原理的讲解、 Pinia 全局状态管理等等技术。
* 将项目部署到真实服务器上，通过 pm2 做进程守护， Nginx 转发代理。大厂的运维和部署项目这块


### 前后端分离
* 早期Java Web项目,选择JSP+Servlet来进行前端视图和后端业务逻辑,视图层和控制层由JSP页面实现,没有分离.
* MVC开发模式: 常用框架组合Spring + Struts/Spring MVC + Hibernate/Mybatis等. Model + View +Controller 即模型+视图+控制器.
* 后端专注控制层(RESTFUL API),服务层,数据访问层. 前端专注前端控制层,视图层.



### Question
* 在mapper文件中传参使用${}方法,解析参数和执行SQL语句,存在SQL注入的危险,需改为#{}进行参数分析,#{}是预编译处理,解析再字符替换.${}是字符串直接替换.

* 001: mvn spring-boot:run并执行该命令即可启动项目

* Lombok项目是第三方的Jav工具库,自动插入编辑器和构建工具.

### 打包/运行
* 使用Maven命令将项目打包,执行命令: mvn clean package -Ruidu.test.skip=true  (2)打包成功后,进入target目录,cd target  (3)启动Jar包: java -jar Ruidu-0.0.1-SNAPSHOT.ja
* (1)直接右上角运行. (2) 命令行输入 mvn spring-boot:run

### Swagger
* 账号：admin 密码：123456
* Swagger版本3.0 接口文档地址: BASE_URL + /swagger-ui/index.html


