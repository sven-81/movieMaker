# Gradle Wrapper
GRADLE := ./gradlew

.PHONY: all build run clean

# Standardziel: build + run
all: build run

# Projekt bauen (kompilieren, Abhängigkeiten laden)
build:
	$(GRADLE) build

# Main-Klasse ausführen
run:
	$(GRADLE) run

# Build-Ordner bereinigen
clean:
	$(GRADLE) clean
