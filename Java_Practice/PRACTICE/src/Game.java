public class Game {
    private int power, blood;
    private boolean alive;
    public Game(int power, int blood, boolean alive) {
        this.power = power;
        this.blood = blood;
        this.alive = alive;
    }
    
    public String toString(){
        String res="";
        if(this.alive) res = "ALIVE";
        else res = "DEAD";
        return "POWER : "+ this.power +"\nBLOOD : "+ this.blood+ "\n"+res+"\n----------\n";
    }

    public void mushroom(){
        if(this.alive){
            this.power-=2;
            this.blood-=15;
            if (this.power<=0 || this.blood<=0){
                this.power = 0;
                this.blood = 0;
                this.alive = false;
            }
        }
    }

    public void witch(int power){
        if (this.alive){
            if(this.power <= power){
                this.power = 0;
                this.blood = 0;
                this.alive = false;
            }
        }
        else{
            this.power +=5;
        }
    }

    public void pea(){
        if(this.alive){
            this.blood+=10;
            this.power+=2;
        }
    }

    public void soldier(int power){
        if(this.alive){
            if(this.power <= power){
                this.power=0;
                this.blood=0;
                this.alive=false;
            }
            else {
                this.blood+=5; 
                this.power+=7;
            }
        }
    }
}
