


Flow Control
-

if ( condition ) {
	//statements
}
else {
	statements;
}

Methods
-
Syntax
<modifier>* ReturnType methodName ( parameters ) {
   //statements
 }
invoke a method
object . methodName ( parameter);
Example
account.deposit(1000);

Constructor
-
Special Method : ConstructorName == ClassName
No Return Type

Syntax:
-
<modifier>* ClassName() {
	//statements
}


<modifier>* ClassName ( TYPE parameter) {

}

Example : Parameterized Constructor
public Account(double balance) {
//		balance = balance; problem ambiguity
		this.balance = balance;
	}


//invoke a constructor
new ClassName ( argument );
Example :
account = new Account(500.00);





Primitive data types 
-
byte ( 8 bit signed )
short ( 16 bit signed)
int ( 32 bit signed)
long ( 64 bit signed)


float ( 32 bit )
double ( 64 bit )

boolean

char ( 16 bit)

Non Primitive data types
-
Sting
Arrays
Classes

create a java object
-
syntax:
ClassName identifier;
Example: 
Account account ;

Initialization :
identifier = new constructor();
account = new Account()