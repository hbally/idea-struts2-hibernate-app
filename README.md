##Struts2 hibernate 构建项目
1. 配置struts2
2. 使用hibernate orm 架构
3. 使用idea 工具自动映射表
4. 执行sql -> model

```

            //第一种方式-查询所有的对象参数
            String sql = "select  *  from  m_user t ";
            Query<MUser> q = session.createNativeQuery(sql,MUser.class);
            for (MUser o : q.list()) {
                System.out.println("  " + o);
            }
            //第二种方式-查询表中的某些参数
            String sql2 = "select t.no, t.age,t.name  from  m_user t ";
            NativeQuery q2 = session.createNativeQuery(sql2);
            for (Object o : q2.list()) {
                Object[] params = (Object[]) o;
                System.out.println("  no =" + params[0] + " age =" + params[1] + " name=" + params[2]);
            }
```
 