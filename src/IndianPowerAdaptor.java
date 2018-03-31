
public class IndianPowerAdaptor implements USSocketInterface {
    
	IndianSocketInterface indianSocket = null;
	
	public IndianPowerAdaptor(IndianSocketInterface indianSocket) {
		this.indianSocket = indianSocket;
	}
	@Override
	public void powerUp() {
		indianSocket.provideElectiricy();
	}

}
