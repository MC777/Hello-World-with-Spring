package io.github.mc777.Hello.World.with.Spring.lang;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LangRepository extends JpaRepository<Lang, Integer> {
    List<Lang> findByCodeAndWelcomeMsg(String code, String msg);
}