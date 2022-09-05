
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

public class actopsi implements IRemote{
	public static actopsi mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public actopsi() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("actopsi"), "b4a.example.actopsi");
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
		pcBA = new PCBA(this, actopsi.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _admindesa = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _warga = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static b4a.example.main _main = null;
public static b4a.example.actlogin _actlogin = null;
public static b4a.example.modulkoneksi _modulkoneksi = null;
public static b4a.example.actberanda _actberanda = null;
public static b4a.example.actregister _actregister = null;
public static b4a.example.actlupakatasandi _actlupakatasandi = null;
public static b4a.example.starter _starter = null;
public static b4a.example.akunpenduduk _akunpenduduk = null;
  public Object[] GetGlobals() {
		return new Object[] {"actBeranda",Debug.moduleToString(b4a.example.actberanda.class),"Activity",actopsi.mostCurrent._activity,"actLogin",Debug.moduleToString(b4a.example.actlogin.class),"actLupaKataSandi",Debug.moduleToString(b4a.example.actlupakatasandi.class),"actRegister",Debug.moduleToString(b4a.example.actregister.class),"AdminDesa",actopsi.mostCurrent._admindesa,"AkunPenduduk",Debug.moduleToString(b4a.example.akunpenduduk.class),"Main",Debug.moduleToString(b4a.example.main.class),"ModulKoneksi",Debug.moduleToString(b4a.example.modulkoneksi.class),"Starter",Debug.moduleToString(b4a.example.starter.class),"Warga",actopsi.mostCurrent._warga};
}
}