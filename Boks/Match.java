package Boks;

public class Match {
	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;
	//ayný siklette olanlarý dövüþtürmek için
	
	Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
		this.f1=f1;
		this.f2=f2;
		this.maxWeight=maxWeight;
		this.minWeight=minWeight;
	}
	public boolean compare() {
		return (f1.weight/f2.weight <= 1.1 && f1.weight/f2.weight >= 0.9);//siklet karþýlaþtýrmasý yaptýk
		
	}
	public boolean isWinner()//dövüþ sonu kazanan kimse onun adýný yazdýracak
	    {
	        if (f1.health == 0)
	        {
	            System.out.println(f2.name + " is the winner!");
	            return true;
	        } else if (f2.health == 0)

	        {
	            System.out.println(f1.name + " is the winner!");
	            return true;
	        }

	        return false;
	    }
	public int randomFighterSelector(){
		//dövüþe baþlayacak dövüþçüyü random seçecek metod
        double randomNumber = Math.random();
        return (randomNumber < 0.5) ? 1 : 2;
    }
	 public void printStatus()//güncel durumlarýný yazdýracak metod
	    {
	        System.out.print(f1.name + "'s remaining health is " + f1.health + " and ");
	        System.out.println(f2.name + "'s remaining health:" + f2.health);
	    }
	 public void fight()
	    {
	        if (compare())
	        {
	            if (randomFighterSelector() < 2)
	            {
	                while (1 == 1)
	                {
	                    System.out.println("\n==== NEW ROUND ====");
	                    printStatus();

	                    f2.health = f1.hit(f2);
	                    if (isWinner())
	                    {
	                        break;
	                    }

	                    f1.health = f2.hit(f1);
	                    if (isWinner())
	                    {
	                        break;
	                    }
	                }
	            } else {
	                while (1 == 1)
	                {
	                    System.out.println("\n==== NEW ROUND ====");
	                    printStatus();

	                    f1.health = f2.hit(f1);
	                    if (isWinner())
	                    {
	                        break;
	                    }

	                    f2.health = f1.hit(f2);
	                    if (isWinner())
	                    {
	                        break;
	                    }
	                }
	            }

	        } else {
	            System.out.println("Weight difference can't be more than 10%. Match is cancelled.");
	        }

	    }
	 }
