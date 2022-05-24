run-dist:
	./build/install/app/bin/app
lint:
	gradle checkstyleMain checkstyleTest
build:
	gradle clean build
clean:
	gradle clean