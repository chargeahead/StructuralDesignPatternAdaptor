
public class Tester {

	public static void main(String[] args) {
		USSocketInterface usSocket = new USSocket();
		USPowerPlug usPowerPlug = new USPowerPlug(usSocket);
		usPowerPlug.plugInAndRun();
		
		IndianSocketInterface indianSocket = new IndianSocket();
		usPowerPlug = new USPowerPlug(new IndianPowerAdaptor(indianSocket));
		usPowerPlug.plugInAndRun();
	}

}
