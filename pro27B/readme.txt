��ʶ��
��������
�����
����ṹ/���̿���

����

��װ��
�����е����Ժͷ������ã���������
class,
new ���ǵ��ù��췽���ģ�
���췽��������ͬ���ķ���������ָ������ֵ����
static
��������---�����У�ͬ���ķ�����
this
��������

�̳У�
������������Ժͷ�����������̳�
������д---����Ҫ�͸���ķ���ǩ����ȫ��ͬ���������η�ֻ����������С
super
ʵ��������������Զ����츸�����
��������ã����������ܱ�������Ķ���---����ת��
���������ָ���������ʱ�����ܵ���������չ����������
������ĸ��࣬��Object
��ӡ����ʱ�����Զ����ö����toString()
equals()����д���õ���Object���Ĭ��ʵ�֣��Ƚϵ�����������ĵ�ַ��



��̬(Polymorphism)������չ�Ժ�---����ԭ��
�̳�
������д
��������ָ������Ķ���

������:
abstract���ε��࣬Ϊ������
�������п�����ʵ�ֵķ���
�����಻�ܱ�ʵ����
û�з�����ķ����ǳ��󷽷�,�ڳ������г��󷽷���Ҫabstract����
���г��󷽷�����һ���ǳ�����
�������в�һ�����г��󷽷�
һ��̳��ڳ����࣬���ࡰ���롱��ʵ�֡�������̳������ĳ��󷽷���
����ʵ�ֳ��󷽷�ֻ���Լ���ɳ����ࣨ����������岻��

�ӿڣ�
�ӿڲ���ʵ����
�ӿ��еķ��������󷽷�����������ʵ�ַ���
�ӿ��еķ������η�Ĭ��Ϊpublic abstract
��ʵ��(implements)�ӿ�ʱ��Ҫʵ�ִ˽ӿ��еġ����еġ����󷽷�
�ӿڿ��Լ̳нӿڣ��ҿ��Զ�̳нӿ�
��java���൥�̳ж�ʵ��
�ӿ��е����Զ��ǹ�����̬����--public static final
��̬�����淶��������ĸ��д,���������_����


�쳣��
���Ա������ͻȻ��ֹ���û�����ܲ��Ѻá�
try���飺���ܲ����쳣�Ĵ���
�����������쳣�����׳���Ӧ�쳣����
catch���鴦��catch�����еĲ���Ϊ���գ���׽����Ӧ�쳣�Ķ���
һ��try���Զ�Ӧ���catch
���catch˳����ӵ�����ƽ������˳��
try�в�Ҫ�Ŷ������ܲ����쳣�Ĵ��룬
catch����Ҫ�Ǿ�������
finally�����ܡ��Ƿ�����쳣��finally���鶼�ᱻִ�У�һ�������ͷ���Դ
return;//�൱�ڷ������ý�����finally��ִ��
System.exit(0);//�˳����� ��finally����ִ��
��try��һ����catch
throw�׳�Throwable�쳣����
throws���ڷ����ϣ�����ô��׳�ָ�����쳣����
 ����쳣:  ��ǰtry-cacth; ���ϼ�����
����ʱ�쳣��ûҪ��ǿ�ƴ����쳣
�Զ����쳣���̳���Throwable���͵������쳣�ࣻһ���Զ����쳣��ȥ�̳�RuntimeException
 
����Collection
�������ȱ��
List&Set
List:���򣬿��ظ�
	ArrayList�ڲ�ʵ�ֶ�������,�ŵ����Ч�ʸ�
	LinkedList�ڲ�ʵ��˫������ɾ������Ч��
Set:���򣬲����ظ�
TreeSet����
Map:Ԫ���Ǽ�-ֵ��;�������ظ�



