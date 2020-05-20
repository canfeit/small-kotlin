import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.3.0.RELEASE"
	id("org.jetbrains.kotlin.jvm") version "1.3.70"
	id("org.jetbrains.kotlin.plugin.spring") version "1.3.70"
}

repositories {
	mavenCentral()
}


dependencies {
    compile("org.springframework.boot:spring-boot-starter-web:2.3.0.RELEASE")
    compile("org.springframework.boot:spring-boot-starter-webflux:2.3.0.RELEASE")
    compile("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.70")
    compile("org.jetbrains.kotlin:kotlin-reflect:1.3.70")
    testCompile("org.springframework.boot:spring-boot-starter-test:2.3.0.RELEASE")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		jvmTarget = "1.8"
		freeCompilerArgs = listOf("-Xjsr305=strict")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
