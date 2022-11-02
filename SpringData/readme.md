# SpringData是起源于2022年8月下旬的Java Boot学习项目.
* resource目录下:有static,templates两个子目录,和一个application.properties文件.
* static目录存放静态资源,如CSS文件,JavaScript文件. 
* Templates目录存放模板引擎页面,如html文件,application.properties文件是Spring Boot项目的配置文件.
* pom.xml是该项目的Maven配置文件.

# 项目
### 该项目技术是什么,解决什么问题,什么场景使用,如何使用,底层原理是什么,替代方案是什么?


##项目技巧
### 快捷键
* 多选快捷键 CTRL + ALT + SHIFT + J

#### 问题1 Cannot resolve symbol 'BASE64Decoder?
* (1)替换原有jar包 import sun.misc.BASE64Encoder;  改为 import org.apache.commons.codec.binary.Base64;
* (2) pom文件中加入的依赖：
  <dependency>
  <groupId>org.apache.directory.studio</groupId>
  <artifactId>org.apache.commons.codec</artifactId>
  <version>1.8</version>
  </dependency>
* (3)替换原来的加密方式和解密方式
*  return new  BASE64Encoder().encode(encrypted);  改为 return Base64.encodeBase64String(encrypted);
*  byte[] encrypted1 = new BASE64Decoder().decodeBuffer(text);  改为 byte[] encrypted =Base64.decodeBase64(text);  