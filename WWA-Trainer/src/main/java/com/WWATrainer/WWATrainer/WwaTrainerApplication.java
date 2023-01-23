package com.WWATrainer.WWATrainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.sql.*;

@SpringBootApplication
@RestController
public class WwaTrainerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WwaTrainerApplication.class, args);
	}
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {

		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\tommu\\Desktop\\COURS\\Projet_Pokemon\\WWA-Trainer\\TRAINERS.db");
			c.setAutoCommit(false);
			System.out.println("Opened database successfully");

			stmt = c.createStatement();
			String sql = "INSERT INTO Trainers (idTrainer,idTeam,idEgg,Name,Type,pokeDollars) " +
					"VALUES (1, 2, 3, 'cacaman', 0, 12123 );";
			System.out.println("test");
			stmt.executeUpdate(sql);
//
//			sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " +
//					"VALUES (2, 'Allen', 25, 'Texas', 15000.00 );";
//			stmt.executeUpdate(sql);
//
//			sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " +
//					"VALUES (3, 'Teddy', 23, 'Norway', 20000.00 );";
//			stmt.executeUpdate(sql);
//
//			sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " +
//					"VALUES (4, 'Mark', 25, 'Rich-Mond', 65000.00 );";
//			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
		} catch ( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
		System.out.println("Records created successfully");
		return String.format("Hello %s!", name);
	}

	}

