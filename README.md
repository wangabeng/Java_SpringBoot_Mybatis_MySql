# SpringBoot_Mybatis_MySql
Spring-boot+Mybatis+Maven+MySql搭建实例

# 报错org.apache.ibatis.binding.BindingException: Invalid bound statement (not found): com.ui.toto.toto.dao.UserDao.selectUserById  
出现原因   
application.properties配置文件错误  
```
// mybatis.mapper-locations。classpath=com/ui/toto/toto/mapper/*.xml 修改为
mybatis.mapper-locations=classpath:com/ui/toto/toto/mapper/*.xml
```

# 异常处理demo参考
http://www.imooc.com/article/260354