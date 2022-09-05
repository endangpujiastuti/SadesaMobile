
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

public class akunpenduduk implements IRemote{
	public static akunpenduduk mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public akunpenduduk() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("akunpenduduk"), "b4a.example.akunpenduduk");
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
		pcBA = new PCBA(this, akunpenduduk.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _lv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _search = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btnadd = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _pnlakun = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnladd = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _txtnmpengguna = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtpwd = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btnsave = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _spnnik = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static b4a.example.main _main = null;
public static b4a.example.actopsi _actopsi = null;
public static b4a.example.actlogin _actlogin = null;
public static b4a.example.modulkoneksi _modulkoneksi = null;
public static b4a.example.actberanda _actberanda = null;
public static b4a.example.actregister _actregister = null;
public static b4a.example.actlupakatasandi _actlupakatasandi = null;
public static b4a.example.starter _starter = null;
  public Object[] GetGlobals() {
		return new Object[] {"actBeranda",Debug.moduleToString(b4a.example.actberanda.class),"Activity",akunpenduduk.mostCurrent._activity,"actLogin",Debug.moduleToString(b4a.example.actlogin.class),"actLupaKataSandi",Debug.moduleToString(b4a.example.actlupakatasandi.class),"actOpsi",Debug.moduleToString(b4a.example.actopsi.class),"actRegister",Debug.moduleToString(b4a.example.actregister.class),"btnadd",akunpenduduk.mostCurrent._btnadd,"btnSave",akunpenduduk.mostCurrent._btnsave,"lv",akunpenduduk.mostCurrent._lv,"Main",Debug.moduleToString(b4a.example.main.class),"ModulKoneksi",Debug.moduleToString(b4a.example.modulkoneksi.class),"pnladd",akunpenduduk.mostCurrent._pnladd,"pnlakun",akunpenduduk.mostCurrent._pnlakun,"search",akunpenduduk.mostCurrent._search,"spnnik",akunpenduduk.mostCurrent._spnnik,"Starter",Debug.moduleToString(b4a.example.starter.class),"txtnmpengguna",akunpenduduk.mostCurrent._txtnmpengguna,"txtpwd",akunpenduduk.mostCurrent._txtpwd};
}
}