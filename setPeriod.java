// Button.java
public Button extands Actor {
  // Sets up variables to call the images    
  private GreenfootImage button_1 = new GreenfootImage("./images/period2.jpg");
  private Greenfootimage button_2 = new GreenfootImage("./images/period3.jpg");
  
  // Creates boolean that will assist in diffrentiationg between when period 2 or period 3 is set
  private boolean mouseDown;

  public Button() {
    setImage(button_1);
    mouseDown = false;
  }

  // If based on the value for the mousDown variable and wether the button was clicked or not the if statements will intiate the worlds for either of the periods
  public void act() {
    if (!mouseDown && mousePressed(this)) {  
      setImage(button_2);
      getWorld().setPeriod(3);
      //mouseDown = true; ??
    }  
    if (mouseDown && mouseClicked(this)) {
      setImage(button_1);
      getWorld().setPeriod(2);
      //mouseDown = false; ??
    }  
  }
     
}


// Student.java
public int getPeriod(){
  return this.period;
}
public void setPeriod(int period){
  this.period = period;
}

// Classroom.java
import java.io.*;

private void prepare(){
  // Manually create all objects with arbitrary positions and correct names. See python script for doing so below
  setPeriod(2);
}

private void setPeriod(int period){
	for (Object obj : getObjects(null)){
      if (((Student) obj).getPeriod() == period)
      	((Student) obj).getImage().setTransparency(0);
    }
}

// students.csv file format
first,last,period

// Python script for initializing all names

def create_code():
	with open("data.txt", "r") as file:
		with open("code.txt", "w") as writer
		for i in file.readlines():
			
JoeyHuang joeyhuang = new JoeyHuang("Joey", "Huang", row#, column#, period#);
addObject(joeyhuang, row#, column#);
joeyhuang.sitdown();