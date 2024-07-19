
public class CreateWebSource
{
  public static void main(String[] args) throws Exception
  {
    System.out.println( "" );
 
    try
    {
      if ( args == null || args.length != 4 )
      {
        System.out.println(
          "Usage:\n  CreateWebSource <webServiceURL> <userName> <password> <webSourceURL>"

#feature201 changed by sathvi
adminPort.createAll(
          "source",
          webSourceXML,
          "password",
          credentials,
          null,
          null,
          "en" 
        );#end feature201 