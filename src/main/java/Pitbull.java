public class Pitbull implements DogInterface
{
    private String breed;
    private int name;
    private String color;
    private boolean hungry;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public void eat()
    {
        if(hungry == true)
        {
            System.out.println("Dog says thanks for the food");
            hungry = false;
        }

        else
        {
            System.out.println("Dog already ate dog is not hungry");
            hungry = true;

        }
    }

    public String bark(String sound)
    {
        return sound + " " + sound + " " + sound;
    }
}
