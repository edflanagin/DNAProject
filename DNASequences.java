public class DNASequences
{
  String patientDNA;
  String patientName;

  public DNASequences(String name, String dna)
  {
    // Your code to initialize the instances variables goes here
    }

  public boolean hasHowletts()
  {
    // Your code to test for Howlett's syndrome goes here
    // You will need to change the return statement after you test the DNA string.
    return false; 
  }

  public boolean hasParkers()
  {
    // Your code to test for Parker's syndrome goes here
    // You will need to change the return statement after you test the DNA string.
    return false;
  }

  public boolean hasBanners()
  {
    // Your code to test for Banner's syndrome goes here
    // You will need to change the return statement after you test the DNA string.
    return false;
  }

  public boolean hasDanvers()
  {
    // Your code to test for Danver's syndrome goes here
    // You will need to change the return statement after you test the DNA string.
    return false;
  }

  public boolean hasStarks()
  {
    // Your code to test for Stark's syndrome goes here 
    // You will need to change the return statement after you test the DNA string.
    return false;
  }

  public boolean hasRomanovas()
  {
    // Your code to test for Romanova's syndrome goes here
    // You will need to change the return statement after you test the DNA string.
    return false; 
  }

  public String toString()
  {
    return "\nDNA results for: " + patientName + "\n" +
    "Howlett's: " + hasHowletts() + "\n" +
    "Parker's: " + hasParkers() + "\n" +
    "Banner's: " + hasBanners() + "\n" +
    "Danver's: " + hasDanvers() + "\n" +
    "Stark's: " + hasStarks() + "\n" +
    "Romanova's: " + hasRomanovas();
  }

}