package CenterServerModule;


/**
* CenterServerModule/_ICenterServerStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ICenterServer.idl
* Saturday, July 28, 2018 9:36:28 o'clock AM EDT
*/

public class _ICenterServerStub extends org.omg.CORBA.portable.ObjectImpl implements CenterServerModule.ICenterServer
{

  public boolean createTRecord (String firstName, String lastName, String address, String phone, String specialization, String location, String managerId)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("createTRecord", true);
                $out.write_string (firstName);
                $out.write_string (lastName);
                $out.write_string (address);
                $out.write_string (phone);
                $out.write_string (specialization);
                $out.write_string (location);
                $out.write_string (managerId);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return createTRecord (firstName, lastName, address, phone, specialization, location, managerId        );
            } finally {
                _releaseReply ($in);
            }
  } // createTRecord

  public boolean createSRecord (String firstName, String lastName, String courseRegistered, String status, String statusDate, String managerId)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("createSRecord", true);
                $out.write_string (firstName);
                $out.write_string (lastName);
                $out.write_string (courseRegistered);
                $out.write_string (status);
                $out.write_string (statusDate);
                $out.write_string (managerId);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return createSRecord (firstName, lastName, courseRegistered, status, statusDate, managerId        );
            } finally {
                _releaseReply ($in);
            }
  } // createSRecord

  public String getRecordCounts (String managerId)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getRecordCounts", true);
                $out.write_string (managerId);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getRecordCounts (managerId        );
            } finally {
                _releaseReply ($in);
            }
  } // getRecordCounts

  public String editRecord (String recordId, String fieldName, String newValue, String managerId)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("editRecord", true);
                $out.write_string (recordId);
                $out.write_string (fieldName);
                $out.write_string (newValue);
                $out.write_string (managerId);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return editRecord (recordId, fieldName, newValue, managerId        );
            } finally {
                _releaseReply ($in);
            }
  } // editRecord

  public String editListRecord (String recordId, String fieldName, String newValue, String managerId)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("editListRecord", true);
                $out.write_string (recordId);
                $out.write_string (fieldName);
                $out.write_string (newValue);
                $out.write_string (managerId);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return editListRecord (recordId, fieldName, newValue, managerId        );
            } finally {
                _releaseReply ($in);
            }
  } // editListRecord

  public boolean transferRecord (String managerId, String recordId, String targetCenterName)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("transferRecord", true);
                $out.write_string (managerId);
                $out.write_string (recordId);
                $out.write_string (targetCenterName);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return transferRecord (managerId, recordId, targetCenterName        );
            } finally {
                _releaseReply ($in);
            }
  } // transferRecord

  public void printHashMap ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("printHashMap", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                printHashMap (        );
            } finally {
                _releaseReply ($in);
            }
  } // printHashMap

  public void killThreads ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("killThreads", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                killThreads (        );
            } finally {
                _releaseReply ($in);
            }
  } // killThreads

  public void shutdown ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("shutdown", false);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                shutdown (        );
            } finally {
                _releaseReply ($in);
            }
  } // shutdown

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:CenterServerModule/ICenterServer:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _ICenterServerStub
