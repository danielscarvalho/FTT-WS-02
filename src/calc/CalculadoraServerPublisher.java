package calc;

import java.util.Date;

import javax.xml.ws.Endpoint;

public class CalculadoraServerPublisher {
	
	//Usar Java 8
	//Teste com o browser o curl: http://127.0.0.1:9876/calc?wsdl
	//Tutorial: https://www.devmedia.com.br/desenvolvendo-e-usando-web-services-em-java/37261

  public static void main(String[] args)
  {
	System.out.println("Serving - " + new Date());
	
	//Debug - para visualizar as mensagens XML no console do Eclipse...
	System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
	System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
	System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
	System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
	System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dumpTreshold", "999999");
	
    Endpoint.publish("http://127.0.0.1:9876/calc", new CalculadoraServerImpl() );
  }
}