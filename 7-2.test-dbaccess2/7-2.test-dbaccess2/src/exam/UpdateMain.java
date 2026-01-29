package exam;

import dao.MemberDao;
import dto.Member;

/**
 * update()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */
public class UpdateMain {
	public static void main(String[] args) {
		
		MemberDao dao = new MemberDao();
		Member member =new Member();
		
		member.setAge(100);
	

		dao.update(member);

		member=dao.load(4);
		System.out.println("id="+member.getId());
		System.out.println("name="+member.getName());
		System.out.println("age="+member.getAge());
		System.out.println("dep_id"+member.getDep_id());
		

		
		System.out.println("update終了");
	}
}
