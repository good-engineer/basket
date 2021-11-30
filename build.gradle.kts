import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "com.maryland"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

// QueryDSL directory configurations
val querydslGeneratedDir = "$buildDir/generated"
val querydslOutputSubDirFull = "$querydslGeneratedDir/source/kapt"
val querydslKtOutputSubDirFull = "$querydslGeneratedDir/source/kaptKotlin"


plugins {
	id("org.springframework.boot") version "2.6.0"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	id("org.jmailen.kotlinter") version "3.7.0" // https://github.com/jeremymailen/kotlinter-gradle/releases
	id("io.gitlab.arturbosch.detekt") version "1.19.0-RC1" // https://github.com/detekt/detekt/releases
	id("org.jetbrains.dokka") version "1.5.31" // https://github.com/Kotlin/dokka/releases
	id("org.jetbrains.kotlin.plugin.allopen") version "1.6.0" // https://plugins.gradle.org/plugin/org.jetbrains.kotlin.plugin.allopen
	kotlin("jvm") version "1.6.0"
	kotlin("plugin.spring") version "1.6.0"
	kotlin("plugin.jpa") version "1.6.0"
	kotlin("plugin.serialization") version "1.6.0"
	kotlin("kapt") version "1.6.0"
}


repositories {
	mavenCentral()
}

dependencies {
	implementation ("io.jsonwebtoken:jjwt:0.9.1")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.1") // https://github.com/Kotlin/kotlinx.serialization
	implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2") // https://github.com/Kotlin/kotlinx.coroutines
	implementation("com.querydsl:querydsl-jpa:4.4.0")

	implementation ("org.springframework.boot:spring-boot-starter-security")
	implementation ("org.springframework.security:spring-security-test")
	runtimeOnly("mysql:mysql-connector-java")
	testImplementation("org.springframework.boot:spring-boot-starter-test")

	kapt("com.querydsl:querydsl-apt:4.4.0:jpa")
	kapt("org.hibernate.javax.persistence:hibernate-jpa-2.1-api:1.0.2.Final")


}

sourceSets {
	main {
		java {
			srcDir(querydslOutputSubDirFull)
			srcDir(querydslKtOutputSubDirFull)
		}
	}
}

allOpen {
	annotation("com.maryland.basket.AllOpen")
}

kotlinter {
	ignoreFailures = false
	indentSize = 4
	reporters = arrayOf("checkstyle", "plain")
	experimentalRules = false
	disabledRules = arrayOf("no-wildcard-imports") // IDEA compatibility
}

detekt {
	buildUponDefaultConfig = true // preconfigure defaults
	allRules = false // activate all available (even unstable) rules.
	config = files("$projectDir/src/main/resources/detekt/detekt.yml")
	baseline = file("$projectDir/src/main/resources/detekt/baseline.xml")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
