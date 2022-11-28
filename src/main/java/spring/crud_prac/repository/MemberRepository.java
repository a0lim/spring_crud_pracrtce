package spring.crud_prac.repository;// DB member 리스트 가져옴(crate에도 형태 변환 없음)

import spring.crud_prac.entity.Member;

import java.util.*;

public abstract class MemberRepository implements PracRepository {

    public static Map<Long, Member> store = new HashMap<>(); // Map에 데이터를 저장함
    public static long sequence = 0L;

    @Override
    public Member save(Member member){
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id){
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String member_name){
        return store.values().stream()
                .filter(member -> member.getName().equals(member_name))
                .findAny();
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values()); // 멤버 반환
    }
}

//package spring.crud_prac.repository;
//
//public interface MemberRepository {
//    @Query("select m from memberwhere m.id = :id")
//    Optional<> findById(@Param("id") Long Id);
//
//}