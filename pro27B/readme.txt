标识符
数据类型
运算符
程序结构/流程控制

数组

封装：
把所有的属性和方法，用｛｝括起来
class,
new 就是调用构造方法的，
构造方法：和类同名的方法，无需指定返回值类型
static
方法重载---在类中，同名的方法；
this
访问修饰

继承：
父类的所有属性和方法都被子类继承
方法重写---方法要和父类的方法签名完全相同，访问修饰符只能扩大不以缩小
super
实例化子类对象，先自动构造父类对象
父类的引用（变量），能保存子类的对象---向上转型
父类的引用指向子类对象时，不能调用子类扩展（看不到）
所有类的根类，都Object
打印对象时，会自动调用对象的toString()
equals()不重写，用的是Object类的默认实现（比较的是两个对象的地址）



多态(Polymorphism)：可扩展性好---开闭原则
继承
方法重写
父类引用指向子类的对象

抽象类:
abstract修饰的类，为抽象类
抽象类中可以有实现的方法
抽象类不能被实例化
没有方法体的方法是抽象方法,在抽象类中抽象方法需要abstract修饰
含有抽象方法的类一定是抽象类
抽象类中不一定含有抽象方法
一类继承于抽象类，此类“必须”“实现”抽象父类继承下来的抽象方法；
若不实现抽象方法只能自己变成抽象类（但这情况意义不大）

接口：
接口不能实例化
接口中的方法都抽象方法，不可以有实现方法
接口中的方法修饰符默认为public abstract
类实现(implements)接口时，要实现此接口中的“所有的”抽象方法
接口可以继承接口，且可以多继承接口
在java中类单继承多实现
接口中的属性都是公共静态常量--public static final
静态常量规范：所有字母大写,多个单词用_隔开


异常：
可以避免程序突然终止，用户体验很不友好。
try语句块：可能产生异常的代码
如果代码产生异常，会抛出对应异常对象
catch语句块处理，catch括号中的参数为接收（捕捉）对应异常的对象
一个try可以对应多个catch
多个catch顺序从子到父，平级不分顺序
try中不要放多条可能产生异常的代码，
catch参数要是具体类型
finally“不管”是否产生异常，finally语句块都会被执行，一般用作释放资源
return;//相当于方法调用结束，finally会执行
System.exit(0);//退出程序 ，finally不会执行
有try不一定有catch
throw抛出Throwable异常对象
throws用在方法上，向调用处抛出指定的异常类型
 检查异常:  当前try-cacth; 向上继续抛
运行时异常，没要求强制处理异常
自定义异常：继承于Throwable类型的类是异常类；一般自定义异常类去继承RuntimeException
 
集合Collection
解决数组缺点
List&Set
List:有序，可重复
	ArrayList内部实现对象数组,优点访问效率高
	LinkedList内部实现双向链表，删除插入效率
Set:无序，不可重复
TreeSet排序
Map:元素是键-值对;键不可重复



数据库MySql---关系型数据库
mysql.bat
cd C:\Program Files (x86)\MySQL\MySQL Server 5.5\bin
mysql.exe -uroot -proot
-----
select version();
---
#号是注释
show databases;#查看数据库
drop database abc;#删除数据库--此动作很危险
drop database if exists abc;#删除数据库--此动作很危险
create database abd;#创建数据库
use abd;#进入某数据库
select database();#查看当前数据库
create table student(id int primary key auto_increment,name varchar(50),age int);
主键primary key:唯一区分每一条记录
desc student;#查看表结构
insert into student(name,age)values('zs',22),('ls',21);#增加记录insert into
select * from student;#查询表，*表示所有列
select name,age from student;#查询表，*表示所有列
#update student set age=23 where name='ls' #修改，where 条件
update student set age=23 where id=2; #修改，where 条件
delete from student where id=2;#删除
#CRUD--insert,select,update,delete
show tables;#查看当前数据库的表
create table class(id int primary key,name varchar(50) COMMENT '班级名',remark varchar(100));
#COMMENT数据库的注释
set names gbk;#设置编码
#--------------------------------------------------------
create table t_group(id int primary key auto_increment,name varchar(50),remark varchar(100));
create table t_user(id int primary key auto_increment,name varchar(50),remark varchar(100),groupId int, foreign key(groupId)  references  t_group(id));
#多一端增加一个外键列
#外键：是另一张表的主键，表达表关系的
insert into t_group(name)values('技术部'),('市场部');
insert into t_user(name,groupId)values('张三',1),('李四',1),('王五',2);

select u.name,g.name from t_user as u,t_group g where u.groupId=g.id;
#as 别名
update t_group set name='研发部' where id=1;

