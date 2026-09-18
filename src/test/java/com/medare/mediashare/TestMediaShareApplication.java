package com.medare.mediashare;

import org.springframework.boot.SpringApplication;

public class TestMediaShareApplication {

	public static void main(String[] args) {
		SpringApplication.from(MediaShareApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
