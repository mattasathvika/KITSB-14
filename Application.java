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

#feature 202 changed by subbu module
 2. Export all sources to show the full definition
        ObjectOutput oo = adminPort.exportAll(
          "source",
          null,
          "password",
          credentials,
          null,
          "en"
        );