# select 列表 from 表名 where 条件 group by 分组 having 分组条件 order by 排序 limit 分页
select * from t_user where id>1;#>,<,>=,<=,!=,=,<>
select * from t_user where id>1 and name='王五';#or 
select * from t_user where  name like '王_';#_表示一个任意字符
select * from t_user where  name like '王%';#%表示任意个任意字符
select * from t_user where  id in(1, 3);
select * from t_user where  id in (1,2,3,5);
select * from t_user where  id not in (1,3);
select * from t_user where  id between 1 and 3;#[1,3]
select * from t_user where  remark is null;
select * from t_user where  remark is not null;
select count(id),max(id),min(id),concat(avg(id),'-->',sum(id)/count(id)),sum(id) from t_user;
select groupid,count(id) from t_user group by groupid;
select g.name,count(u.id) from t_user u,t_group g where g.id=u.groupid group by u.groupid;
select g.name,t.c from t_group g,
(select groupid,count(id) c from t_user group by groupid) t #查询结果可当表用
where g.id=t.groupid;
select g.name,count(u.id) from t_user u,t_group g 
where g.id=u.groupid group by u.groupid having count(u.id)>1;#having 分组条件
select * from t_user order by id;#默认排序是升序asc，
select * from t_user order by id asc;
select * from t_user order by id desc;
select * from t_user order by groupid asc;
select * from t_user order by groupid asc,id desc;
select * from t_user limit 1,2;#分页
select * from t_user limit 2,1;
select * from t_user limit 0,1;
select * from t_user limit 1;
select * from t_user u1,t_user u2;
select u1.*,u2.* from t_user u1,t_user u2;
select u1.* from t_user u1,t_user u2 where u1.id=u2.id;#自联查询

#select 列名 from 表名  where 条件 group by 列 having 分组条件 ordery by 排序 asc|desc limit 分页


alter table t_user add column group_id int;#增加列
alter table t_user add constraint fk_ug foreign key t_user(group_id) references t_group(id);

JDBC：java对数据库的操作
show global variables like 'port';
0.导入包jar
1.注册驱动
2.获取连接对象
3.获取命令对象
4.执行命令
5.处理结果
6.释放资源


#不能用IP连接解决方法
grant all privileges on *.* to root@'%' identified by 'your root password';
grant all privileges on *.* to root@'%' identified by 'root';

反射：看通类，使用之；

HTML:“超”文本标记语言
交互
hr,h1,a:href,br,img:src
table,tr,td
form
..表上一级目录

jsp:Java Server Pages(java服务器页面),其根本是一个简化的Servlet设计，它是一种动态网页技术标准
内置对象（九个）
request请求对象(B-->S)
response响应对象(S-->B)
out输出对象
数据传递：表单，url，requestScope

重定向：地址栏地址变，数据丢失
转发：地址栏地址不变，数据保持

EL表达式${}
JSTL:jsp的标签库
javabean规范：私有属性提供get/set方法（getXxx）,提供无参构造方法

动作
指令

---
servlet:继承HttpServlet;doGet|doPost
配置web.xml:servlet&servletMapping
---
MVC:Model（javabean）-View(jsp)-Controller(servlet)
---
自定义标签库---了解
---
mybatis:
ORM:对象到关系的映射
1.导包
2.编写配置文件
	environments环境
	mappers指定映射文件 
3.编写映射文件
	namespace和DAO同名
	insert--id和DAO中的方法同名
4.使用
	SqlSessionFactory
	SqlSession
---
association
--
Spring是一个开放源代码的设计层面框架，他解决的是业务逻辑层和其他各层的松耦合问题，
因此它将面向接口的编程思想贯穿整个系统应用。Spring是一个轻量级的Java 开发框架
IOC控制反转|DI依赖注入
1.导入包
2.配置文件--bean
--
springMvc:
@Controller,@RequestMapping
前端控制器--DispatcherServlet---<url-pattern>/</url-pattern>
编写配置文件：配置文件名：要以前端控制器的名字开头+中档线+servlet
              <mvc:annotation-driven />
	      <context:component-scan base-package="com.yc" />
              视图解析器---InternalResourceViewResolver

---
	@ResponseBody
        @PathVariable
---
SSM:
web.xml
	<!-- 用参数方式配置spring配置文件的位置 -->
	<context-param>
		<param-name>contextConfigLocation</param-name>
		<param-value>classpath:spring-mybatis.xml</param-value>
	</context-param>
	<!-- 容器启动时，加载spring -->
	<listener>
		<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
	</listener>
	<servlet>
		<servlet-name>springMvc</servlet-name>
		<!-- 前端控制器 -->
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		<load-on-startup>1</load-on-startup>
	</servlet>
	<servlet-mapping>
		<servlet-name>springMvc</servlet-name>
		<url-pattern>/</url-pattern>
	</servlet-mapping>
springMvc-servlet.xml
	<!-- 解决注解的使用前提 -->
	<mvc:annotation-driven />
	<context:component-scan base-package="com.yc" />
	<!-- 视图解析器 -->
	<bean id="viewResolver"
		class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix" value="/WEB-INF/jsp/" />
		<property name="suffix" value=".jsp" />
		<!--/WEB-INF/jsp/userList.jsp -->
	</bean>
spring-mybatis.xml
	<bean id="dataSource" class="org.apache.commons.dbcp.BasicDataSource">
		<property name="driverClassName" value="com.mysql.jdbc.Driver" />
		<property name="url" value="jdbc:mysql://localhost:3306/abd" />
		<property name="username" value="root" />
		<property name="password" value="root" />
	</bean>
	<bean id="sessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
		<property name="dataSource" ref="dataSource" />
		<property name="mapperLocations" value="classpath*:com/yc/userSys/dao/*.xml" />
	</bean>
	<!-- 生成DAO实现类 -->
	<bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
		<property name="basePackage" value="com.yc.userSys.dao" />
		<property name="sqlSessionFactoryBeanName" value="sessionFactory" />
	</bean>
