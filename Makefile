GRADLE := ./gradlew
JAVA := java

.PHONY: all build run clean

# Standardziel: build + run
all: build run

# Projekt bauen (kompilieren, Abhängigkeiten laden)
build:
	$(GRADLE) build

# Main-Klasse ausführen
run:
	$(GRADLE) run

# Jar erstellen und ausführen
shadow:
	$(GRADLE) shadowJar
	$(JAVA) -jar build/libs/movieMaker-all.jar

# Build-Ordner bereinigen
clean:
	$(GRADLE) clean
