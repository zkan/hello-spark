// VALUES are immutable constants
val hello: String = "Hola!"

// VARIABLES are mutable
var helloThere: String = hello
helloThere = hello + " There!"
println(helloThere)

val numberOne: Int = 1

print(helloThere + " " + numberOne)

print(f"Number one is $numberOne%05d")
print(s"Number one is $numberOne%05d")