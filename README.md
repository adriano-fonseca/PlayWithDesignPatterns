# DESIGN PATTERNS

This project has as purpose to explain all design patterns with simple examples;

# SINGLETON DESIGN PATTERN

It is used when you want to eliminate the possibility of instantiation more than one object of kind.

# STRATEGY DESIGN PATTERN

The strategy pattern allow us configure class to use one of many behavior available.
In order to use composition, we need put interfaces to work in a unconventional way, having it as variable of superclass.
Through the polymorphism, we shall define a properly behavior setting which class that (implement the interface of the concept encapsulated) is responsible for supply
the behavior for one specific subclass. We will do that in the constructor method of the subclass.   

This is possible through the composite concept.


# FACACE DESIGN PATTERN

Basically FACADE is when you have a simplified "interface" and many others actions performing behind the scene;

EX: Can I withdrawal $50 from my bank account?

- Check if is active account;
- Check if the security code is valid;
- Check if there are enough founds;
- And then, make changes in balance properly;


# PROXY DESIGN PATTERN

The Proxy design pattern limits access to just the methods you want made accessible in another class.
It can be used for security reasons, because an Object is intensive to create, or is accessed from a remote location. You can think of it as a gate keeper that blocks access to another Object. 
 
# COMPOSITE DESIGN PATTERN
 
The Composite design pattern is used to structure data into its individual parts as well as represent the inner workings of every part of a larger object.
The composite pattern also allows you to treat both groups of parts in the same way as you treat the parts polymorphically. This allows your objects to maximize complexity while also remaining dynamic.

Song (concrete class) - extend the songComponent abstract class, it has name, band, release;
SongComponent (abstract class) - it is a abstract class that has all methods (add, remove, display song info, name, etc)
SongGroup (concrete class) - extend the songComponent abstract class, has the name and description of the group;
			It also has an Arraylist to receive SongComponent which as we know
			is implemented for Song which have an ArrayList.
DiscJockey - this class is going to be a songList(SongComponent);

In our example code  we will have:
	IndustrialMusic {music A, music B and DubstepMusic{music C, music D)}

See the code:
```java	
	SongComponent everySong = new SongGroup("Song List", "Every Song Available");
	SongComponent industrialMusic = new SongGroup("\nIndustrialMusic",  "is a genre ...");
    SongComponent dubstepMusic = new SongGroup("\nDubstep",  "is a genre ...");
    
    /*Receive Song*/
    industrialMusic.add(new Song("Headhunter", "Front 242", 1988));
   
    /*Receive SoundGroup*/
    industrialMusic.add(dubstepMusic);
    everySong.add(industrialMusic);
    DiscJockey crazyLarry = new DiscJockey(everySong);
```    

See the constructor sighnature of DiscJockey.


```java	 	
     public DiscJockey(SongComponent newSongList)
```     

	
This is only possible because through the polymorphism we have used Composite Design Pattern. 
 
# Chain of Responsibility Design Pattern

It is used in order to avoid bunch of if else blocks. Basically we are going to have classes responsible to handle
with a specific problem and if it was not capable to resolve that, it will past the problem for the next member of the chain.  Here it was implemented using an interface, but we could use one abstract class though.

# Visitor Design Pattern

The Visitor design pattern allows you to add methods to classes of different types without much altering to those classes. You can make completely different methods depending on the class used with this pattern.

# Builder Design Pattern

The Builder pattern has variants, but as it was implemented here could be used instead to have a lot of different constructors. Its a good way to protected the object from changes after it has been build.

