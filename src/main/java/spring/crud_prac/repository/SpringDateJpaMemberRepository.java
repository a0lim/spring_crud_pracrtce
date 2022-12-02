package spring.crud_prac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.crud_prac.entity.Member;

import java.util.Optional;

public interface SpringDateJpaMemberRepository extends JpaRepository<Member, Long>, MemberInterfaceRepository { // JpaRepository: 자동으로 기본 메서드를 제공

    @Override
    Optional<Member> findByName(String name);
}
