public interface DogInterface
{
    public String getBreed();

    public void setBreed(String breed);

    public int getName();

    public void setName(int name);

    public String getColor();

    public void setColor(String color) ;

    public boolean isHungry();

    public void setHungry(boolean hungry) ;

    public void eat();

    public String bark(String sound);
}
