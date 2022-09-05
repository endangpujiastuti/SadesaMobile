
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class actlogin implements IRemote{
	public static actlogin mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public actlogin() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("actlogin"), "b4a.example.actlogin");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, actlogin.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _txtnama = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtpass = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _md = RemoteObject.declareNull("anywheresoftware.b4a.agraham.encryption.CipherWrapper.MessageDigestWrapper");
public static RemoteObject _bytecon = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
public static RemoteObject _passwordhash = null;
public static RemoteObject _epass = RemoteObject.createImmutable("");
public static RemoteObject _p = RemoteObject.createImmutable("");
public static b4a.example.main _main = null;
public static b4a.example.actopsi _actopsi = null;
public static b4a.example.modulkoneksi _modulkoneksi = null;
public static b4a.example.actberanda _actberanda = null;
public static b4a.example.actregister _actregister = null;
public static b4a.example.actlupakatasandi _actlupakatasandi = null;
public static b4a.example.starter _starter = null;
public static b4a.example.akunpenduduk _akunpenduduk = null;
  public Object[] GetGlobals() {
		return new Object[] {"actBeranda",Debug.moduleToString(b4a.example.actberanda.class),"Activity",actlogin.mostCurrent._activity,"actLupaKataSandi",Debug.moduleToString(b4a.example.actlupakatasandi.class),"actOpsi",Debug.moduleToString(b4a.example.actopsi.class),"actRegister",Debug.moduleToString(b4a.example.actregister.class),"AkunPenduduk",Debug.moduleToString(b4a.example.akunpenduduk.class),"ByteCon",actlogin.mostCurrent._bytecon,"epass",actlogin.mostCurrent._epass,"Main",Debug.moduleToString(b4a.example.main.class),"md",actlogin.mostCurrent._md,"ModulKoneksi",Debug.moduleToString(b4a.example.modulkoneksi.class),"p",actlogin.mostCurrent._p,"passwordhash",actlogin._passwordhash,"Starter",Debug.moduleToString(b4a.example.starter.class),"txtnama",actlogin.mostCurrent._txtnama,"txtpass",actlogin.mostCurrent._txtpass};
}
}