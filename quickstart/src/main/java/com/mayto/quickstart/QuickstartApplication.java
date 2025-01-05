package com.mayto.quickstart;

import com.mayto.quickstart.services.ColourPrinter;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class QuickstartApplication implements CommandLineRunner {


	private ColourPrinter colourPrinter;

	public QuickstartApplication(ColourPrinter colourPrinter) {
		this.colourPrinter = colourPrinter;
	}

	public static void main(String[] args) {
		SpringApplication.run(QuickstartApplication.class, args);
	}
	@Override
	public void run(final String... args) throws Exception {
		log.info(colourPrinter.print());
	}

}
