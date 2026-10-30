Menu.class: Menu.java 
	javac -g Menu.java

run: Menu.class
	java Menu

debug: Menu.class
	jdb Menu
