package p1;

public class Classroom {
	private String roomNumber;
	private String roomBuilding;

	public Classroom(String roomNumber, String roomBuilding) {
		this.roomNumber = roomNumber;
		this.roomBuilding = roomBuilding;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoomBuilding() {
		return roomBuilding;
	}

	public void setRoomBuilding(String roomBuilding) {
		this.roomBuilding = roomBuilding;
	}

	@Override
	public String toString() {
		return "Classroom [roomNumber=" + roomNumber + ", roomBuilding=" + roomBuilding + "]";
	}

}
