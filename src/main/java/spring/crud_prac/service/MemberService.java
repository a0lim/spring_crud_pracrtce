package spring.crud_prac.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.crud_prac.entity.Member;
import spring.crud_prac.repository.MemberRepository;
import spring.crud_prac.repository.MemberInterfaceRepository;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class MemberService {

    private final MemberInterfaceRepository memberInterfaceRepository = new MemberRepository();

        // CREATE: 회원 가입
        public Long join(Member member){
            validateDuplicateMember(member); // 회원 이름 중복 검증
            memberInterfaceRepository.save(member);
            return member.getId();
        }
            // 회원 이름 중복 금지
        private void validateDuplicateMember(Member member) {
            memberInterfaceRepository.findByName(member.getName())
                    .ifPresent(m -> {throw new IllegalStateException("이미 존재하는 회원입니다");
        });
    }

    // READ: 전체 회원 조회

    public List<Member> findMembers(){
        return memberInterfaceRepository.findAll();
    }
    public Optional<Member> findOne(Long memberId){
        return memberInterfaceRepository.findById(memberId);
    }

    // UPDATE: 회원 수정

    // DELETE: 회원 삭제
}
