package kr.ac.gachon.shop.repository;

import kr.ac.gachon.shop.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByEmail(String email);
    //멤버 repository라고라고라고라고라고라고라고
}