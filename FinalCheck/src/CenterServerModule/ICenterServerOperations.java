package CenterServerModule;


/**
* CenterServerModule/ICenterServerOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ICenterServer.idl
* Saturday, July 28, 2018 9:36:28 o'clock AM EDT
*/

public interface ICenterServerOperations 
{
  boolean createTRecord (String firstName, String lastName, String address, String phone, String specialization, String location, String managerId);
  boolean createSRecord (String firstName, String lastName, String courseRegistered, String status, String statusDate, String managerId);
  String getRecordCounts (String managerId);
  String editRecord (String recordId, String fieldName, String newValue, String managerId);
  String editListRecord (String recordId, String fieldName, String newValue, String managerId);
  boolean transferRecord (String managerId, String recordId, String targetCenterName);
  void printHashMap ();
  void killThreads ();
  void shutdown ();
} // interface ICenterServerOperations