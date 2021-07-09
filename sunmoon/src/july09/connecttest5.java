package july09;
import java.sql.*;
public class connecttest5 {

	public static void main(String[] args) {
		MemberDTO dto = new MemberDTO();
		Connection conn = new DBConnect().getconn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
			String sql = "select * from member";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				dto.setMemberid(rs.getString("memberid"));
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
			}
			System.out.println(dto);
			System.out.println(dto.getName());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
