Visitor pattern can be used when you want to add some extra functionality
to an existing class but don't want to risk introducing the code because 
if there is some bug, it would affect the class.

In that case, you implement a visitor which accepts the class objects,
use their properties to implement the new behaviour. But given, there 
can be many implementations of the same interface for the target object,
it's better to do Dual Dispatch where you need to introduce minimal changes
in the classes to accept the visitor and call the visitor from inside the
class.

<b>Example:</b> If you want to export / serialize some objects in JSON, XML, plain text
format etc., it's better not to implement them inside the class. Rather, implement
visitors for the purpose. That way, the design will scale.