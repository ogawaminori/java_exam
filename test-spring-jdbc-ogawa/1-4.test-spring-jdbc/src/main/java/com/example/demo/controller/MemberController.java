package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Member;
import com.example.demo.repository.MemberRepository;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberRepository repository;

	@RequestMapping("")
	public String index() {
		List<Member> member=repository.findAll();
		System.out.println(member);

        System.out.println();

		Member member2=repository.load(2);
		System.out.println(member2);

		Member member3=new Member();
		member3.setName("小川未乃梨");
		member3.setAge(26);
		member3.setDepId(3);
		repository.save(member3);

        Member member4=new Member();
		member4.setId(2);
		member4.setName("シロー");
		member4.setAge(32);
		member4.setDepId(2);
		repository.save(member4);
				
		return "member";
	}

	
}
