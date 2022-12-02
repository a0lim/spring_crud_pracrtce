package spring.crud_prac.repository;

import spring.crud_prac.entity.Member;

import java.util.List;
import java.util.Optional;

public interface MemberInterfaceRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String member_name);
    List<Member> findAll();
}
