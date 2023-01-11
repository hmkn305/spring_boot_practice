plugins {
	java
	id("org.springframework.boot") version "3.0.1"
	id("io.spring.dependency-management") version "1.1.0"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.projectlombok:lombok:1.18.22")
	implementation("org.projectlombok:lombok:1.18.22")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	compileOnly("org.projectlombok:lombok")
	annotationProcessor("org.projectlombok:lombok")
	implementation("org.mybatis.spring.boot:mybatis-spring-boot-starter:3.0.0")
	runtimeOnly("com.h2database:h2")
	implementation("org.springframework.boot:spring-boot-starter-validation")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
