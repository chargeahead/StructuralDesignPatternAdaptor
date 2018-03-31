
public class USPowerPlug {
	
	USSocketInterface usSocketInterface;
	
	public USPowerPlug(USSocketInterface usSocketInterface) {
		this.usSocketInterface = usSocketInterface;
	}
	public void plugInAndRun() {
		usSocketInterface.powerUp();
	}
}
