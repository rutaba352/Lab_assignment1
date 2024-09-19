

class Artist {
      private string name;
      

      public Artist(String name) {
      this.name = name;
}
       
       public String getName() {
       return name;
}
        
       public void
  displayInformation() {
        system.out.printIn("Artist: "=name);
}}
  class Artwork{
      private String title;
      private int year;
      private Artist artist;
   

      public Artwork(string title, int year, Artist artist){
          this.title = title;
          this.year = year;
          this.artist = artist;
}
    public Artwork(string title, int year){
       this(title, year, new Artist)("Ahmad"));
     

     public String getTitle() {
          return title;
}
     public void setTitle(String title) {
          this.title = title;
 }
public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year   
 = year;
    }

    public Artist getArtist() {
        return artist;
    }

    public   
 void displayInformation() {
        System.out.println("Artwork: " + title + " (" + year + ") by " + artist.getName());
    }

    public Artwork shallowCopy() {
        return new Artwork(title, year, artist);
    }

    public Artwork deepCopy() {
        return new Artwork(title, year, new Artist(artist.getName()));
    }
}

public class Main {
    public static void main(String[] args) {
        Artist artist = new Artist("Famous Artist");

        Artwork artwork1 = new Artwork("Masterpiece", 2023, artist);
        Artwork artwork2 = new Artwork("Second Artwork", 2022);

        // Encapsulation
        artwork2.setTitle("Updated Title");
        artwork2.setYear(2024);

        // Print details
        artwork1.displayInformation();
        artwork2.displayInformation();

        // Copy operations
        Artwork shallowCopy = artwork1.shallowCopy();
        Artwork deepCopy = artwork1.deepCopy();

        // Demonstrate shallow copy behavior
        artist.setName("Modified Artist");
        artwork1.displayInformation();
        shallowCopy.displayInformation();
        deepCopy.displayInformation();
    }
}








   