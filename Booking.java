public class Booking {
	protected Room rm;
	protected String time;
	protected int nbrReg;
	protected int nbrHandy;
	int count;
	
	public Booking(Room rm, String time, int nbrReg, int nbrHandy) {
		this.rm = rm;
		this.time = time;
		this.nbrReg = nbrReg;
		this.nbrHandy = nbrHandy;
		count = 0;
	}
	public Room getRoom() {
		return this.rm;
	}
	
	public String getTime() {
		return this.time;
	}
	public int getnbrReg() {
		return this.nbrReg;
	}
	public int getnbrHand() {
		return this.nbrHandy;
	}
	
	public Room getSeats() {
		for(int i = 0; i < rm.getSeatList().length; i++) {
			for(int j = 0; j < rm.getSeatList()[i].length; j++) {
				if(rm.getSeatList()[i][j].equals("[ ]")){
					count++;
					if(count == nbrReg + nbrHandy) {
						
					}
				}
				else {
					count = 0;
				}
			}
		}
		return rm;
		
	}
}