package sd;
class Plant  
{  
  public int height;
  public int diameter;
  public Plant(int height, int diameter) {
	// TODO Auto-generated constructor stub
	  this.height = height; 
      this.diameter = diameter; 
}


  public void growth(int increment) 
  { 
      height+= increment; 
  } 
  public String outcome()  
  { 
      return("The height is:"+ height 
              +"\n"
              + "The diameter is:"+diameter); 
  }  
} 

//derived class 
class Maple extends Plant 
{ 
    
  // Maple adds one field
  public int weight; 
  public Maple(int height,int diameter, int weight ) 
  { 
      super(height,diameter); 
      this.weight=weight;
  }  
       
  public void setweight(int weight) 
  { 
      this.weight=weight; 
  }  
    
  @Override
  public String outcome() 
  { 
      return (super.outcome()+ 
              "\nplant weight is "+this.weight); 
  } 
    
} 


//driver class 
public class Test_Interitance  
{ 
  public static void main(String args[])  
  { 
        
      Maple maple1 = new Maple(100, 10, 25); 
      System.out.println(maple1.outcome()); 
            
  } 
} 

