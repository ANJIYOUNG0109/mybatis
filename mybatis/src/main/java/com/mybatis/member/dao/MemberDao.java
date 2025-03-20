package com.mybatis.member.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.member.vo.Member;

public class MemberDao {


	public Member loginmember(SqlSession sqlSession, Member m) {
//		Member loginUser = sqlSession.selectOne("resultMap.loginMember", m);
//		return loginUser;
		
//		한줄로 
		return sqlSession.selectOne("memberMapper.loginMember", m);
	}

}