package kcp.spring.beans;

public class DTDC implements Courier {
    public DTDC() {
	System.out.println("DTDC 0 param constructor");
    }

    @Override
    public String deliver(int orderID) {
	
	return "DTDC is ready to order "+orderID;
    }

}
