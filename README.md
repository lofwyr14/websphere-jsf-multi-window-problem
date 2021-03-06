# websphere-jsf-multi-window-problem

Code example to validate a problem with multi-windows / multi-tabs in JSF applications.

> **update 2018-08-22: solved**
>
> There is fix from IBM at  
> http://www-01.ibm.com/support/docview.wss?uid=swg1PI27290
> 
> insert this into the web.xml
<pre>
  &lt;context-param>
    &lt;param-name>com.ibm.ws.jsf.enableRemoveRestoredViewState&lt;/param-name>
    &lt;param-value>true&lt;/param-value>
  &lt;/context-param>
</pre>


Build with:
* Java Version: 1.8.0_162
* Apache Maven: 3.5.3

```
$ mvn clean package tomee:run
```

Browse this URL: [http://localhost:8080/]()

Follow the instructions on that page. 
The sources can be found under /src/main/webapp/index.html

With that TomEE setup there should be no problem.

To test the application with Websphere, 
please deploy it on Websphere 8.5.5.x under 
e.g. the context-path /demo.

If you have no Websphere, but have Docker use this command:

```
echo "password" >PASSWORD
docker run --name was -h was -v $(pwd)/PASSWORD:/tmp/PASSWORD -p 9043:9043 -p 9443:9443 -d ibmcom/websphere-traditional:8.5.5.13-profile
```
 
(For more information see [https://hub.docker.com/r/ibmcom/websphere-traditional/]()) 
 
browse this URL: [https://localhost:9443/demo/]()