--
冒泡排序
--
递归
--
单例--最简单的“设计模式”
--
json ：{},[],:,,
---
比较器
---
IO
InputStream|OutputStream 
BufferedInputStream|BufferedOutputStream
DataInputStream|DataOutputStream
ObjectOutputStream|ObjectInputStream 序列化：保存对象到文件；反序列化
Serializable标识接口
transient瞬时--不参与序列化
Reader|Writer字符流
InputStreamReader字节流转字符流
FilenameFilter通过文件名过滤文件
---
多线程类：并发处理;时间片轮换
锁
死锁
生产者消费者模型
--
javascript(JS)
JavaScript是"介于Java与HTML之间、基于"对象""事件驱动"的编程语言;可以在浏览器中直接运行

---
AJAX:xmlHttpRequest
--
service层
--
正则表达式
\,^,$,*{0,},+{1,},?{0,1},{n,m} ,x|y,[xyz],[^xyz],[a-z],[^a-z],\d [0-9],\D[^0-9],\w[A-Za-z0-9_],\W 
email:"^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$" 邮件
---
 spirng : default-autowire="byName|byType"  根据名字|类型自动装配
---
jsp组成(%,!,@,--,=)
scope
el表达式取Scope范围值时：先找page范围，如果找到就显示，如果找不到会再找request范围
page<request<session<application
---
jq
---
过滤器
---
监听器
---
css:层叠样式表:定义如何显示HTML元素
语法：selector {property: value}-->h1 {color:red; font-size:14px;}

---
target:
_blank -- 在新窗口中打开链接
_parent -- 在父窗体中打开链接
_self -- 在当前窗体打开链接,此为默认值
_top -- 在当前窗体打开链接，并替换当前的整个窗体(框架页)
名称指定在框架页的位置显示
---
frameset(rows,cols),frame(src,name)
---
upload
enctype="multipart/form-data"

DiskFileItemFactory
ServletFileUpload---isMultipartContent,parseRequest
FileItem---isFormField,write
--
oa
---
验证码
---
防止重复提交
---
e
num

---
PreparedStatement:
效率；安全（注入攻击：xx' or 1=1 #）
select * from employee where loginName='xx' or 1=1 #' and password='11'



------------------------
spring
IOC(DI),AOP(事务处理)
SPRING_HOME/dist/spring.jar,SPRING_HOME/lib/log4j/log4j-1.2.14.jar,
SPRING_HOME/lib/jakarta-commons/commons-logging.jar,SPRING_HOME/lib/aspectj/*.jar
BeanFactory bf = new ClassPathXmlApplicationContext("applicationContext.xml");
spring bean的scope:singleton:默认值,prototype:取得对象不相同
了解常见属性的注入：int,String,list,set,map的注入
自定义属性编辑器:继承PropertyEditorSupport,覆盖setAsText(),将属性编辑器注入到spring中
减少spring的配置文件:
通过<bean>标签将公共的配置提取出来，然后指定<bean>标签中的abstract属性为true,在其他<bean>标签中指定其parent即可
根据名称/类型完成自动装配
------------------
AOP(Aspect Oriented  Programming)主要概念：	
Cross Cutting Concern 横切关注点（日志）：是一种独立服务，它会遍布在系统的处理流程之中
*Aspect切面：对横切性关注点的模块化（类）
*Advice通知：对横切性关注点的具体实现（要执行的动作）
*Pointcut切入点：它定义了Advice应用到哪些JoinPoint上，对Spring来说是方法调用
*JoinPoint连接点：Advice在应用程序上执行的点或时机，Spring只支持方法的JoinPoint
*Advisor:是PointCut和Advice的综合体，完整描述了一个Advice将会在PointCut所定义的位置被触发
Weave织入：将Advice应用到Target Object上的过程叫织入，Spring支持的是动态织入
Target Object：Advice被应用的对象
Proxy：Spring AOP默认使用JDK的动态代理，它的代理是运行时创建，也可以使用CGLIB代理
Introduction引用：可以动态的为类添加方法	
------------------
spring对AOP的支持（采用注解方式）
@Aspect
public class MyLog {
	@Pointcut("execution(* com.kc.spring.aop.*.add*(..))")
	public void xx() {
	}// 此方无用，让注解有依靠

	@Before("xx()")
	public void log() {
		System.out.println("MyLog");
	}
}
<beans><aop:aspectj-autoproxy />
------------------
spring对AOP的支持（采用配置方式）
	<aop:config>
		<aop:aspect id="securityAspect" ref="securityHandler">
			<aop:pointcut id="addAddMethod" expression="execution(* add*(..))"/>
			<aop:before method="checkSecurity" pointcut-ref="addAddMethod"/>
		</aop:aspect>
	</aop:config>
---------------------------------------------------------------------------------------------------------------
























