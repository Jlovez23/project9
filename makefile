Menu.class: Menu.java HumanGuesser.class ComputerGuesser.class
	javac -g Menu.java

HumanGuesser.class: HumanGuesser.java
	javac -g HumanGuesser.java

ComputerGuesser.class: ComputerGuesser.java
	javac -g ComputerGuesser.java

run: Menu.class
	java Menu

debug: Menu.class
	jdb Menu
