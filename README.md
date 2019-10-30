# Find The Celebrity

Project for technical interview

## Description
In a team of n people, a celebrity is known by everyone but he/she doesn't know anybody.


## How it works
A group of people is dancing and having good time in a party. The host, ask assistences to write their names in a list, followed
by the names of known people present in the party. In this party, there's a celebrity. The host wants to know who she/he is.

This is an example of this list:

```
michael,josh,carl,mia
mia,carl,josh
carl
josh,mia,michael,carl

```
In the example above, the celebrity is carl. He doesn't know to anyone and everybody know him.


### Rules

* This project works on console. When you compile the code, it will ask you for a path in your operative system where the txt file is located.

* Please check carefully how this document is built. Please do not repeat names in the first column on each row, and use only the names defined in the first column on each row.

* Do not use blank spaces after or before of a name or a comma.


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

# A couple of Maven commands

Once you have configured your project in your IDE you can build it from there. However if you prefer you can use maven from the command line. In that case you could be interested in this short list of commands:

* `mvn compile`: it will just compile the code of your application and tell you if there are errors
* `mvn test`: it will compile the code of your application and your tests. It will then run your tests (if you wrote any) and let you know if some fails
* `mvn install`: it will do everything `mvn test` does and then if everything looks file it will install the library or the application into your local maven repository (typically under <USER FOLDER>/.m2). In this way you could use this library from other projects you want to build on the same machine

If you need more information please take a look at this [quick tutorial](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html).

## Authors

* **Diego Gutierrez**

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.
