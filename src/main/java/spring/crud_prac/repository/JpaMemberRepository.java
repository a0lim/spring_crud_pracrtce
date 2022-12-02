package spring.crud_prac.repository;

import spring.crud_prac.entity.Member;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class JpaMemberRepository<M, L extends Number> implements MemberInterfaceRepository {

    private final EntityManager em; // Raw JPA: EntityManager를 주입받아 사용

    public JpaMemberRepository(EntityManager em){
        this.em = em;
    }


    public Member save(Member member) {
        em.persist(member); // JPA가 insert 쿼리 작성/실행 + setID 실행
        return member;
    }


    public Optional<Member> findById(Long id) {
        Member member = em.find(Member.class, id); // 조회할 타입 + 식별자(PK) -> 조회
        return Optional.ofNullable(member); // 결과값이 없을 수 있음
    }

    public List<Member> findAll() {
        return em.createQuery("select m from Member m", Member.class).getResultList(); // qlString: jpql 쿼리 언어 -> 객체를 대상으로 쿼리 생성
    }

    public Optional<Member> findByName(String name) {
        List<Member> result = em.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name", name)
                . getResultList();

        return result.stream().findAny();
    }
}
