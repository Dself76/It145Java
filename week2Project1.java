package dogClass;

public class week2Project1 {

	public static void main(String[] args) {
		// TODO generated( not sure if I should put this in the notes(TODO), i don't think anyone else is working on it)
Dog myDog = new Dog();
        
       
        myDog.setPetName("Buddy");
        myDog.setPetAge(3);
        
        System.out.println("Dog's Name: " + myDog.getPetName());
        System.out.println("Dog's Age: " + myDog.getPetAge());
    }
    
    // Nested Dog class
    static class Dog {
        // Attributes and variables 
        private String petType;
        private String petName;
        private int petAge;
        private int dogSpaces;
        private int daysStay;
        private double amountDue;
        private int dogSpaceNumber;
        private double dogWeight;
        private boolean grooming;

        // Constructor that initializes values for the attributes
        public Dog() {
            petType = "";
            petName = "";
            petAge = 0;
            dogSpaces = 0;
            daysStay = 0;
            amountDue = 0.0;
            dogSpaceNumber = 0;
            dogWeight = 0.0;
            grooming = false;
        }

        // Accessors and mutators for all attributes
        public String getPetType() {
            return petType;
        }

        public void setPetType(String petType) {
            this.petType = petType;
        }

        public String getPetName() {
            return petName;
        }

        public void setPetName(String petName) {
            this.petName = petName;
        }

        public int getPetAge() {
            return petAge;
        }

        public void setPetAge(int petAge) {
            this.petAge = petAge;
        }

        public int getDogSpaces() {
            return dogSpaces;
        }

        public void setDogSpaces(int dogSpaces) {
            this.dogSpaces = dogSpaces;
        }

        public int getDaysStay() {
            return daysStay;
        }

        public void setDaysStay(int daysStay) {
            this.daysStay = daysStay;
        }

        public double getAmountDue() {
            return amountDue;
        }

        public void setAmountDue(double amountDue) {
            this.amountDue = amountDue;
        }

        public int getDogSpaceNumber() {
            return dogSpaceNumber;
        }

        public void setDogSpaceNumber(int dogSpaceNumber) {
            this.dogSpaceNumber = dogSpaceNumber;
        }

        public double getDogWeight() {
            return dogWeight;
        }

        public void setDogWeight(double dogWeight) {
            this.dogWeight = dogWeight;
        }

        public boolean getGrooming() {
            return grooming;
        }

        public void setGrooming(boolean grooming) {
            this.grooming = grooming;
        }
	}

}
