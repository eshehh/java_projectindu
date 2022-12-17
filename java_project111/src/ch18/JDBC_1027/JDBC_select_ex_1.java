package ch18.JDBC_1027;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_select_ex_1 {
	 public static void main(String[] args) {
		 // driver 는 오라클이라는 회사에서 제공해주는데 우리는 샘플로 ojdbc8_g.jar 파일을 이용함.
		 // jar 파일은 압축 파일이고, 확장자를 zip 로 고쳐서 안에 들어가보면, 
		 // 폴더 구조가 나옵니다. oracle(폴더) -> jdbc (폴더) -> driver(폴더) 에 OracleDriver 파일이 있습니다.
		 String driver = "oracle.jdbc.driver.OracleDriver";   // 12행 ~ 15행 데이터베이스 접속을 위한 4가지 정보를 String  변수에  저장.
		 
		 // 디비 서버의 위치를 적습니다. 기본은 자기 컴퓨터 주소인 localhost = 127.0.0.1(루프백주소) = cmd ipconfig 를 통해서 주소를
		 // 확인해도 됩니다. 그리고, 만약, 여러분이 외부 디비 서버를 사용한다면, aws, google, oracle 제공하는 외부 서버 주소 사용시에도 
		 // 여기에 작성 합니다. 
		 String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		 String url = "jdbc:oracle:thin:@10.100.102.21:1521:xe";
		 
		 //유저, 패스워드, 디비서버에 있는 계정을 사용합니다. 
		 String userid = "scott";
		 String passwd = "tiger";
		 
		 // 각 인터페이스를 간략히 소개. 
		 //  디비를 연결하기위한 인스턴스.
		 // PreparedStatement : 해당 sql 문장을 전달하기 위한 인스턴스
		 // ResultSet : 조회한 테이블의 내용을 담기 위한 인스턴스 : 1행 단위로 읽어서 해당 컬럼(열)을 불러옵니다.
		 // 여러 데이터를 받는 그릇정도 보시면 됩니다. 
		 Connection con = null;
		 PreparedStatement pstmt = null;
		 ResultSet rs = null;
		 try {
			 Class.forName(driver);
			 //명시된 드라이버 클래스를 메모리에 로딩한다. 
			 con = DriverManager.getConnection(url, userid, passwd); 
			 // DriverManager 클래스의 getConnection() 메소드를 이용해서
//			 Connection 객체를 얻는다. 
			 
			 //여기 이부분이 계속 변경 되어서 확인 들어갑니다.
			 String query = "SELECT deptno,dname,loc FROM dept";
			 //요청할 SQL  문을 String 변수에 저장한다.
			 
			 
			 pstmt =con.prepareStatement(query); 
			 //SQL 문 전송에 필요한 PreparedStatement 객체를 
			 //Connection 객체의 preparedStatement(sql)메소드를 이용해서 얻는다. 
			 
			 
			 // 이부분이 추가,수정, 삭제시 executeUpdate 로 변경됨. 
			 rs = pstmt.executeQuery(); 
			 //SELECT 문을 요청하기 때문에 executeQuery()
//			 메소드를 사용하며 결과는 ResultSet 객체로 받는다.
			 while(rs.next()) {
				 int deptno = rs.getInt("deptno");
				 String dname = rs.getString("dname");
				 String loc = rs.getString("loc");
				 System.out.println(deptno + " " + dname + " " + loc);
			 }
		 }catch(Exception e) {
			 e.printStackTrace();
		 }finally {
			 try {
				 if (rs != null) rs.close();
				 if (pstmt != null) pstmt.close();
				 if ( con != null) con.close();
			 }catch(SQLException e){
				 e.printStackTrace();
			 }
		 }
			 }
		}