# patient-tail-cure
基于web的病人跟踪治疗系统,用于记录病人信息




系统功能需求：
1、实现病人信息采集跟踪管理；
2、实现病人病例信息跟踪管理；
3、实现病人治疗状况跟踪管理；
4、实现病人缴费情况跟踪管理；
5、实现病人出院管理。


医生：
1、查看修改个人信息；
2、治疗费用结算统计管理；
3、跟踪病人用药信息；
4、病人电子病例追踪管理；
5、病人资料追踪管理。


病人：
2、查看诊治方案信息；

    require:
           {
              localhost:8080/patientinfo/queryresults
           }
    send:
           {
               "id":病人的id
           }
3、查看修改用户信息；
    
    require:
        {
            localhost:8080/user/modifyuser
        }
    send:
       {
           "id": 用户的id  
           "age": 要修改的信息
           "sex": 要修改的信息
           "phone":要修改的信息
           "password": 要修改的信息
       }
       
   根据id查询对象信息:
   
   require:
        {
            localhost:8080/user/queryuserbyid
        }
        
        send:
        {
            "id" pation的id
        }
4、查看所有的骨科的普通医生

    require:
      {
        http://localhost:8080/doctor/querybonenomal
      }

    send:
       
       {
        无参数
       }

5.查询所有的骨科的专家

        require:
          {
            http://localhost:8080/doctor/queryboneprefessional
          }
       send:
              
          {
           无参数
           }
           
6.查询所有的牙科的普通医生

        require:
            {
              http://localhost:8080/doctor/querytoothnomal
            }
            
        send:
                      
            {
              无参数
            }
        
7.查询所有的牙科的专家

        require:
           {
             http://localhost:8080/doctor/querytoothprefessional   
           }
           
        send:
           {
             无参数
           }
        
//查询所有药品列表

localhost:8080/drug/selectdrug

    {
        无
    }
  
//查询病人的病因、治疗方案和主治医生    
localhost:8080/patientinfo/patientanddoctor

{
    无
}

//就诊
localhost:8080/user/addPatient
{
     "number": 2,
    
        "patient": {
        		"name": "张三",
        		"age": 22,
        		"sex":	0,
        		"phone": "12111111111"
        }
      ,
        "doctor":{
        	"phone": "15111111111"
        },
        "drug":{
        	"name": "阿莫西林",
        	"price": 45,
        	"factory": "富士山"
        },
    
        "pathogeny": "头晕流鼻涕",
        "result": "普通小感冒"
}

//病例
localhost:8080/patientinfo/selectallpatient

    {
        无
    }

//查看医生基本信息
localhost:8080/doctor/selectdoctor

    {
        "phone":
    }
//更改医生密码
localhost:8080/doctor/modifydoctor
    
    {
       "phone":
       "password":
    }
    
| First Header  | Second Header |
| ------------- | ------------- |
| Content Cell  | Content Cell  |
| Content Cell  | Content Cell  |
|fdhakhfkjdhfkjfhkdfh|fkadfkjhdfkkdf|