���ݿ�MySql---��ϵ�����ݿ�
mysql.bat
cd C:\Program Files (x86)\MySQL\MySQL Server 5.5\bin
mysql.exe -uroot -proot
-----
select version();
---
#����ע��
show databases;#�鿴���ݿ�
drop database abc;#ɾ�����ݿ�--�˶�����Σ��
drop database if exists abc;#ɾ�����ݿ�--�˶�����Σ��
create database abd;#�������ݿ�
use abd;#����ĳ���ݿ�
select database();#�鿴��ǰ���ݿ�
create table student(id int primary key auto_increment,name varchar(50),age int);
����primary key:Ψһ����ÿһ����¼
desc student;#�鿴��ṹ
insert into student(name,age)values('zs',22),('ls',21);#���Ӽ�¼insert into
select * from student;#��ѯ��*��ʾ������
select name,age from student;#��ѯ��*��ʾ������
#update student set age=23 where name='ls' #�޸ģ�where ����
update student set age=23 where id=2; #�޸ģ�where ����
delete from student where id=2;#ɾ��
#CRUD--insert,select,update,delete
show tables;#�鿴��ǰ���ݿ�ı�
create table class(id int primary key,name varchar(50) COMMENT '�༶��',remark varchar(100));
#COMMENT���ݿ��ע��
set names gbk;#���ñ���
#--------------------------------------------------------
create table t_group(id int primary key auto_increment,name varchar(50),remark varchar(100));
create table t_user(id int primary key auto_increment,name varchar(50),remark varchar(100),groupId int, foreign key(groupId)  references  t_group(id));
#��һ������һ�������
#���������һ�ű�������������ϵ��
insert into t_group(name)values('������'),('�г���');
insert into t_user(name,groupId)values('����',1),('����',1),('����',2);

select u.name,g.name from t_user as u,t_group g where u.groupId=g.id;
#as ����
update t_group set name='�з���' where id=1;

# select �б� from ���� where ���� group by ���� having �������� order by ���� limit ��ҳ
select * from t_user where id>1;#>,<,>=,<=,!=,=,<>
select * from t_user where id>1 and name='����';#or 
select * from t_user where  name like '��_';#_��ʾһ�������ַ�
select * from t_user where  name like '��%';#%��ʾ����������ַ�
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
(select groupid,count(id) c from t_user group by groupid) t #��ѯ����ɵ�����
where g.id=t.groupid;
select g.name,count(u.id) from t_user u,t_group g 
where g.id=u.groupid group by u.groupid having count(u.id)>1;#having ��������
select * from t_user order by id;#Ĭ������������asc��
select * from t_user order by id asc;
select * from t_user order by id desc;
select * from t_user order by groupid asc;
select * from t_user order by groupid asc,id desc;
select * from t_user limit 1,2;#��ҳ
select * from t_user limit 2,1;
select * from t_user limit 0,1;
select * from t_user limit 1;
select * from t_user u1,t_user u2;
select u1.*,u2.* from t_user u1,t_user u2;
select u1.* from t_user u1,t_user u2 where u1.id=u2.id;#������ѯ

#select ���� from ����  where ���� group by �� having �������� ordery by ���� asc|desc limit ��ҳ


alter table t_user add column group_id int;#������
alter table t_user add constraint fk_ug foreign key t_user(group_id) references t_group(id);

JDBC��java�����ݿ�Ĳ���
show global variables like 'port';
0.�����jar
1.ע������
2.��ȡ���Ӷ���
3.��ȡ�������
4.ִ������
5.������
6.�ͷ���Դ


#������IP���ӽ������
grant all privileges on *.* to root@'%' identified by 'your root password';
grant all privileges on *.* to root@'%' identified by 'root';

���䣺��ͨ�࣬ʹ��֮��

HTML:�������ı��������
����
hr,h1,a:href,br,img:src
table,tr,td
form
..����һ��Ŀ¼

jsp:Java Server Pages(java������ҳ��),�������һ���򻯵�Servlet��ƣ�����һ�ֶ�̬��ҳ������׼
���ö��󣨾Ÿ���
request�������(B-->S)
response��Ӧ����(S-->B)
out�������
���ݴ��ݣ�����url��requestScope

