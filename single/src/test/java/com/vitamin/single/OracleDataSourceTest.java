package com.vitamin.single;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class OracleDataSourceTest {

	@Inject
	@Qualifier("dataSourceOracle")
	private DataSource ds;
	
	@Test
	@Transactional(value="transactionManagerOracle", propagation = Propagation.REQUIRED, rollbackFor={Exception.class})
	public void testConnection() throws Exception {
		Connection con = ds.getConnection();

		try {
			System.out.println(con);
			
			int i = 0;
			
			PreparedStatement pstmt = con.prepareStatement("insert into t_test values('d1')");
			i = pstmt.executeUpdate();
			System.out.println(i);
			
			pstmt = con.prepareStatement("insert into t_test values('d2')");
			i = pstmt.executeUpdate();
			
			con.commit();
			System.out.println(i);
		} catch(Exception e) {
			con.rollback();
			e.printStackTrace();
		}
	}
}

