package cn.tedu.sample;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleApplicationTests {

	@Test
	public void contextLoads() {
		
	}
	
	@Autowired  //自动装配=getBean()获取里面的值
	DataSource dataSource;
	
    @Test
    public void getConnection() throws SQLException {//获取数据库连接
    	Connection conn = dataSource.getConnection();
    	System.err.println("conn"+conn);
    }//Project clean 最多clean3次
	
}









