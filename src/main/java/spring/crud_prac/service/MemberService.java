package spring.crud_prac.service;

import org.springframework.stereotype.Service;
import spring.crud_prac.entity.Member;
import spring.crud_prac.repository.MemberRepository;
import spring.crud_prac.repository.PracRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    private final PracRepository pracRepository = new MemberRepository();

        // CREATE: 회원 가입
        public Long join(Member member){
            validateDuplicateMember(member); // 회원 이름 중복 검증
            pracRepository.save(member);
            return member.getId();
        }
            // 회원 이름 중복 금지
        private void validateDuplicateMember(Member member) {
            pracRepository.findByName(member.getName())
                    .ifPresent(m -> {throw new IllegalStateException("이미 존재하는 회원입니다");
        });
    }

    // READ: 전체 회원 조회

    public List<Member> findMembers(){
        return pracRepository.findAll();
    }
    public Optional<Member> findOne(Long memberId){
        return pracRepository.findById(memberId);
    }
}