�ض��򣺵�ַ����ַ�䣬���ݶ�ʧ
ת������ַ����ַ���䣬���ݱ���

EL���ʽ${}
JSTL:jsp�ı�ǩ��
javabean�淶��˽�������ṩget/set������getXxx��,�ṩ�޲ι��췽��

����
ָ��

---
servlet:�̳�HttpServlet;doGet|doPost
����web.xml:servlet&servletMapping
---
MVC:Model��javabean��-View(jsp)-Controller(servlet)
---
�Զ����ǩ��---�˽�
---
mybatis:
ORM:���󵽹�ϵ��ӳ��
1.����
2.��д�����ļ�
	environments����
	mappersָ��ӳ���ļ� 
3.��дӳ���ļ�
	namespace��DAOͬ��
	insert--id��DAO�еķ���ͬ��
4.ʹ��
	SqlSessionFactory
	SqlSession
---
association
--
Spring��һ������Դ�������Ʋ����ܣ����������ҵ���߼���������������������⣬
�����������ӿڵı��˼��ᴩ����ϵͳӦ�á�Spring��һ����������Java �������
IOC���Ʒ�ת|DI����ע��
1.�����
2.�����ļ�--bean
--
springMvc:
@Controller,@RequestMapping
ǰ�˿�����--DispatcherServlet---<url-pattern>/</url-pattern>
��д�����ļ��������ļ�����Ҫ��ǰ�˿����������ֿ�ͷ+�е���+servlet
              <mvc:annotation-driven />
	      <context:component-scan base-package="com.yc" />
              ��ͼ������---InternalResourceViewResolver

---
	@ResponseBody
        @PathVariable
---
SSM:
web.xml
	<!-- �ò�����ʽ����spring�����ļ���λ�� -->
	<context-param>
		<param-name>contextConfigLocation</param-name>
		<param-value>classpath:spring-mybatis.xml</param-value>
	</context-param>
	<!-- ��������ʱ������spring -->
	<listener>
		<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
	</listener>
	<servlet>
		<servlet-name>springMvc</servlet-name>
		<!-- ǰ�˿����� -->
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		<load-on-startup>1</load-on-startup>
	</servlet>
	<servlet-mapping>
		<servlet-name>springMvc</servlet-name>
		<url-pattern>/</url-pattern>
	</servlet-mapping>
springMvc-servlet.xml
	<!-- ���ע���ʹ��ǰ�� -->
	<mvc:annotation-driven />
	<context:component-scan base-package="com.yc" />
	<!-- ��ͼ������ -->
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
	<!-- ����DAOʵ���� -->
	<bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
		<property name="basePackage" value="com.yc.userSys.dao" />
		<property name="sqlSessionFactoryBeanName" value="sessionFactory" />
	</bean>
--
ð������
--
�ݹ�
--
����--��򵥵ġ����ģʽ��
--
json ��{},[],:,,
---
�Ƚ���
---
IO
InputStream|OutputStream 
BufferedInputStream|BufferedOutputStream
DataInputStream|DataOutputStream
ObjectOutputStream|ObjectInputStream ���л�����������ļ��������л�
Serializable��ʶ�ӿ�
transient˲ʱ--���������л�
Reader|Writer�ַ���
InputStreamReader�ֽ���ת�ַ���
FilenameFilterͨ���ļ��������ļ�
---
���߳��ࣺ��������;ʱ��Ƭ�ֻ�
��
����
������������ģ��
--
javascript(JS)
JavaScript��"����Java��HTML֮�䡢����"����""�¼�����"�ı������;�������������ֱ������

---
AJAX:xmlHttpRequest
--
service��
--
������ʽ
\,^,$,*{0,},+{1,},?{0,1},{n,m} ,x|y,[xyz],[^xyz],[a-z],[^a-z],\d [0-9],\D[^0-9],\w[A-Za-z0-9_],\W 
email:"^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$" �ʼ�
---
 spirng : default-autowire="byName|byType"  ��������|�����Զ�װ��
