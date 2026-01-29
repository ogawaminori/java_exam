package exam;

import dto.Member;
import dao.MemberDao;

/**
 * insert()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */
public class InsertMain {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();

		Member member =new Member();
		member.setId(4);
		member.setName("シロー");
		member.setAge(54);
		member.setDep_id(3);

		dao.insert(member);

		member=dao.load(4);
		System.out.println("id="+member.getId());
		System.out.println("name="+member.getName());
		System.out.println("age="+member.getAge());
		System.out.println("dep_id"+member.getDep_id());
		

		

		System.out.println("insert終了");
	}

}
