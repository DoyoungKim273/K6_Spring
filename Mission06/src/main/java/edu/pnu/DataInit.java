package edu.pnu;

import java.util.Random;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import edu.pnu.domain.Board;
import edu.pnu.domain.Member;
import edu.pnu.persistence.BoardRepository;
import edu.pnu.persistence.MemberRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class DataInit implements ApplicationRunner {
	
	private final BoardRepository boardRepo;
	private final MemberRepository memberRepo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Member m1 = Member.builder()
				.username("user1").password("password1")
				.role("USER").build();
		memberRepo.save(m1);
		
		Member m2 = Member.builder()
				.username("user2").password("password1")
				.role("ADMIN").build();
		memberRepo.save(m2);
		
		Random rd = new Random();
		for(int i = 1; i < 5; i++) {
			boardRepo.save(Board.builder()
					.title("title1" + i)
					.content("content1" + i)
					.member(m1)
					.build()
					);
		}
		
		for(int i = 1; i < 5; i++) {
			boardRepo.save(Board.builder()
					.title("title2" + i)
					.content("content2" + i)
					.member(m2)
					.build()
					);
		}
	}
}