---
jsp���(%,!,@,--,=)
scope
el���ʽȡScope��Χֵʱ������page��Χ������ҵ�����ʾ������Ҳ���������request��Χ
page<request<session<application
---
jq
---
������
---
������
---
css:�����ʽ��:���������ʾHTMLԪ��
�﷨��selector {property: value}-->h1 {color:red; font-size:14px;}

---
target:
_blank -- ���´����д�����
_parent -- �ڸ������д�����
_self -- �ڵ�ǰ���������,��ΪĬ��ֵ
_top -- �ڵ�ǰ��������ӣ����滻��ǰ����������(���ҳ)
����ָ���ڿ��ҳ��λ����ʾ
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
��֤��
---
��ֹ�ظ��ύ
---
e
num

---
PreparedStatement:
Ч�ʣ���ȫ��ע�빥����xx' or 1=1 #��
select * from employee where loginName='xx' or 1=1 #' and password='11'



------------------------
spring
IOC(DI),AOP(������)
SPRING_HOME/dist/spring.jar,SPRING_HOME/lib/log4j/log4j-1.2.14.jar,
SPRING_HOME/lib/jakarta-commons/commons-logging.jar,SPRING_HOME/lib/aspectj/*.jar
BeanFactory bf = new ClassPathXmlApplicationContext("applicationContext.xml");
spring bean��scope:singleton:Ĭ��ֵ,prototype:ȡ�ö�����ͬ
�˽ⳣ�����Ե�ע�룺int,String,list,set,map��ע��
�Զ������Ա༭��:�̳�PropertyEditorSupport,����setAsText(),�����Ա༭��ע�뵽spring��
����spring�������ļ�:
ͨ��<bean>��ǩ��������������ȡ������Ȼ��ָ��<bean>��ǩ�е�abstract����Ϊtrue,������<bean>��ǩ��ָ����parent����
��������/��������Զ�װ��
------------------
AOP(Aspect Oriented  Programming)��Ҫ���	
Cross Cutting Concern ���й�ע�㣨��־������һ�ֶ�����������鲼��ϵͳ�Ĵ�������֮��
*Aspect���棺�Ժ����Թ�ע���ģ�黯���ࣩ
*Advice֪ͨ���Ժ����Թ�ע��ľ���ʵ�֣�Ҫִ�еĶ�����
*Pointcut����㣺��������AdviceӦ�õ���ЩJoinPoint�ϣ���Spring��˵�Ƿ�������
*JoinPoint���ӵ㣺Advice��Ӧ�ó�����ִ�еĵ��ʱ����Springֻ֧�ַ�����JoinPoint
*Advisor:��PointCut��Advice���ۺ��壬����������һ��Advice������PointCut�������λ�ñ�����
Weave֯�룺��AdviceӦ�õ�Target Object�ϵĹ��̽�֯�룬Spring֧�ֵ��Ƕ�̬֯��
Target Object��Advice��Ӧ�õĶ���
Proxy��Spring AOPĬ��ʹ��JDK�Ķ�̬�������Ĵ���������ʱ������Ҳ����ʹ��CGLIB����
Introduction���ã����Զ�̬��Ϊ����ӷ���	
------------------
spring��AOP��֧�֣�����ע�ⷽʽ��
@Aspect
public class MyLog {
	@Pointcut("execution(* com.kc.spring.aop.*.add*(..))")
	public void xx() {
	}// �˷����ã���ע��������

	@Before("xx()")
	public void log() {
		System.out.println("MyLog");
	}
}
<beans><aop:aspectj-autoproxy />
------------------
spring��AOP��֧�֣��������÷�ʽ��
	<aop:config>
		<aop:aspect id="securityAspect" ref="securityHandler">
			<aop:pointcut id="addAddMethod" expression="execution(* add*(..))"/>
			<aop:before method="checkSecurity" pointcut-ref="addAddMethod"/>
		</aop:aspect>
	</aop:config>
---------------------------------------------------------------------------------------------------------------
























