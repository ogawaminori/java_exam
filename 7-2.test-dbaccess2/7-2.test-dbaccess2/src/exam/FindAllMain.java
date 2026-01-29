package exam;

import java.util.List;

import dao.MemberDao;
import dto.Member;

/**
 * findAll()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */
public class FindAllMain {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();

		List<Member> memberlist =dao.findAll(1);
		for (Member name:memberlist){
			System.out.println(name);
		}

		List<Member> memberlist2 =dao.findAll(2);
		for (Member name:memberlist2){
			System.out.println(name);
		}

		List<Member> memberlist3 =dao.findAll(3);
		for (Member name:memberlist3){
			System.out.println(name);
		}


	

	}

}
