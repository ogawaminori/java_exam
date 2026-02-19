package com.example.demo.domain;

/**
 * メンバー情報を表すドメイン.
 * 
 * @author igamasayuki
 *
 */
public class Member {
	private Integer id;
	private String name;
	private Integer age;
	private Integer depId;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getDepId() {
		return depId;
	}
	public void setDepId(Integer depId) {
		this.depId = depId;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", age=" + age + ", depId=" + depId + "]";
	}

	




	/** ID */
	
	/** 名前 */
	
	/** 年齢 */
	
	/** 部署ID */


}
