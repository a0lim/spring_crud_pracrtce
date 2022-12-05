package spring.crud_prac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import spring.crud_prac.entity.Member;

import java.util.List;
import java.util.Optional;

@Repository
public interface SpringDateJpaMemberRepository extends JpaRepository<Member, Long>, MemberInterfaceRepository { // JpaRepository: 자동으로 기본 메서드를 제공

    @Query("select m from Member m where m.name = :name")
    Optional<Member> findByName(@Param("name") String name);

}





/////////////////////////

//    public Member save(Member member) {
//        em.persist(member); // JPA가 insert 쿼리 작성/실행 + setID 실행
//        return member;
//    }
//
//
//    public Optional<Member> findById(Long id) {
//        Member member = em.find(Member.class, id); // 조회할 타입 + 식별자(PK) -> 조회
//        return Optional.ofNullable(member); // 결과값이 없을 수 있음
//    }
//
//    public List<Member> findAll() {
//        return em.createQuery("select m from Member m", Member.class).getResultList(); // qlString: jpql 쿼리 언어 -> 객체를 대상으로 쿼리 생성
//    }
//
//    public Optional<Member> findByName(String name) {
//        List<Member> result = em.createQuery("select m from Member m where m.name = :name", Member.class)
//                .setParameter("name", name)
//                . getResultList();
//
//        return result.stream().findAny();