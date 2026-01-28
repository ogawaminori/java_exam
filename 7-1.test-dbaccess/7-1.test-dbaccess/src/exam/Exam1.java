import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exam1 {
    public static void main(String[] args) {
		// 接続情報
		String url = "jdbc:postgresql://localhost:5432/student";
		String user = "postgres";
		String password = "000_minori";

		Connection con = null; // 使用する変数の宣言
		PreparedStatement pstmt = null;
		String sql = null;

		try {
			// (1)データベースに接続
			con = DriverManager.getConnection(url, user, password);

			// (2)SQL文を作成
			sql = "INSERT INTO test_members (id,name,age,dep_id) VALUES (1,'山田太郎',62,1);"
                 +"INSERT INTO test_members (id,name,age,dep_id) VALUES (2,'佐藤花子',33,2);"
                 +"INSERT INTO test_members (id,name,age,dep_id) VALUES (3,'遠藤次郎',55,2);";

			// (3)SQL実行準備
			pstmt = con.prepareStatement(sql);

			// (4)SQL実行
            int a =pstmt.executeUpdate();
			// ※ここにSQL実行処理を書く

			// (5)結果の操作
            System.out.println(a+"件のデータを操作しました");
			// ※ここに結果の操作処理を書く

		} catch (SQLException ex) {
			System.err.println("SQL = " + sql);
			ex.printStackTrace();
		} finally {
			try {
				// (6) メモリの解放(切断)
                if(con!=null){
				con.close();}
                if(pstmt!=null){
				pstmt.close();}
			} catch (SQLException e) {
                e.printStackTrace();
            }
		}
	}
    
}
