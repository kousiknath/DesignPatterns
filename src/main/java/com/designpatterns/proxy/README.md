<b>Applicability</b>

There are dozens of ways to utilize the Proxy pattern. 
Let’s go over the most popular uses.

<b>Lazy initialization (virtual proxy):</b> This is when you have a heavyweight 
service object that wastes system resources by being always up, even though you 
only need it from time to time. Instead of creating the object, when the app 
launches, you can delay the object’s initialization to a time when it’s really needed. 

<b>Access control (protection proxy):</b> This is when you want only specific clients 
to be able to use the service object; for instance, when your objects are crucial parts 
of an operating system and clients are various launched applications (including 
malicious ones). The proxy can pass the request to the service object only if the 
client’s credentials match some criteria.

<B>Local execution of a remote service (remote proxy):</b> This is when the service 
object is located on a remote server. In this case, the proxy passes the client request 
over the network, handling all the nasty details of working with the network.

<b>Logging requests (logging proxy):</b> This is when you want to keep a history of 
requests to the service object. The proxy can log each request before passing it to 
the service.

<b>Caching request results (caching proxy):</b> This is when you need to cache results 
of client requests and manage the life cycle of this cache, especially if results are 
quite large.  The proxy can implement caching for recurring requests that always yield 
the same results. The proxy may use the parameters of requests as the cache keys.

<b>Smart reference:</b> This is when you need to be able to dismiss a heavyweight object 
once there are no clients that use it. The proxy can keep track of clients that obtained
a reference to the service object or its results. From time to time, the proxy may go over
the clients and check whether they are still active. If the client list gets empty, the 
proxy might dismiss the service object and free the underlying system resources.
The proxy can also track whether the client had modified the service object. Then the 
unchanged objects may be reused by other clients.