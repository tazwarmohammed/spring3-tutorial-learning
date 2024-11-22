package com.example.demo;

import com.example.demo.entity.Instructor;
import com.example.demo.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreateDemoApplication implements CommandLineRunner {

	@Autowired
	private SessionFactory sessionFactory;

	public static void main(String[] args) {
		SpringApplication.run(CreateDemoApplication.class, args);
	}

	@Override
	public void run(String... args) {
		try (Session session = sessionFactory.getCurrentSession()) {
			InstructorDetail instructorDetail = InstructorDetail.builder()
					.hobby("Football, Coding & Lifestyle")
					.youtubeChannel("https://www.youtube.com/tazzy")
					.build();

			Instructor tempInstructor = Instructor.builder()
					.firstName("Tazwar")
					.lastName("Mohammed")
					.email("tazwarmohammed@yahoo.com")
					.instructorDetail(instructorDetail)
					.build();

			// start a transaction
			session.beginTransaction();

			// Note: this will ALSO save the details object because of CascadeType.ALL

			System.out.println("Saving instructor: " + tempInstructor);
//			session.save(tempInstructor);
			session.persist(tempInstructor);
			session.getTransaction().commit();

			System.out.println("Done!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
