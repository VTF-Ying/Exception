# Exception
1.什么是异常
              异常:程序上的错误     分为编译时错误,和运行时错误

          Throwable
                1.Error:虚拟机错误、内存溢出、线程死锁…………
                2.Exception:是程序本身可以处理的异常,可以分为Checked Exception(编译时异常)和Unchecked Exception(运行时异常)


        2.如何处理异常
            - try-catch-finally
            -throw
            -throws
            -自定义异常
            -异常链



	异常处理机制为
	  1.抛出异常
	  2.捕获异常
		JAVA规定:
		    -对于可查异常必须捕捉、或声明抛出
		    -Unchecked Exception允许忽略不可查的RuntimeException(含子类)和Error(含子类)

	·五个异常处理关键字
		try、catch、finally、throw、throws

	try、catch、finally是一组:
		
		try     -->  执行可能出现异常的代码			  throws 		throw
		
		catch   -->  捕获异常          				     | 			  |

		finally -->  无论是否发生异常、代码总能执行 		声明可能要抛出	      手动抛出异常
									  的异常
	
	try块后面可以接零个或多个catch块，如果没有catch块则必须跟一个finally块




	 System.exit(非零数)    -->   无条件终止程序运行
	
	 finally里面不推荐return
