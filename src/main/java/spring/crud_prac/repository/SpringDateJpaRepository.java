package spring.crud_prac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.crud_prac.entity.Member;

import java.util.Optional;

public interface SpringDateJpaRepository extends JpaRepository<Member, Long>, CrudRepository{

    @Override
    Optional<Member> findByName(String name);
}
